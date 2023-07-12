package br.dc.compiladores.alguma.semantico;

import br.dc.compiladores.alguma.semantico.AlgumaParser.ProgramaContext;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    public static void main(String args[]) throws IOException {
        // Pega o primeiro argumento da linha de comando
        String arquivoSaida = args[1];

        // Cria um objeto para escrever no arquivo
        try(PrintWriter pw = new PrintWriter(arquivoSaida)) {            
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);
            ProgramaContext arvore = parser.programa();
            AlgumaSemantico as = new AlgumaSemantico();
            as.visitPrograma(arvore);
            AlgumaSemanticoUtils.errosSemanticos.forEach((s) -> pw.println(s));
            pw.println("Fim da compilacao");
        } catch(FileNotFoundException fnfe) {
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }
    }
}