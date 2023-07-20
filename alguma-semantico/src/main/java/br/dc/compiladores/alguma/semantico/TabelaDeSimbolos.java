package br.dc.compiladores.alguma.semantico;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoAlguma {
        LITERAL,
        INTEIRO,
        REAL,
        LOGICO,
        ENDERECO,
        REGISTRO,
        INVALIDO
    }

    public enum TipoEntrada{
        VARIAVEL,
        TIPO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;
        boolean ehPonteiro;
        TabelaDeSimbolos registro;
        TipoEntrada tipoEntrada;

        private EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo, boolean ehPonteiro,
                                        TabelaDeSimbolos registro, TipoEntrada tipoEntrada) {
            this.nome = nome;
            this.tipo = tipo;
            this.ehPonteiro = ehPonteiro;
            this.registro = registro;
            this.tipoEntrada = tipoEntrada;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoAlguma tipo, boolean ehPonteiro, 
                            TabelaDeSimbolos registro, TipoEntrada tipoEntrada) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, ehPonteiro, registro, tipoEntrada));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoAlguma verificar(String nome) {
        return tabela.get(nome).tipo;
    }

    public boolean verificarPonteiro(String nome){
        return tabela.get(nome).ehPonteiro;
    }

    public TabelaDeSimbolos verificarRegistro(String nome){
        return tabela.get(nome).registro;
    }
}