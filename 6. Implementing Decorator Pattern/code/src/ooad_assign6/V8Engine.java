package ooad_assign6;

public class V8Engine extends Additional_Features {
	Car car;
	 public	V8Engine(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", V8Engine";
		}
		public  double cost() {
			
			if(car.getCarType().equals("C"))
			return 4000 + car.cost();
			else{
				System.err.println("V-8 not available on "+car.getCarType());
				return 0 + car.cost();
			}
		}

}
