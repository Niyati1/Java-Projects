package ooad_assign7;

public class State5 implements State{

	@Override
	public void Handler_a(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Transition of A from State 5 to State 5");
		c.setPos();
		c.setState(new State5(),5);
		c.Handle();
		
	}

	@Override
	public void Handler_b(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Transition of B from State 5 to State 6");
		c.setPos();
		c.setState(new State6(),6);
		c.Handle();
		
	}

	@Override
	public void Handler_c(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Transition of C from State 5 to State 4");
		c.setPos();
		c.setState(new State4(),4);
		c.Handle();
	}

}
