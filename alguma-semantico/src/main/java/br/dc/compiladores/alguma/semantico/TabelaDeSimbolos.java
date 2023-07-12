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
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;
        boolean ehPonteiro;

        private EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo, boolean ehPonteiro) {
            this.nome = nome;
            this.tipo = tipo;
            this.ehPonteiro = ehPonteiro;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoAlguma tipo, boolean ehPonteiro) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, ehPonteiro));
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
}