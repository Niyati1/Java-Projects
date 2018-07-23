package ooad_assign7;

public class State6 implements State{

	@Override
	public void Handler_a(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Transition of A from State 6 to State 5");
		c.setPos();
		c.setState(new State5(),5);
		c.Handle();
		
	}

	@Override
	public void Handler_b(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Transition of B from State 6 to State 4");
		c.setPos();
		c.setState(new State4(),4);
		c.Handle();
		
	}

	@Override
	public void Handler_c(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Transition of C from State 6 to State 1");
		c.setPos();
		c.setState(new State1(),1);
		c.Handle();
		
	}
	

}
