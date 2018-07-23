// $ANTLR 3.5.1 E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g 2017-02-19 21:57:14

import java.util.HashMap;
import java.util.Scanner;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SILParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "WS", 
		"'\"'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'END'", 
		"'INPUT'", "'INTEGER'", "'LET'", "'PRINT'", "'PRINTLN'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int COMMENT=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SILParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SILParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SILParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Scanner sc = new Scanner(System.in); // To take input from the user



	// $ANTLR start "prog"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:16:1: prog : ( print | println | integer | 'LET' ID '=' e1= expression | input )* 'END' ;
	public final void prog() throws RecognitionException {
		Token ID1=null;
		int e1 =0;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:16:6: ( ( print | println | integer | 'LET' ID '=' e1= expression | input )* 'END' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:17:2: ( print | println | integer | 'LET' ID '=' e1= expression | input )* 'END'
			{
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:17:2: ( print | println | integer | 'LET' ID '=' e1= expression | input )*
			loop1:
			while (true) {
				int alt1=6;
				switch ( input.LA(1) ) {
				case 21:
					{
					alt1=1;
					}
					break;
				case 22:
					{
					alt1=2;
					}
					break;
				case 19:
					{
					alt1=3;
					}
					break;
				case 20:
					{
					alt1=4;
					}
					break;
				case 18:
					{
					alt1=5;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:18:10: print
					{
					pushFollow(FOLLOW_print_in_prog38);
					print();
					state._fsp--;

					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:19:12: println
					{
					pushFollow(FOLLOW_println_in_prog52);
					println();
					state._fsp--;

					}
					break;
				case 3 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:20:12: integer
					{
					pushFollow(FOLLOW_integer_in_prog66);
					integer();
					state._fsp--;

					}
					break;
				case 4 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:21:12: 'LET' ID '=' e1= expression
					{
					match(input,20,FOLLOW_20_in_prog80); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_prog82); 
					match(input,16,FOLLOW_16_in_prog84); 
					pushFollow(FOLLOW_expression_in_prog88);
					e1=expression();
					state._fsp--;


					             Integer m = (Integer)memory.get((ID1!=null?ID1.getText():null)); // to get the value of ID from HashMap
					             if ( m!=null ) // to check if the identifier is defined before using it in LET operation
					             memory.put((ID1!=null?ID1.getText():null), new Integer(e1)); // If variable is not defined before, it will define it and store it the HashMap and will give the default value 0
					             else System.err.println("undefined variable "+(ID1!=null?ID1.getText():null));
					           
					}
					break;
				case 5 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:28:12: input
					{
					pushFollow(FOLLOW_input_in_prog116);
					input();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,17,FOLLOW_17_in_prog133); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "print"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:33:1: print : 'PRINT' '(' (e1= expression |e2= literal ) ')' ;
	public final void print() throws RecognitionException {
		int e1 =0;
		ParserRuleReturnScope e2 =null;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:33:7: ( 'PRINT' '(' (e1= expression |e2= literal ) ')' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:34:8: 'PRINT' '(' (e1= expression |e2= literal ) ')'
			{
			match(input,21,FOLLOW_21_in_print161); 
			match(input,9,FOLLOW_9_in_print163); 
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:35:8: (e1= expression |e2= literal )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ID && LA2_0 <= INT)||LA2_0==9) ) {
				alt2=1;
			}
			else if ( (LA2_0==8) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:36:9: e1= expression
					{
					pushFollow(FOLLOW_expression_in_print185);
					e1=expression();
					state._fsp--;

					 
					            System.out.print(e1) ; 
					          
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:41:9: e2= literal
					{
					pushFollow(FOLLOW_literal_in_print222);
					e2=literal();
					state._fsp--;


					            String x=(e2!=null?input.toString(e2.start,e2.stop):null).toString().replaceAll("^\"|\"$", ""); // to print the string without quotes
					            System.out.print(x);
					          
					}
					break;

			}

			match(input,10,FOLLOW_10_in_print258); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"



	// $ANTLR start "println"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:49:1: println : 'PRINTLN' '(' (e1= expression |e2= literal ) ')' ;
	public final void println() throws RecognitionException {
		int e1 =0;
		ParserRuleReturnScope e2 =null;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:49:10: ( 'PRINTLN' '(' (e1= expression |e2= literal ) ')' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:50:11: 'PRINTLN' '(' (e1= expression |e2= literal ) ')'
			{
			match(input,22,FOLLOW_22_in_println285); 
			match(input,9,FOLLOW_9_in_println287); 
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:51:11: (e1= expression |e2= literal )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= ID && LA3_0 <= INT)||LA3_0==9) ) {
				alt3=1;
			}
			else if ( (LA3_0==8) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:52:12: e1= expression
					{
					pushFollow(FOLLOW_expression_in_println315);
					e1=expression();
					state._fsp--;


					               System.out.println(e1);
					             
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:57:5: e2= literal
					{
					pushFollow(FOLLOW_literal_in_println345);
					e2=literal();
					state._fsp--;


						      String x=(e2!=null?input.toString(e2.start,e2.stop):null).toString().replaceAll("^\"|\"$", ""); // to print the string without quotes
						      System.out.println(x);
						     
					}
					break;

			}

			match(input,10,FOLLOW_10_in_println362); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "println"



	// $ANTLR start "input"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:65:1: input : 'INPUT' e1= ID ( ',' e2= ID )* ;
	public final void input() throws RecognitionException {
		Token e1=null;
		Token e2=null;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:65:8: ( 'INPUT' e1= ID ( ',' e2= ID )* )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:66:10: 'INPUT' e1= ID ( ',' e2= ID )*
			{
			match(input,18,FOLLOW_18_in_input383); 
			e1=(Token)match(input,ID,FOLLOW_ID_in_input387); 

			             Integer m = (Integer)memory.get((e1!=null?e1.getText():null)); // to check if the identifier is defined before taking the input. It will check for the identifier in the hashmap
			             if ( m==null ) // If the value does not exist in Hash map it will give an error
			             System.err.println("Undefined Variable " + (e1!=null?e1.getText():null));
			             else
			             {
			               System.out.println("Enter Value for " + (e1!=null?e1.getText():null) ); //else it will ask for the input from user 
			               int x =sc.nextInt();
			               memory.put((e1!=null?e1.getText():null),x); // And will store the input along with the id in Hash Map
			             }  
			             
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:78:11: ( ',' e2= ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==13) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:79:11: ',' e2= ID
					{
					match(input,13,FOLLOW_13_in_input429); 
					e2=(Token)match(input,ID,FOLLOW_ID_in_input433); 

					             Integer n = (Integer)memory.get((e2!=null?e2.getText():null)); // to check if the identifier is defined before taking the input. It will check for the identifier in the hashmap
					             if ( n==null ) // If the value does not exist in Hash map it will give an error
					             System.err.println("Undefined Variable " + (e2!=null?e2.getText():null));
					             else
					             {
					               System.out.println("Enter Value for " + (e2!=null?e2.getText():null));//else it will ask for the input from user
					               int y =sc.nextInt();
					               memory.put((e2!=null?e2.getText():null),y); // And will store the input along with the id in Hash Map
					              }
					             
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input"



	// $ANTLR start "integer"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:94:1: integer returns [int value] : 'INTEGER' e1= ID ( ',' e2= ID )* ;
	public final int integer() throws RecognitionException {
		int value = 0;


		Token e1=null;
		Token e2=null;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:94:29: ( 'INTEGER' e1= ID ( ',' e2= ID )* )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:95:17: 'INTEGER' e1= ID ( ',' e2= ID )*
			{
			match(input,19,FOLLOW_19_in_integer510); 
			e1=(Token)match(input,ID,FOLLOW_ID_in_integer514); 

			                    Integer v = (Integer)memory.get((e1!=null?e1.getText():null));
			                    if ( v==null ) // to check if the variable is already defined
			                    memory.put((e1!=null?e1.getText():null), new Integer(0)); //if not it will add the value in Hash Map 
			                    else
			                    System.err.println("Variable " + (e1!=null?e1.getText():null) + " is already defined "); // else it will give an error
			                  
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:103:17: ( ',' e2= ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==13) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:103:18: ',' e2= ID
					{
					match(input,13,FOLLOW_13_in_integer555); 
					e2=(Token)match(input,ID,FOLLOW_ID_in_integer559); 

					                   Integer u = (Integer)memory.get((e2!=null?e2.getText():null)); 
					                   if ( u==null ) // to check if the variable is already defined
					                   memory.put((e2!=null?e2.getText():null), new Integer(0));//if not it will add the value in Hash Map 
					                   else
					                   System.err.println("Variable " + (e2!=null?e2.getText():null) + " is already defined");
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "integer"



	// $ANTLR start "term"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:111:1: term returns [int value] : ( ID | '(' expression ')' | INT );
	public final int term() throws RecognitionException {
		int value = 0;


		Token ID2=null;
		Token INT4=null;
		int expression3 =0;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:111:27: ( ID | '(' expression ')' | INT )
			int alt6=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt6=1;
				}
				break;
			case 9:
				{
				alt6=2;
				}
				break;
			case INT:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:112:9: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_term612); 
					 
					            if(memory.containsKey((ID2!=null?ID2.getText():null))) // if user tries to print the undefined variable
					            value =(Integer)memory.get((ID2!=null?ID2.getText():null)); // it will return the text of the id specified 
					            else
					            {
					             System.err.println("Undefined variable " + (ID2!=null?ID2.getText():null)); 
					             System.exit(0);
					            }
					          
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:122:11: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_term638); 
					pushFollow(FOLLOW_expression_in_term640);
					expression3=expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_term642); 

					           value =expression3; // it will return the value of expression
					           
					}
					break;
				case 3 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:126:11: INT
					{
					INT4=(Token)match(input,INT,FOLLOW_INT_in_term668); 

					            value =Integer.parseInt((INT4!=null?INT4.getText():null)); // it will return the integer value
					           
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "unary"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:132:1: unary returns [int value] : ( '+' e1= term | '-' e1= term )* e= term ;
	public final int unary() throws RecognitionException {
		int value = 0;


		int e1 =0;
		int e =0;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:132:27: ( ( '+' e1= term | '-' e1= term )* e= term )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:133:9: ( '+' e1= term | '-' e1= term )* e= term
			{
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:133:9: ( '+' e1= term | '-' e1= term )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==12) ) {
					alt7=1;
				}
				else if ( (LA7_0==14) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:134:9: '+' e1= term
					{
					match(input,12,FOLLOW_12_in_unary731); 
					pushFollow(FOLLOW_term_in_unary735);
					e1=term();
					state._fsp--;

					value =e1;
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:135:10: '-' e1= term
					{
					match(input,14,FOLLOW_14_in_unary749); 
					pushFollow(FOLLOW_term_in_unary753);
					e1=term();
					state._fsp--;

					value = -e1;
					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_term_in_unary780);
			e=term();
			state._fsp--;

			value =e;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "unary"



	// $ANTLR start "multdiv"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:140:1: multdiv returns [int value] : e= term ( '*' e1= term | '/' e1= term )* ;
	public final int multdiv() throws RecognitionException {
		int value = 0;


		int e =0;
		int e1 =0;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:140:29: (e= term ( '*' e1= term | '/' e1= term )* )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:141:9: e= term ( '*' e1= term | '/' e1= term )*
			{
			pushFollow(FOLLOW_term_in_multdiv808);
			e=term();
			state._fsp--;

			value =e;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:142:9: ( '*' e1= term | '/' e1= term )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==11) ) {
					alt8=1;
				}
				else if ( (LA8_0==15) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:142:10: '*' e1= term
					{
					match(input,11,FOLLOW_11_in_multdiv821); 
					pushFollow(FOLLOW_term_in_multdiv825);
					e1=term();
					state._fsp--;

					value =value * e1;
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:143:11: '/' e1= term
					{
					match(input,15,FOLLOW_15_in_multdiv840); 
					pushFollow(FOLLOW_term_in_multdiv844);
					e1=term();
					state._fsp--;

					value =value / e1;
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multdiv"



	// $ANTLR start "expression"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:146:1: expression returns [int value] : e= multdiv ( '+' e1= multdiv | '-' e1= multdiv )* ;
	public final int expression() throws RecognitionException {
		int value = 0;


		int e =0;
		int e1 =0;

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:146:32: (e= multdiv ( '+' e1= multdiv | '-' e1= multdiv )* )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:147:3: e= multdiv ( '+' e1= multdiv | '-' e1= multdiv )*
			{
			pushFollow(FOLLOW_multdiv_in_expression883);
			e=multdiv();
			state._fsp--;

			value =e;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:148:2: ( '+' e1= multdiv | '-' e1= multdiv )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==12) ) {
					alt9=1;
				}
				else if ( (LA9_0==14) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:149:2: '+' e1= multdiv
					{
					match(input,12,FOLLOW_12_in_expression891); 
					pushFollow(FOLLOW_multdiv_in_expression895);
					e1=multdiv();
					state._fsp--;

					value = value + e1;
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:150:3: '-' e1= multdiv
					{
					match(input,14,FOLLOW_14_in_expression901); 
					pushFollow(FOLLOW_multdiv_in_expression905);
					e1=multdiv();
					state._fsp--;

					value = value - e1;
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expression"


	public static class literal_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "literal"
	// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:153:1: literal : '\"' ( '\"' '\"' |~ ( '\"' ) )* '\"' ;
	public final SILParser.literal_return literal() throws RecognitionException {
		SILParser.literal_return retval = new SILParser.literal_return();
		retval.start = input.LT(1);

		try {
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:153:9: ( '\"' ( '\"' '\"' |~ ( '\"' ) )* '\"' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:154:9: '\"' ( '\"' '\"' |~ ( '\"' ) )* '\"'
			{
			match(input,8,FOLLOW_8_in_literal932); 
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:155:10: ( '\"' '\"' |~ ( '\"' ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==8) ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1==8) ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= COMMENT && LA10_0 <= WS)||(LA10_0 >= 9 && LA10_0 <= 22)) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:156:11: '\"' '\"'
					{
					match(input,8,FOLLOW_8_in_literal955); 
					match(input,8,FOLLOW_8_in_literal957); 
					}
					break;
				case 2 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:157:13: ~ ( '\"' )
					{
					if ( (input.LA(1) >= COMMENT && input.LA(1) <= WS)||(input.LA(1) >= 9 && input.LA(1) <= 22) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			match(input,8,FOLLOW_8_in_literal996); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_print_in_prog38 = new BitSet(new long[]{0x00000000007E0000L});
	public static final BitSet FOLLOW_println_in_prog52 = new BitSet(new long[]{0x00000000007E0000L});
	public static final BitSet FOLLOW_integer_in_prog66 = new BitSet(new long[]{0x00000000007E0000L});
	public static final BitSet FOLLOW_20_in_prog80 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_prog82 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_prog84 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_expression_in_prog88 = new BitSet(new long[]{0x00000000007E0000L});
	public static final BitSet FOLLOW_input_in_prog116 = new BitSet(new long[]{0x00000000007E0000L});
	public static final BitSet FOLLOW_17_in_prog133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_print161 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_print163 = new BitSet(new long[]{0x0000000000000360L});
	public static final BitSet FOLLOW_expression_in_print185 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_literal_in_print222 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_println285 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_println287 = new BitSet(new long[]{0x0000000000000360L});
	public static final BitSet FOLLOW_expression_in_println315 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_literal_in_println345 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_println362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_input383 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_input387 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_input429 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_input433 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_19_in_integer510 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_integer514 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_integer555 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_integer559 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_term612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_term638 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_expression_in_term640 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_term642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_term668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_unary731 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_term_in_unary735 = new BitSet(new long[]{0x0000000000005260L});
	public static final BitSet FOLLOW_14_in_unary749 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_term_in_unary753 = new BitSet(new long[]{0x0000000000005260L});
	public static final BitSet FOLLOW_term_in_unary780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_multdiv808 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_11_in_multdiv821 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_term_in_multdiv825 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_15_in_multdiv840 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_term_in_multdiv844 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_multdiv_in_expression883 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_12_in_expression891 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_multdiv_in_expression895 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_14_in_expression901 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_multdiv_in_expression905 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_8_in_literal932 = new BitSet(new long[]{0x00000000007FFFF0L});
	public static final BitSet FOLLOW_8_in_literal955 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_literal957 = new BitSet(new long[]{0x00000000007FFFF0L});
	public static final BitSet FOLLOW_set_in_literal971 = new BitSet(new long[]{0x00000000007FFFF0L});
	public static final BitSet FOLLOW_8_in_literal996 = new BitSet(new long[]{0x0000000000000002L});
}
