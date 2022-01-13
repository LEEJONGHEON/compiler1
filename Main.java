import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class Main {
	public static final int EOF = -1;
    public static void main(String[] args) {
        ANTLRErrorListener e = new ErrorListener(); 
        String in = args[0]; 
        String out = args[1]; 

        
        File file = new File(out);
        PrintStream stream = null;
        try {
            stream = new PrintStream(file);
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
		System.setOut(stream);
	}
        
        String input = fileReader(in); 
        CharStream inputStream = CharStreams.fromString(input); 
        compiler1Lexer lexer = new compiler1Lexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer); 
        compiler1Parser parser = new compiler1Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(e);
        ParseTree tree = parser.compUnit(); 
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }

    public static String fileReader(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[50];
            while (reader.read(buffer) != EOF) {
                stringBuilder.append(new String(buffer));
                buffer = new char[2];
            }
            reader.close();
            return stringBuilder.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
