package ooad_assign4;

import java.util.ArrayList;

public class Invoker {

    private Calculator _calculator = new Calculator();//Receiver
    private ArrayList<Command> _commands = new ArrayList<Command>();
    private int current = 0;

    public void Redo(int levels){

        System.out.println("\n---- Redo " + levels + " levels" );

        for (int i = 0; i < levels; i++){
            if (current < _commands.size() - 1){
                Command command = _commands.get(current++);
                command.Execute();
        }
      }
    }

 

    public void Undo(int levels){
        System.out.println("\n---- Undo " + levels + " levels");
        for (int i = 0; i < levels; i++){
            if (current > 0){
                Command command = _commands.get(--current);
                command.UnExecute();
            }
        }
    }

 

    public void Compute(char operator, int operand){
        Command command = new CalculatorCommand(_calculator, operator, operand);
        command.Execute();
  // Add command to undo list

        _commands.add(command);
        current++;

    }

}
