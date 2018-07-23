package ooad_assign6;

public abstract class Car {
	
	public int Total_Price=0;
	protected	String	desc ;
	protected static String car_type="";
    public	Car() {
	    desc = "unknown car";
    }
     public String	getDesc() {
	    return desc;
    }
     
    public void setCarType(String s){
    	car_type=s;
    }
    
    public String getCarType(){
    	return car_type;
    }
     
     
     public double cost(){
	    return 0;
    }

}
