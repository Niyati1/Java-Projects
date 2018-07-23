package ooad_assign5;

public class TechStudents {
	
	static final int NumUTS = 1000;
	StudentData[] TechStudentData;//sized to NumUTS
	public int count =0;
	
	public TechStudents()
	{
		TechStudentData = new StudentData[NumUTS];
	}
	public void addStudent(String l, String f, String m, String c, 
                               int cha, int che, int qp)
	{
		TechStudentData[count]=new StudentData(l,f,m,c,cha,che,qp);
		count++;
	}

	public StudentData[] getStudents() {
		return TechStudentData;
	}
}
