
public aspect NotepadAspect {
	
	private int Counter = 0;
	
	pointcut Create_object() : 
		initialization(Notepad.new(..)) || initialization(Notepad.*.new(..));
	
	pointcut Tracing() : (execution(* * (..)) && within(Notepad) && !execution(* *.access*(..))) && !cflow(within(NotepadAspect)) && !execution(static void main (..)) ;
	
	before() : Create_object() {
		
		System.out.println("Creating object ==> " + thisJoinPointStaticPart.getSignature());
		++Counter;
		if(Counter==10)
		{
			System.out.println();
			Counter=0;
		}
	}
	
	before() : Tracing() {
		System.out.println("Executing ==> " +  thisJoinPoint.getSignature());
		++Counter;
		if(Counter==10)
		{
			System.out.println();
			Counter=0;
		}
	}
	


}
