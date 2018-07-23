package ooad_assign5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class MyArrayIterator implements MyIterator {

	ArrayList<StudentData> list;
	int current,last;
	
	public MyArrayIterator(ArrayList<StudentData> list){
		this.list=list;
		current = 0;
		last=list.size();
	}
	
	@Override
	public void First() {
		// TODO Auto-generated method stub
		current=0;
	}

	@Override
	public void Next() {
		// TODO Auto-generated method stub
		current++;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");  
		return list.get(current).GetName()+" "+list.get(current).GetMajor()+" "+list.get(current).GetCollege()+" "+list.get(current).GetCreditHoursAttempted()+" "+list.get(current).GetCreditHoursEarned()+" "+list.get(current).GetQualityPoints()+" GPA: "+ Double.valueOf(df.format((double)list.get(current).GetQualityPoints()/list.get(current).GetCreditHoursAttempted()));
	}

	
	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return current==last;
	}

	public void sort() {
		// TODO Auto-generated method stub
		Collections.sort(list);
	}
}
