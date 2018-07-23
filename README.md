# Java-Projects

This repository includes various independent and class projects implemented in Java. Below is the brief description of the projects:

1. Java Multithreading:
    - This project implements the working of multhreading such that a new thread is started for each file and the files are processed concurrently. 
    
2. Tracing Aspect for Notepad program :
  - Below are the list of commands traced in this class assignment:
    -	show the creation of every object in Notepad (as it  happens)
    - show the execution of every method in Notepad (as it happens) with its COMPLETE method signature (return type , class(es), name and parameters
    - Every 10th line of output is followed by an blank line
    -	Type “The quick brown fox”
    - Delete “brown”
    -	Undelete “brown”
    -	Save the file as “qbf”
    -	Exit the program from the File Menu
    
3. Creating Generic ArrayList:
  - In this project a generic arraylist was implemented from scratch without using Java's ArrayList or any predefined type or class.
  - Below arraylist operations are implemented:
    - public MyArrayList(int initialSize)
    -	public MyArrayList()
    - public int size()
    - public boolean isEmpty()
    - public void add(int index, E element)
    -	public boolean add(E e)
    - public E get(int index)
    - private E elementData(int index)
    - private void rangeCheck(int index)
    - public void grow(int minCap)
    - public E set(int index, E element)
    - private void rangeCheckForAdd(int index)
    - private String outOfBoundsMsg(int index)
    - public E remove(int index)

4. RPN Calculator:
  - In this project, a RPN calculator was implemented using Command Design Pattern, that supports operations +, -, *, /, and exponentiation.
  - RPN is Reverse Polish Notation, a parenthesis-less way of representing arithmetic expressions. 5 +4 in infix is 5 4 + in RPN. The order of operations is determined by the placement of the operands and operators. Thus 3*4 + 5*6 in infix is 3 4 * 5 6 * +. Read expressions at the command prompt of the program. Output is a single integer. 
  - After completion of the evaluation, the user can “undo” and “redo” each operation one by one, producing an intermediate expression. Undo is supported all the back to the original expression. Redo is supported all the way to the end of the expression. 
  - stacks content for each undo operation is printed
  
5. Data Structure Program:
  - In this project withou modifying array or arraylist, a program is designed and implemented using the existing data structures but needs only one loop to print all the data from internal representation of a domain.
  
6. Implementing Decorator Pattern:
 - In this project decorator pattern was implemented to build a model of car with various features.
 
7. Implementing State Pattern:
 - In this project state pattern was implemented to design an Finite State Automata (FSA) and to analyze what words are accepted by this FSA.
 
8. Ad-Hoc Lexer:
 - In this project a lexer was defined using Java and ANTLR grammar file. With a text file as input, input stream was separated into tokens of the following types: CONSTANT, LITERAL, SPECIAL, IDENTIFIER,	RESERVED. 

9. Simple Interpreted Language (SIL):
 - In this project a simple inpterpreter was developed using EBNF Grammar for simple arithmetic, relational and logical operations
 - SIL has below keywords: PRINT, PRINTLN, INTEGER, INPUT, LET , END, GOTO, GOTOSUB, IF, RET
 - SIL commands are all in caps and support integer addition, subtraction and multiplication
 - SIL expressions have parenthesis and they may alter order of operations and be nested
 - Expressions may contain integer identifiers, +, -, *, / , (, ), and integer constants


 
 
