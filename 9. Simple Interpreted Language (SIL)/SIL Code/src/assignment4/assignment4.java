package assignment4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class assignment4 {
	public static class Token {
		public TokenType type;
		public String data;
		public Token(TokenType type, String data) {
			this.type = type;
			this.data = data;
		}}
	public static Map<String, Integer> hm = new HashMap<String, Integer>();
	public static TreeMap<Integer, ArrayList<Token>> labels = new TreeMap<Integer, ArrayList<Token>>();
	public static int gotokey = 0;
	static ArrayList<String> array = new ArrayList<String>();
	static Stack<Integer> st = new Stack<Integer>();
	public static int retcount = 0;
	private static Scanner sc;
	private static Scanner scanner;
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("ParserInput.txt");
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String i = sc.nextLine();
			ArrayList<Token> tokens = lex(i);
			Iterator<Token> i1 = tokens.iterator();
			ArrayList<Token> a1 = new ArrayList<Token>();
			Token t = i1.next();
			while (i1.hasNext())
				a1.add(i1.next());
			try {
				int t1 = Integer.parseInt(t.data);
				labels.put(t1, a1);
			} catch (java.lang.NumberFormatException e) {
				System.err.println("Line should begin with number");
				System.exit(0);
			}}
		int key = labels.lastKey();
		for (int i = 0; i <= key; i++) {
			if (labels.get(i) != null) {
				if (gotokey != 0) {
					i = gotokey;
					gotokey = 0;
					retcount = i;
					parse(labels.get(i));
				} else {
					retcount = i;
					parse(labels.get(i));
				}}}}
	public static enum TokenType { CONSTANTS("-?[0-9]+"), SPECIAL("[*/+-=><()_%,!&\\[\\]{}#]"), LITERAL("\"[^\"]*\""), RESERVED("\\bPRINTLN|println|PRINT|print|INTEGER|integer|LET|let|INPUT|input|GOTO|goto|END|end|gosub|GOSUB|ret|RET\\b"), IDENTIFIERS("[a-zA-Z0-9_]+"), COMMENTS("\\\\(.*)");
		public final String pattern;
		private TokenType(String pattern) {
			this.pattern = pattern;
		}}
	public static ArrayList<Token> lex(String input) {
		ArrayList<Token> tokens = new ArrayList<Token>();
		StringBuffer tokenPatternsBuffer = new StringBuffer();
		for (TokenType tokenType : TokenType.values())
			tokenPatternsBuffer.append(String.format("|(?<%s>%s)", tokenType.name(), tokenType.pattern));
		Pattern tokenPatterns = Pattern.compile(new String(tokenPatternsBuffer.substring(1)));
		Matcher matcher = tokenPatterns.matcher(input);
		while (matcher.find()) {
			if (matcher.group(TokenType.CONSTANTS.name()) != null) {tokens.add(new Token(TokenType.CONSTANTS, matcher.group(TokenType.CONSTANTS.name())));
				continue;
			} else if (matcher.group(TokenType.SPECIAL.name()) != null) {tokens.add(new Token(TokenType.SPECIAL, matcher.group(TokenType.SPECIAL.name())));
				continue;
			} else if (matcher.group(TokenType.LITERAL.name()) != null) {tokens.add(new Token(TokenType.LITERAL, matcher.group(TokenType.LITERAL.name())));
				continue;
			} else if (matcher.group(TokenType.RESERVED.name()) != null) {tokens.add(new Token(TokenType.RESERVED, matcher.group(TokenType.RESERVED.name())));
				continue;
			} else if (matcher.group(TokenType.COMMENTS.name()) != null) {
				continue;
			} else if (matcher.group(TokenType.IDENTIFIERS.name()) != null) {tokens.add(new Token(TokenType.IDENTIFIERS, matcher.group(TokenType.IDENTIFIERS.name())));
				continue;
			}}
		return tokens;
	}
	private static void parse(ArrayList<Token> tokens) {
		Iterator<Token> i = tokens.iterator();
		ArrayList<String> printtoken = new ArrayList<String>();
		while (i.hasNext()) {
			Token t1 = i.next();
			String s = (String) t1.data;
			if (s.equalsIgnoreCase("PRINT")) {
				while (i.hasNext())
					printtoken.add(i.next().data);
				print(printtoken);
				if (array.size() != 0) {
					int k = Evaluateprint(array);
					System.out.print(k);
					array.clear();
				}}
			if (s.equalsIgnoreCase("PRINTLN")) {
				while (i.hasNext())
					printtoken.add(i.next().data);
				print(printtoken);
				if (array.size() != 0) {
					int k = Evaluateprint(array);
					System.out.print(k);
					array.clear();
				}
				System.out.println("");
			}
			if (s.equalsIgnoreCase("INTEGER")) {
				ArrayList<String> a = new ArrayList<String>();
				while (i.hasNext())
					a.add(i.next().data);
				integer(a);
			}
			if (s.equalsIgnoreCase("GOTO"))
				gotokey = Integer.parseInt(i.next().data);
			if (s.equalsIgnoreCase("GOSUB")) {
				Token t = i.next();
				gotokey = Integer.parseInt(t.data);
				do {
					retcount++;
				} while (!labels.containsKey(retcount));
				int c1 = retcount;
				st.push(c1);
			}
			if (s.equalsIgnoreCase("RET")) {
				gotokey = st.pop();
			}
			if (s.equalsIgnoreCase("LET")) {
				ArrayList<String> a = new ArrayList<String>();
				while (i.hasNext())
					a.add(i.next().data);
				let(a);
			}
			if (s.equalsIgnoreCase("IF")) {
				ArrayList<Token> a = new ArrayList<Token>();
				while (i.hasNext())
					a.add(i.next());
				ifcase(a);
			}
			if (s.equalsIgnoreCase("INPUT")) {
				ArrayList<String> a = new ArrayList<String>();
				while (i.hasNext())
					a.add(i.next().data);
				input(a);
			}
			if (s.equalsIgnoreCase("end")) {
				System.exit(0);
			}}}
	private static void ifcase(ArrayList<Token> a) {
		int c = 0;
		boolean f = false;
		ArrayList<Token> a1 = new ArrayList<Token>();
		ArrayList<Token> a2 = new ArrayList<Token>();
		for (int i = 0; i < a.size(); i++) {
			if (((String) a.get(i).data).equals("then")) {
				c = i;
			}}
		if (c == 0)
			System.err.println("Invalid If Syntax");
		else {
			for (int i = 0; i <= c; i++)
				a1.add(a.get(i));
			for (int j = c + 1; j < a.size(); j++)
				a2.add(a.get(j));
			f = evalbeforeif(a1);
		}
		if (f)
			parse(a2);
	}
	private static boolean evalbeforeif(ArrayList<Token> a1) {
		int c = 0;
		String s1 = null;
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		for (int i = 0; i < a1.size(); i++) {
			if (((String) a1.get(i).data).equals("<") || ((String) a1.get(i).data).equals(">")
					|| ((String) a1.get(i).data).equals("=")) {
				c = i;
				s1 = (String) a1.get(i).data;
			}}
		if (c == 0)
			System.err.println("Invalid relational operator");
		else {
			for (int i = 0; i < c; i++)
				l1.add(a1.get(i).data);
			for (int j = c + 1; j < a1.size() - 1; j++)
				l2.add(a1.get(j).data);
		}
		int x = Evaluateprint(l1);
		int y = Evaluateprint(l2);
		if (s1.equals("<")) {
			if (x < y)
				return true;
			else
				return false;
		} else if (s1.equals(">")) {
			if (x > y)
				return true;
			else
				return false;
		} else if (s1.equals("=")) {
			if (x == y)
				return true;
			else
				return false;
		} else
			return false;
}
	private static void input(ArrayList<String> a) {
		scanner = new Scanner(System.in);
		sc = scanner.useDelimiter("\\s*");
		ArrayList<String> a1 = new ArrayList<String>();
		for (int i = 0; i < a.size(); i++) {
			if (!a.get(i).equals(","))
				a1.add(a.get(i));
		}
		String input = sc.nextLine();
		String[] parts = input.split(" ");
		for (int i = 0; i < a1.size(); i++) {
			if (((String) a1.get(i)).matches("([a-zA-Z][a-zA-Z0-9_]*)")) {
				if (hm.containsKey(a1.get(i))) {
					int c = Integer.parseInt(parts[i]);
					hm.put((String) a1.get(i), c);
				} else {
					System.out.println("Variable " + a1.get(i) + " is undefined");
					System.exit(0);
				}}}}
	private static void let(ArrayList<String> a) {
		try {
			int c = 0;
			List<String> a1 = new ArrayList<String>();
			List<String> a2 = new ArrayList<String>();
			for (int i = 0; i < a.size(); i++) {
				if (((String) a.get(i)).equals("=")) {
					c = i;
				}}
			if (c == 0)
				System.err.println("Invalid LET Syntax");
			else {
				a1 = a.subList(0, c);
				a2 = a.subList(c + 1, a.size());
			}
			if (a1.size() > 1)
				System.err.println("Invalid identifiers in LET syntax");
			else {
				if (hm.containsKey(a1.get(0))) {
					hm.put((String) a1.get(0), Evaluatelet(a2));
				} else {
					System.err.println("Variable " + a1.get(0) + " is undefined");
					System.exit(0);
				}}
		} catch (java.util.EmptyStackException e) {
			System.err.println("Invalid Format in LET Expression");
			System.exit(0);
		}}
	private static int Evaluatelet(List<String> a1) {
		ArrayList<String> a2 = new ArrayList<String>();
		for (int i = 0; i < a1.size(); i++)
			a2.add(a1.get(i));
		ArrayList anew = new ArrayList();
		for (int i = 0; i < a2.size(); i++) {
			String curr = (String) a2.get(i);
			if (((String) a2.get(i)).matches("([a-zA-Z][a-zA-Z0-9_]*)")) {
				if (hm.containsKey(curr)) {
					Integer j = Integer.parseInt(hm.get(curr).toString());
					anew.add(j);
				} else {
					System.err.println("Variable " + a2.get(i) + " is not defined");
					System.exit(1);
				}
			} else
				anew.add(curr);
		}
		String s = anew.toString();
		return evaluate(s);
	}
	public static void integer(ArrayList a) {
		Iterator a1 = a.iterator();
		while (a1.hasNext()) {
			String s = (String) a1.next();
			if (hm.containsKey(s) && !s.equals(",")) {
				System.err.println("Variable " + s + " already defined");
			} else {
				if (!s.equals(","))
					hm.put(s, 0);
			}}}
	private static void print(ArrayList printtoken) {
		Iterator i = printtoken.iterator();
		int c = 1;
		while (i.hasNext()) {
			String s = (String) i.next();
			if (s.startsWith("\"")) {
				String x = s.toString().replaceAll("^\"|\"$", "");
				System.out.print(x);
			} else if (s.toString().equals(",")) {
				if (array.size() != 0) {
					int k = Evaluateprint(array);
					System.out.print(k);
					array.clear();
				}
			} else
				array.add(s);
		}}
	private static int Evaluateprint(ArrayList a2) {
		ArrayList anew = new ArrayList();
		for (int i = 0; i < a2.size(); i++) {
			String curr = (String) a2.get(i);
			if (((String) a2.get(i)).matches("([a-zA-Z][a-zA-Z0-9_]*)")) {
				if (hm.containsKey(curr)) {
					Integer j = Integer.parseInt(hm.get(curr).toString());
					anew.add(j);
				} else {
					System.err.println("Variable " + a2.get(i) + " is not defined");
					System.exit(1);
				}
			} else
				anew.add(curr);
		}
		String s = anew.toString();
		return evaluate(s);
	}
	public static int evaluate(String expression) {
		char[] tokens = expression.toCharArray();
		Stack<Integer> num = new Stack<Integer>();
		Stack<Character> operator = new Stack<Character>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i] == ' ')
				continue;
			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				num.push(Integer.parseInt(sbuf.toString()));
			} else if (tokens[i] == '(')
				operator.push(tokens[i]);
			else if (tokens[i] == ')') {
				while (operator.peek() != '(')
					num.push(calculate(operator.pop(), num.pop(), num.pop()));
				operator.pop();
			} else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
				while (!operator.empty() && checklevel(tokens[i], operator.peek()))
					num.push(calculate(operator.pop(), num.pop(), num.pop()));
				operator.push(tokens[i]);
			}}
		while (!operator.empty())
			num.push(calculate(operator.pop(), num.pop(), num.pop()));
		return num.pop();
	}
	public static boolean checklevel(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}
	public static int calculate(char op, int b, int a) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}}