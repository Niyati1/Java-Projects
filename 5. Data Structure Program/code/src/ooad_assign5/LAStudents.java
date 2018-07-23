package ooad_assign5;

import java.util.ArrayList;

public class LAStudents {
	ArrayList<StudentData> Students;
	public LAStudents()
	{
		Students = new ArrayList<StudentData>();
	}
	public void addStudent(String l, String f, String m, String c, 
                               int cha, int che, int qp)
	{ 
		Students.add(new StudentData(l,f,m,c,cha,che,qp));
	}

	public ArrayList<StudentData> getStudents() {
		return Students;	
	}
}
