package br.dc.compiladores.alguma.semantico;

import br.dc.compiladores.alguma.semantico.AlgumaParser.Declaracao_localContext;
import br.dc.compiladores.alguma.semantico.AlgumaParser.TipoContext;
import br.dc.compiladores.alguma.semantico.AlgumaParser.VariavelContext;
import br.dc.compiladores.alguma.semantico.TabelaDeSimbolos.TipoAlguma;
import br.dc.compiladores.alguma.semantico.TabelaDeSimbolos.TipoEntrada;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    Escopos pilhaDeTabelas = new Escopos();
    String erroSemantico;

    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitCorpo(AlgumaParser.CorpoContext ctx) { 
        pilhaDeTabelas.criarNovoEscopo();
        
        super.visitCorpo(ctx); 
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }
    
    public void declaracaoVariavel(VariavelContext ctx){
        String strTipoVar = ctx.tipo().getText();
        TipoAlguma tipoVar = TipoAlguma.INVALIDO;
        boolean ehPonteiro = strTipoVar.startsWith("^");
        boolean ehRegistro = (strTipoVar.startsWith("registro"));
        TabelaDeSimbolos tabelaRegistro = null;
        TabelaDeSimbolos escopoAtual = null;
        // Verifica a localização do tamanho do vetor.
        // Se variável não for vetor, os dois valores se tornam -1.
        int posAbreColchetes, posFechaColchetes;
        
        if (ehRegistro) {
            tipoVar = TipoAlguma.REGISTRO;
            pilhaDeTabelas.criarNovoEscopo();
            // Declara as variáveis qu estão dentro do registro
            for (var v : ctx.tipo().registro().variavel()){
                declaracaoVariavel(v);
            }
            tabelaRegistro = pilhaDeTabelas.obterEscopoAtual();
            

            pilhaDeTabelas.abandonarEscopo();
            
            escopoAtual = pilhaDeTabelas.obterEscopoAtual();
        }
        else{            
            if (ehPonteiro){
                strTipoVar = strTipoVar.substring(1);
            }
            escopoAtual = pilhaDeTabelas.obterEscopoAtual();
            if (!AlgumaSemanticoUtils.ehTipoBasico(strTipoVar)){
                // Reporta erro de tipo inexistente
                erroSemantico = "tipo "+strTipoVar+" nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, erroSemantico);
            }
            
            switch(strTipoVar){
                case "literal":
                    tipoVar = TipoAlguma.LITERAL;
                    break;
                case "inteiro":
                    tipoVar = TipoAlguma.INTEIRO;
                    break;
                case "real":
                    tipoVar = TipoAlguma.REAL;
                    break;
                case "logico":
                    tipoVar = TipoAlguma.LOGICO;
                    break;
                default:
                    // Nunca irá acontecer, pois o analisador sintático não permite
                    break;
            }
        }
        for (var v : ctx.identificador()){
            if (escopoAtual.existe(v.getText())){
                // Reporta erro de variável já existente
                erroSemantico = "identificador "+v.getText()+" ja declarado anteriormente";
                AlgumaSemanticoUtils.adicionarErroSemantico(v.start, erroSemantico);
            } else{
                posAbreColchetes = v.getText().indexOf('[');
                posFechaColchetes = v.getText().indexOf(']');
                // Verifica se é um vetor
                if (posAbreColchetes != -1 && posFechaColchetes != -1){
                    String strNumValores = v.getText().
                                        substring(posAbreColchetes+1, posFechaColchetes);
                    String strParteVetor;
                    int numValores = Integer.parseInt(strNumValores);

                    // Cada posição do vetor é adicionada como uma variável
                    // diferente na tabela de símbolos
                    for (int i=0; i<numValores; i++){
                        strParteVetor = v.getText().replaceAll(strNumValores, String.valueOf(i));
                        escopoAtual.adicionar(strParteVetor, tipoVar, ehPonteiro, tabelaRegistro, 
                                            TipoEntrada.VARIAVEL);
                    }
                                        
                } else{
                    escopoAtual.adicionar(v.getText(), tipoVar, ehPonteiro, tabelaRegistro, 
                                            TipoEntrada.VARIAVEL);
                }
            }
        }
    }

    public void declaracaoTipo(Declaracao_localContext ctx){
        String strTipoTipo = ctx.tipo().getText();
        TipoAlguma tipoTipo = TipoAlguma.INVALIDO;
        boolean ehPonteiro = strTipoTipo.startsWith("^");
        boolean ehRegistro = (strTipoTipo.startsWith("registro"));
        TabelaDeSimbolos tabelaRegistro = null;
        TabelaDeSimbolos escopoAtual = null;
    }

    @Override
    public Void visitDeclaracao_local(AlgumaParser.Declaracao_localContext ctx){
        if (ctx.v1 != null){
            declaracaoVariavel(ctx.v1);
        } else if (ctx.v2 != null){
            // WIP
        } else if (ctx.v3 != null){
            declaracaoTipo(ctx);
        } else{
            // Se a execução chegar até aqui, é porque deu erro no compilador!
        }

        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx){
        for (var v : ctx.identificador()){
            boolean foiDeclarado = false;
            int posicaoPonto = v.getText().indexOf('.');
            String strVar = v.getText();

            // Verifica se é um registro
            if (posicaoPonto != -1){
                String strRegistro = strVar.substring(0, posicaoPonto);
                boolean temRegistro = pilhaDeTabelas.obterEscopoAtual().existe(strRegistro);
                if (temRegistro){
                    // Recebe a string depois do primeiro ponto
                    String strVarRegistro = strVar.substring(posicaoPonto+1);
                    TabelaDeSimbolos tabelaRegistro = pilhaDeTabelas.obterEscopoAtual().
                                                        verificarRegistro(strRegistro);
                    if (tabelaRegistro.existe(strVarRegistro)){
                        foiDeclarado = true;
                    }
                }
                else{
                    // WIP
                }
            }
            else{
                for (TabelaDeSimbolos t : pilhaDeTabelas.percorrerEscoposAninhados()){
                    if (t.existe(strVar)){
                        foiDeclarado = true;            
                    }
                }
            }
            
            if (!foiDeclarado){
                // Reporta erro de variável não existente
                erroSemantico = "identificador "+v.getText()+" nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, erroSemantico);
            }
        }

        return null;
    }
 
    @Override
    public Void visitCmdEscreva(AlgumaParser.CmdEscrevaContext ctx){
        for (var e : ctx.expressao()){
            visitExpressao(e);
        }

        return null;
    }    
    
    @Override
    public Void visitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx)
    { 
        String strVar = ctx.identificador().getText();
        String strRegistro = null;
        TipoAlguma tipoExpressao = AlgumaSemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());
        TipoAlguma tipoId = null;
        boolean ehPonteiro = false;
        boolean temSinalPonteiro = ctx.getText().startsWith("^");
        int posicaoPonto = strVar.indexOf('.');
        
        if (posicaoPonto != -1){
            strRegistro = strVar.substring(0, posicaoPonto);
            boolean temRegistro = pilhaDeTabelas.obterEscopoAtual().existe(strRegistro);
            if (temRegistro){
                // Recebe a string depois do primeiro ponto
                String strVarRegistro = strVar.substring(posicaoPonto+1);
                TabelaDeSimbolos tabelaRegistro = pilhaDeTabelas.obterEscopoAtual().
                                                    verificarRegistro(strRegistro);
                if (tabelaRegistro.existe(strVarRegistro)){
                    tipoId = tabelaRegistro.verificar(strVarRegistro);
                }else{
                    // Reportar erro de variável inexistente
                    erroSemantico = "variavel "+strVar+" inexistente";
                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, erroSemantico);
                }
            }
            else{
                // WIP
            }
        }
        else{
            tipoId = pilhaDeTabelas.obterEscopoAtual().verificar(strVar);
            ehPonteiro = pilhaDeTabelas.obterEscopoAtual().verificarPonteiro(strVar);
        }

        // Verifica se strVar é endereço de ponteiro
        if (ehPonteiro && !temSinalPonteiro){
            tipoId = TipoAlguma.ENDERECO;
        }

        //erroSemantico = strVar+" <- "+tipoExpressao;
        //AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, erroSemantico);
        if (tipoExpressao.equals(tipoId) || AlgumaSemanticoUtils.ehTipoInteiroEmReal(tipoId, tipoExpressao)){
            return null;
        } else{
            if (temSinalPonteiro){
                strVar = "^"+strVar;
            }
            erroSemantico = "atribuicao nao compativel para "+strVar;
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, erroSemantico);
        }

        return null; 
    }

    @Override
    public Void visitCmdSe(AlgumaParser.CmdSeContext ctx){

        return super.visitCmdSe(ctx);
    }

    @Override
    public Void visitCmdPara(AlgumaParser.CmdParaContext ctx){

        return super.visitCmdPara(ctx);
    }

    @Override
    public Void visitCmdEnquanto(AlgumaParser.CmdEnquantoContext ctx){

        return super.visitCmdEnquanto(ctx);
    }

    @Override
    public Void visitCmdFaca(AlgumaParser.CmdFacaContext ctx){

        return super.visitCmdFaca(ctx);
    }

    @Override
    public Void visitCmdChamada(AlgumaParser.CmdChamadaContext ctx){

        return super.visitCmdChamada(ctx);
    }

    @Override
    public Void visitCmdRetorne(AlgumaParser.CmdRetorneContext ctx){

        return super.visitCmdRetorne(ctx);
    }

    @Override
    public Void visitParcela_unario(AlgumaParser.Parcela_unarioContext ctx){
        if (ctx.p1 != null){
            String nomeId = ctx.p1.getText();
            for (var t : pilhaDeTabelas.percorrerEscoposAninhados()){
                if (t.existe(nomeId)){
                    return null;
                }
            }
            // Reporta erro de variável não existente
            erroSemantico = "identificador "+nomeId+" nao declarado";
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.p1.start, erroSemantico);
        }
        return null;
    }

     
    @Override
    public Void visitExp_aritmetica(AlgumaParser.Exp_aritmeticaContext ctx){
        AlgumaSemanticoUtils.verificarTipo(pilhaDeTabelas, ctx);

        return super.visitExp_aritmetica(ctx);
    }
}