package ooad_assign6;

public class TowingPackage extends Additional_Features {
	Car car;
	 public	TowingPackage(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Towing Package";
		}
		public  double cost() {
			return 3000 + car.cost();
		}

}
