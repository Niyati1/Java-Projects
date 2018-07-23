// Niyati Shah |Id: 016128513

package ooad_assign1;

public class Main {

	public static void main(String[] args) {
		
        
		Thread t1=new Thread(new Reader("file1.txt"));
		Thread t2=new Thread(new Reader("file2.txt"));
		Thread t3=new Thread(new Reader("file3.txt"));
		Thread t4=new Thread(new Reader("file4.txt"));
		//Thread t5=new Thread(new Reader("file5.txt"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t5.start();
		

	}

}
