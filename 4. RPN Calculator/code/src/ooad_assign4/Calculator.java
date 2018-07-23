package ooad_assign4;

public class Calculator {
    private int curr = 0;
    
    public void Operation(char operator, int operand){

      switch (operator){
        case '+': curr += operand; break;
        case '-': curr -= operand; break;
        case '*': curr *= operand; break;
        case '/': curr /= operand; break;
      }

      System.out.println("Current value = " + curr + " following " + operator + " " + operand);

    }

}
