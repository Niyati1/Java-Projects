package ooad_assign6;

public class V12Engine extends Additional_Features {
	Car car;
	 public	V12Engine(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", V12Engine";
		}
		public  double cost() {
			if(car.getCarType().equals("E")||car.getCarType().equals("CS"))
			return 6000 + car.cost();
			else{
				System.err.println("V-12 not available on "+car.getCarType());
				return 0 + car.cost();
			}
				
		}


}
