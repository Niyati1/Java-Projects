package ooad_assign5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String args[]){
	LAStudents la_students = new LAStudents();
	TechStudents tech_students = new TechStudents();
	
	//add tech_students data
	
	tech_students.addStudent("Smith", "William", "CompSci", "Tech",90 ,90 ,340 );
	tech_students.addStudent("Jones", "Michael", "CompEnr", "Tech",45,45,100);
	tech_students.addStudent("Carter", "Mary", "SoftEng", "Tech",128,124,270 );
	tech_students.addStudent("Harris", "Harry", "CompSci", "Tech",30 ,30 ,90 );
	tech_students.addStudent("Wilson", "Brian", "CompSci", "Tech",90 ,90 ,270 );
	tech_students.addStudent("Adams", "Susan", "CompEng", "Tech",12 ,12 ,45 );
	tech_students.addStudent("Washington", "George", "SoftEng", "Tech",96 ,96,360 );
	tech_students.addStudent("Madison", "James", "CompSci", "Tech",78 ,76 ,120 );
	tech_students.addStudent("Madison", "Dolly", "CompSci", "Tech",87 ,87 ,256);
	
	
	//add la_students data
	
	la_students.addStudent("Wagner","Richardo","English","LA",80,80,240);
	la_students.addStudent("DerfleigendeHollaender","Albert","History","LA",45,45,100);
	la_students.addStudent("Walkure","B","PoliSci","LA",128,124,270);
	la_students.addStudent("Lohengrin","Harry","English","LA",30,30,80);
	la_students.addStudent("Gotterdammerung","Brian","English","LA",80,80,270);
	la_students.addStudent("Siegfried","Susan","History","LA",12,12,45);
	la_students.addStudent("Renizi","George","PoliSci","LA",86,86,330);
	la_students.addStudent("Rheingold","Andrew","PoliSci","LA",62,60,145);
	la_students.addStudent("Tannhauser","James","English","LA",78,76,120);
	la_students.addStudent("Johanneskepplerstrasse","A","English","LA",87,87,256);
	
	ArrayList<StudentData> list = new ArrayList<StudentData>();
	ArrayList<StudentData> list_tech = new ArrayList<StudentData>(Arrays.asList(tech_students.getStudents()));
	list_tech.removeAll(Collections.singleton(null));

	list.addAll(la_students.getStudents());
	list.addAll(list_tech);
	MyArrayIterator myIter = new MyArrayIterator(list);
	myIter.sort();
	PrintAll(myIter);
	}

    private static void PrintAll(MyIterator myIter){
        myIter.First();
        
        while(!myIter.IsDone()){
            System.out.println(myIter.CurrentItem());
            myIter.Next();
        }   
        
    }
}
