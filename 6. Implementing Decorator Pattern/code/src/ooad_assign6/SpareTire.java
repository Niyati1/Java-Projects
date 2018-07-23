package ooad_assign6;

public class SpareTire extends Additional_Features {
	Car car;
	 public	SpareTire(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Spare Tire";
		}
		public  double cost() {
			return 400 + car.cost();
		}

}
