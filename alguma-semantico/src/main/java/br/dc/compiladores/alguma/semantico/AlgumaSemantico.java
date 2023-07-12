package br.dc.compiladores.alguma.semantico;

import br.dc.compiladores.alguma.semantico.TabelaDeSimbolos.TipoAlguma;

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
    

    @Override
    public Void visitDeclaracao_local(AlgumaParser.Declaracao_localContext ctx){
        if (ctx.v1 != null){
            String srtTipoVar = ctx.v1.tipo().getText();
            boolean ehPonteiro = srtTipoVar.startsWith("^");
            if (ehPonteiro){
                srtTipoVar = srtTipoVar.substring(1);
            }
            TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();
            if (!AlgumaSemanticoUtils.ehTipoBasico(srtTipoVar)){
                // Reporta erro de tipo inexistente
                erroSemantico = "tipo "+srtTipoVar+" nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.v1.start, erroSemantico);
            }
            TipoAlguma tipoVar = TipoAlguma.INVALIDO;
            switch(srtTipoVar){
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
            for (var v : ctx.v1.identificador()){
                if (escopoAtual.existe(v.getText())){
                    // Reporta erro de variável já existente
                    erroSemantico = "identificador "+v.getText()+" ja declarado anteriormente";
                    AlgumaSemanticoUtils.adicionarErroSemantico(v.start, erroSemantico);
                } else{
                    escopoAtual.adicionar(v.getText(), tipoVar, ehPonteiro);
                }
            }
        } else if (ctx.v2 != null){
            // WIP
        } else if (ctx.v3 != null){
            // WIP
        } else{
            // Se a execução chegar até aqui, é porque deu erro no compilador!
        }

        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx){
        for (var v : ctx.identificador()){
            boolean foiDeclarado = false;
            for (TabelaDeSimbolos t : pilhaDeTabelas.percorrerEscoposAninhados()){
                if (t.existe(v.getText())){
                    foiDeclarado = true;            
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
        TipoAlguma tipoExpressao = AlgumaSemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());
        TipoAlguma tipoId = pilhaDeTabelas.obterEscopoAtual().verificar(strVar);
        boolean ehPonteiro = pilhaDeTabelas.obterEscopoAtual().verificarPonteiro(strVar);
        boolean temSinalPonteiro = ctx.getText().startsWith("^");
        
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