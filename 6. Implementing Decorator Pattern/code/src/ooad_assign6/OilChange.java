package ooad_assign6;

public class OilChange extends Additional_Features {
	Car car;
	 public	OilChange(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Free First Oil Change";
		}
		public  double cost() {
			return 75 + car.cost();
		}

}
