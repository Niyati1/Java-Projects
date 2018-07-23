import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Final {

	public static void tokenanalyzer(String S) //function which prints different tokens from the given input.
	{
		
	ArrayList<String> list = new ArrayList<String>();
		Pattern pattern = Pattern.compile("(-?[0-9]+)|([*/+-=><()_%,!&\\[\\]{}#])|(\"[^\"]*\")|(\\bPRINTLN|println|PRINT|print\\b)|([a-zA-Z0-9]+)|"); //Pattern.compile class which includes group of different regular expression. Eg ("(Group 1 for constants)|(Group 2 for Special)|(Group 3 for Literal)|(Group 4 for Reserved)|(Group 5 for Identifiers");
		    Matcher matcher = pattern.matcher(S); // Matcher function matches the compiled regular expression with the input string.
		    while (matcher.find())  // Loop for each match found for different group of tokens.
		    {
		    if (matcher.group(1)!=null) // Print only if Constants are found.
			     {
			    	//System.out.println("Constants : " + matcher.group(1));  
			    	list.add(matcher.group(1));
   	
			     }
		    	if (matcher.group(2)!=null) // Print only if Special characters are found.
			     {
			    //	 System.out.println("Special : " + matcher.group(2));
			    	 list.add(matcher.group(2));
			     }
		  	if (matcher.group(3)!=null) // Print only if Literals are found
			     {
			   // 	 System.out.println("Literal : " + matcher.group(3));
			    	 list.add(matcher.group(3));
			     }
		  	if (matcher.group(4)!=null) //Print only if Reserved words are found
		     {
		   	 //System.out.println("Reserved : " + matcher.group(4));
		   	list.add(matcher.group(4));
		    }
		  	if (matcher.group(5)!=null) // Print only if Identifiers are found.
		     {
		  		if (matcher.group(5).length()<=32) // Print only if length of identifier is less than or equal to 32 characters.
		  		{
		   	// System.out.println("Identifier : " + matcher.group(5));
		  		list.add(matcher.group(5));
		  		}
		  		else
		  			System.out.println("Identifier : " + matcher.group(5) + " is more than 32 characters");
		    }
	    	
		    }	 
		    
	    for (String str : list) {
			    
                System.out.println("Token is : " + str);
    if (list.get(0)=="PRINT")
    {
    	if (list.size()==2)
    	System.out.print(list.get(1));
    }
            }
//System.out.println("size of list is" + list.size());
	}
		
	
	public static void main(String[] args) throws FileNotFoundException { //If file does not exist it will throw file not found exception
		File file = new File("LexerInput.txt"); //Create a file object for input
		Scanner sc = new Scanner(file); //Read the file
		int count = 1;
		while (sc.hasNextLine()) //Looping through all the lines in file
		{
		  
			String i = sc.nextLine(); //Read next line
			System.out.println("Input "+count+" : " + i + "\n"); 
		   	tokenanalyzer(i);	// Call tokenanalyzer function for each line. tokenanalyzer function separates different tokens from the input file and group them into constants, literals, special, reserved, identifier and reserved
		   	System.out.print("\n");
		   	count++;
		}
		count=1;
	}
}
