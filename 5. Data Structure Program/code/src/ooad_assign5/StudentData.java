package ooad_assign5;

public class StudentData implements Comparable<StudentData> {
	private String LastName, FirstName;
	private String Major;
	private String College;
	private int CreditHoursAttempted;
	private int CreditHoursEarned;
	private int QualityPoints;

	public StudentData(String ln, String fn, String mj, String col, 
                           int cha, int che, int qp)
	{
		LastName = ln;
		FirstName = fn;
		Major = mj;
		College = col;
		CreditHoursAttempted = cha;
		CreditHoursEarned = che;
		QualityPoints = qp;
	}
	
	public String GetName()
	{
		return LastName + ", " + FirstName;
	}
	public String GetCollege()
	{
		return College;
	}
	public String GetMajor()
	{
		return Major;
	}
	public int GetCreditHoursAttempted()
	{
		return CreditHoursAttempted;
	}
	public int GetCreditHoursEarned()
	{
		return CreditHoursEarned;
	}
	public int GetQualityPoints()
	{
		return QualityPoints;
	}
	@Override
	public int compareTo(StudentData s) {
		// TODO Auto-generated method stub
		return this.LastName.compareTo(s.LastName);
	}

}
