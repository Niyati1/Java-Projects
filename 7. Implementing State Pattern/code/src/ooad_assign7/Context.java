package ooad_assign7;

public class Context {
	
	private State state;
	private char[] input;
	public int input_pos = 0;
	public static int final_state;
	
	public Context(String input){
		this.input=input.toCharArray();
		state = new State1();
		System.out.println("Creating Context..");
	}
	
	public void setState(State s,int final_state){
			this.final_state=final_state;
			state=s;
	}
	
	public int getFinalState(){
		return final_state;
	}
	
	public void setPos(){
		++input_pos;
		
	}
	
	public void Handle(){
		if(input_pos < input.length){
		if(input[input_pos]=='a')
		state.Handler_a(this);
		else if(input[input_pos]=='b')
			state.Handler_b(this);
		else if(input[input_pos]=='c')
			state.Handler_c(this);
		else
			final_state=0;
		
		}
	}

}
