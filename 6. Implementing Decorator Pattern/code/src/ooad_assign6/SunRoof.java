package ooad_assign6;

public class SunRoof extends Additional_Features {
	
	Car car;
	 public	SunRoof(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Sun Roof";
		}
		public  double cost() {
			if(car.getCarType().equals("C"))
			return 1900 + car.cost();
			else if(car.getCarType().equals("E"))
			return 2200 + car.cost();
			else 
			return 3000 + car.cost();
				
		}


}
