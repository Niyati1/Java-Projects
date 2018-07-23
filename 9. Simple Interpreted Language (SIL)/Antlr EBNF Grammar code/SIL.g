grammar SIL;

@header {
import java.util.HashMap;
import java.util.Scanner;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
Scanner sc = new Scanner(System.in); // To take input from the user
}



prog : //Start of the grammar which can have 6 commands Print, println, integer, input, let, end
 (	
         print // PRINT RULE which will print the output no CR LF
         | println //PRINTLN RULE which will print the output CR LF
         | integer // INTEGER RULE which will define identifiers as integers and will also check for duplicity i.e if the variable is already defined as an integer 
         | 'LET' ID '=' e1=expression  // LET RULE will assign the expression to the identifier. It will also check whether the identifier is defined as integer or not. If not it will throw error.
           {
             Integer m = (Integer)memory.get($ID.text); // to get the value of ID from HashMap
             if ( m!=null ) // to check if the identifier is defined before using it in LET operation
             memory.put($ID.text, new Integer($e1.value)); // If variable is not defined before, it will define it and store it the HashMap and will give the default value 0
             else System.err.println("undefined variable "+$ID.text);
           }
         | input //INPUT RULE which will take input from the user.
 )* //* means the program can have  or more of the above rules
         'END' //end to the program
         ;
	
print : 
       'PRINT' '(' //print the output in the  format PRINT (expression or string literal) no CR LF
       (
        e1=expression  
          { 
            System.out.print($e1.value) ; 
          }
        | //expression or literal
        e2=literal 
          {
            String x=$e2.text.toString().replaceAll("^\"|\"$", ""); // to print the string without quotes
            System.out.print(x);
          }
        ) 	 
        ')'
       ;
println  : 
          'PRINTLN' '(' //print the output in the  format PRINT (expression or string literal)  CR LF 
          (
           e1=expression
             {
               System.out.println($e1.value);
             } 
	  | //expression or literal
	   e2=literal 
	     {
	      String x=$e2.text.toString().replaceAll("^\"|\"$", ""); // to print the string without quotes
	      System.out.println(x);
	     }
	   )	')'
	;	

input 	:
         'INPUT' e1=ID  // take input from the user. It can be of the format INPUT a, b,...
             {
             Integer m = (Integer)memory.get($e1.text); // to check if the identifier is defined before taking the input. It will check for the identifier in the hashmap
             if ( m==null ) // If the value does not exist in Hash map it will give an error
             System.err.println("Undefined Variable " + $e1.text);
             else
             {
               System.out.println("Enter Value for " + $e1.text ); //else it will ask for the input from user 
               int x =sc.nextInt();
               memory.put($e1.text,x); // And will store the input along with the id in Hash Map
             }  
             } 
          (
          ',' e2=ID 
             {
             Integer n = (Integer)memory.get($e2.text); // to check if the identifier is defined before taking the input. It will check for the identifier in the hashmap
             if ( n==null ) // If the value does not exist in Hash map it will give an error
             System.err.println("Undefined Variable " + $e2.text);
             else
             {
               System.out.println("Enter Value for " + $e2.text);//else it will ask for the input from user
               int y =sc.nextInt();
               memory.put($e2.text,y); // And will store the input along with the id in Hash Map
              }
             }
          )*           
        ;

integer returns [int value] :
                'INTEGER' e1=ID // TO define the identifier as integer as INTEGER a, b,...
                  {
                    Integer v = (Integer)memory.get($e1.text);
                    if ( v==null ) // to check if the variable is already defined
                    memory.put($e1.text, new Integer(0)); //if not it will add the value in Hash Map 
                    else
                    System.err.println("Variable " + $e1.text + " is already defined "); // else it will give an error
                  } 
                (',' e2=ID 
                 {
                   Integer u = (Integer)memory.get($e2.text); 
                   if ( u==null ) // to check if the variable is already defined
                   memory.put($e2.text, new Integer(0));//if not it will add the value in Hash Map 
                   else
                   System.err.println("Variable " + $e2.text + " is already defined");})* // else it will give an error 
        ;
term  returns [int value] :	// a term can be anything either an ID, expression or an integer value
        ID  
          { 
            if(memory.containsKey($ID.text)) // if user tries to print the undefined variable
            $value =(Integer)memory.get($ID.text); // it will return the text of the id specified 
            else
            {
             System.err.println("Undefined variable " + $ID.text); 
             System.exit(0);
            }
          }
        | '(' expression ')' 
           {
           $value=$expression.value; // it will return the value of expression
           }
        | INT 
           {
            $value =Integer.parseInt($INT.text); // it will return the integer value
           }
        ;
        	
unary returns [int value] : 
        (
        '+' e1=term {$value=$e1.value;} 
        |'-' e1=term {$value = -$e1.value;} //signed
        )* 
        e=term {$value =$e.value;}
	;
	
multdiv returns [int value] : 
        e=term {$value =$e.value;}
        ('*' e1=term {$value =$value * $e1.value;} //multiplication
         |'/' e1=term {$value =$value / $e1.value;} //division
        )*
        ;
expression returns [int value] :
	 e= multdiv{$value=$e.value;} 
	(
	'+' e1=multdiv{$value = $value + $e1.value;} //addition
	|'-' e1=multdiv{$value = $value - $e1.value;} //subtraction
	)*
	;	 	
literal : //string literals should be specified between " "
        '"'
         (
          '"' '"'
          | ~('"')
         )*
        '"'
        ;
        			
ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*; //should start with A..Z or a..z and may contain 0..9 or _
INT :	('0'..'9')+; //Integers
COMMENT :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;} ; //for single line comment.
WS  :   ( ' '| '\t'| '\r'| '\n') {$channel=HIDDEN;} ; // for whitespaces
	