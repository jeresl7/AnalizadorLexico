import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("codigo.txt");
        MiLenguajeLexer lexer = new MiLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeParser parser = new MiLenguajeParser(tokens);
        ParseTree tree = parser.programa(); // la regla raíz ahora se llama 'programa'
        System.out.println(tree.toStringTree(parser));
    }
}
