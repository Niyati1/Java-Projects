// $ANTLR 3.5.1 E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g 2016-10-04 16:19:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SILLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SILLexer() {} 
	public SILLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SILLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:2:6: ( '\"' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:2:8: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:3:6: ( '(' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:3:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:4:7: ( ')' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:5:7: ( '*' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:6:7: ( '+' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:7:7: ( ',' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:8:7: ( '-' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:8:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:9:7: ( '/' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:9:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:10:7: ( '=' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:10:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:11:7: ( 'END' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:11:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:12:7: ( 'INPUT' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:12:9: 'INPUT'
			{
			match("INPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:13:7: ( 'INTEGER' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:13:9: 'INTEGER'
			{
			match("INTEGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:14:7: ( 'LET' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:14:9: 'LET'
			{
			match("LET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:15:7: ( 'PRINT' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:15:9: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:16:7: ( 'PRINTLN' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:16:9: 'PRINTLN'
			{
			match("PRINTLN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:162:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:162:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:162:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:163:5: ( ( '0' .. '9' )+ )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:163:7: ( '0' .. '9' )+
			{
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:163:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:164:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:164:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:164:18: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:164:32: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:164:32: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:165:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:165:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | ID | INT | COMMENT | WS )
		int alt5=19;
		switch ( input.LA(1) ) {
		case '\"':
			{
			alt5=1;
			}
			break;
		case '(':
			{
			alt5=2;
			}
			break;
		case ')':
			{
			alt5=3;
			}
			break;
		case '*':
			{
			alt5=4;
			}
			break;
		case '+':
			{
			alt5=5;
			}
			break;
		case ',':
			{
			alt5=6;
			}
			break;
		case '-':
			{
			alt5=7;
			}
			break;
		case '/':
			{
			int LA5_8 = input.LA(2);
			if ( (LA5_8=='/') ) {
				alt5=18;
			}

			else {
				alt5=8;
			}

			}
			break;
		case '=':
			{
			alt5=9;
			}
			break;
		case 'E':
			{
			int LA5_10 = input.LA(2);
			if ( (LA5_10=='N') ) {
				int LA5_19 = input.LA(3);
				if ( (LA5_19=='D') ) {
					int LA5_23 = input.LA(4);
					if ( ((LA5_23 >= '0' && LA5_23 <= '9')||(LA5_23 >= 'A' && LA5_23 <= 'Z')||LA5_23=='_'||(LA5_23 >= 'a' && LA5_23 <= 'z')) ) {
						alt5=16;
					}

					else {
						alt5=10;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case 'I':
			{
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='N') ) {
				switch ( input.LA(3) ) {
				case 'P':
					{
					int LA5_24 = input.LA(4);
					if ( (LA5_24=='U') ) {
						int LA5_29 = input.LA(5);
						if ( (LA5_29=='T') ) {
							int LA5_33 = input.LA(6);
							if ( ((LA5_33 >= '0' && LA5_33 <= '9')||(LA5_33 >= 'A' && LA5_33 <= 'Z')||LA5_33=='_'||(LA5_33 >= 'a' && LA5_33 <= 'z')) ) {
								alt5=16;
							}

							else {
								alt5=11;
							}

						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

					}
					break;
				case 'T':
					{
					int LA5_25 = input.LA(4);
					if ( (LA5_25=='E') ) {
						int LA5_30 = input.LA(5);
						if ( (LA5_30=='G') ) {
							int LA5_34 = input.LA(6);
							if ( (LA5_34=='E') ) {
								int LA5_37 = input.LA(7);
								if ( (LA5_37=='R') ) {
									int LA5_40 = input.LA(8);
									if ( ((LA5_40 >= '0' && LA5_40 <= '9')||(LA5_40 >= 'A' && LA5_40 <= 'Z')||LA5_40=='_'||(LA5_40 >= 'a' && LA5_40 <= 'z')) ) {
										alt5=16;
									}

									else {
										alt5=12;
									}

								}

								else {
									alt5=16;
								}

							}

							else {
								alt5=16;
							}

						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

					}
					break;
				default:
					alt5=16;
				}
			}

			else {
				alt5=16;
			}

			}
			break;
		case 'L':
			{
			int LA5_12 = input.LA(2);
			if ( (LA5_12=='E') ) {
				int LA5_21 = input.LA(3);
				if ( (LA5_21=='T') ) {
					int LA5_26 = input.LA(4);
					if ( ((LA5_26 >= '0' && LA5_26 <= '9')||(LA5_26 >= 'A' && LA5_26 <= 'Z')||LA5_26=='_'||(LA5_26 >= 'a' && LA5_26 <= 'z')) ) {
						alt5=16;
					}

					else {
						alt5=13;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case 'P':
			{
			int LA5_13 = input.LA(2);
			if ( (LA5_13=='R') ) {
				int LA5_22 = input.LA(3);
				if ( (LA5_22=='I') ) {
					int LA5_27 = input.LA(4);
					if ( (LA5_27=='N') ) {
						int LA5_32 = input.LA(5);
						if ( (LA5_32=='T') ) {
							switch ( input.LA(6) ) {
							case 'L':
								{
								int LA5_38 = input.LA(7);
								if ( (LA5_38=='N') ) {
									int LA5_41 = input.LA(8);
									if ( ((LA5_41 >= '0' && LA5_41 <= '9')||(LA5_41 >= 'A' && LA5_41 <= 'Z')||LA5_41=='_'||(LA5_41 >= 'a' && LA5_41 <= 'z')) ) {
										alt5=16;
									}

									else {
										alt5=15;
									}

								}

								else {
									alt5=16;
								}

								}
								break;
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt5=16;
								}
								break;
							default:
								alt5=14;
							}
						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=16;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=17;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=19;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:98: ID
				{
				mID(); 

				}
				break;
			case 17 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:101: INT
				{
				mINT(); 

				}
				break;
			case 18 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:105: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 19 :
				// E:\\CSULB\\First Sem\\Advanced Programming Language\\Assignment 2\\Final\\SIL.g:1:113: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
