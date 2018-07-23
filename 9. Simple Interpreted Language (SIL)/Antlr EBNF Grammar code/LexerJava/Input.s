// Scenario 1 (String Literals, Print no CR LF, PRINTLN CR LF)
PRINT ("Hello")
PRINT (" World")
PRINTLN ("Hi")
PRINTLN ("Good Morning")
// Scenario 2 (Defining Integer, LET Identifier=expression)
INTEGER A, B
LET A=5
LET B =   6
PRINTLN (A+B)
INTEGER C
LET C = B-A
PRINTLN (C)
//Scenario 3 (Addition, Subtraction, Division, Multiplication, parenthesis, may contain _)
INTEGER D, E_1, e_2
LET D = 8
PRINTLN (D)
LET E_1 = (D + 8) / 2  //8
PRINTLN (E_1)
LET e_2 = ((E_1 * 3) + 6) /10 //3
PRINTLN (e_2)
INTEGER Final_Total
LET Final_Total = E_1 - e_2 //5
PRINTLN (Final_Total) 
//Scenario 4 (cannot be duplicated, are case sensitive)
INTEGER F 
PRINTLN (F)
INTEGER f
PRINTLN (f) 
INTEGER Duplicate
PRINTLN (Duplicate)
INTEGER Duplicate //error
//Scenario 5 (Must be defined by integer)
PRINTLN (X1) //Error
//Scenario 5.1 (Must be defined by integer)
LET X = 10 //Error
//Scenario 5.2 (Must be defined by integer)
INPUT Y //Error
//Scenario 6 (Must start with A..Z | a..z and may contain 0..9 and _)
INTEGER _X //Error
INTEGER Y_2
PRINTLN (Y_2)
// Scenario 7 (Signed Input)
INTEGER Z1, Z2
INPUT Z1 //Enter negative value
INPUT Z2 //Enter negative value
PRINTLN (Z1 + Z2)
END