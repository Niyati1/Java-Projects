import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class LexerJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, RecognitionException {
    	SILLexer lexer = new SILLexer (new ANTLRFileStream("Input.s"));
        
	CommonTokenStream tokens = new CommonTokenStream(lexer);
        
	SILParser parser = new SILParser(tokens);
        
        parser.prog();
        
        
    }
    
}
