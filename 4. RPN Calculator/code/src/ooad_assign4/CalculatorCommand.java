package ooad_assign4;

import java.util.Stack;

public class CalculatorCommand extends Command {

    private char _operator;
    private int _operand;
    private Calculator _calculator;
    
    public CalculatorCommand(Calculator calculator,  char operator, int operand){
        this._calculator = calculator;
        this._operator = operator;
        this._operand = operand;
    }

    // Gets operator

    public void set(char value)   {
        _operator = value; 
    }
 
    // Get operand

    public int get(){
        return _operand;

    }
    // Execute new command

    public void Execute(){
        _calculator.Operation(_operator, _operand);
    }
    // Unexecute last command

    public void UnExecute(){
        _calculator.Operation(Undo(_operator), _operand);
    }

    // Returns opposite operator for given operator

    private char Undo(char operator){
        switch (operator){
            case '+': return '-';
            case '-': return '+';
            case '*': return '/';
            case '/': return '*';
            
       }
       return 'e'; 

    }

}
