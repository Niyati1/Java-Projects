package ooad_assign7;

import java.util.Scanner;

public class GOF_state_structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String");
		String input =  sc.nextLine();
		
		Context c = new Context(input);
		c.Handle();
		System.out.println("Final State:"+c.getFinalState());
		if(c.getFinalState()==4||c.getFinalState()==5||c.getFinalState()==6)
			System.out.println("Accepted");
		else
			System.out.println("Not Accepted");
	}

}
