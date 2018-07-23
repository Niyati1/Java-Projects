//Niyati Shah |Id: 016128513

package ooad_assign1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Reader implements Runnable{	
	BufferedReader br;
	 int count = 0;
	 String path;
     
	Reader(String path) {
	try {
		br = new BufferedReader(new FileReader(path));
	
	} catch (FileNotFoundException e) {
		System.err.println("File: "+ path +  " Not Found");
	}
	this.path=path;
	}
	
	public void run() {
		String line = null;
		while(true) {
			if(path.equals("file2.txt"))
				System.out.println("Done in Main");
			try{
			synchronized(br) {
				try {
					System.out.println("Processing File: " + path );
					while((line = br.readLine()) != null) {
						String[] wordCount = line.split("\\s+");
		                count = count + wordCount.length;	 
					}
					 System.out.println(path + ": " + count);
					
				} catch (IOException e) {
					System.err.println("File Not Found");
				}
			}
			if(line == null)
				break;
		}
		catch (NullPointerException e){
		}
		}
}
}
