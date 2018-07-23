package ooad_assign4;
import java.io.*;
import java.util.*;

public class GOF_Command_Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoker user = new Invoker();

 

      // User presses calculator buttons

      user.Compute('+', 100);

      user.Compute('-', 50);

      user.Compute('*', 10);

      user.Compute('/', 2);

 

      // Undo 4 commands

      user.Undo(4);

 

      // Redo 3 commands

      user.Redo(3);
    }
    
}
