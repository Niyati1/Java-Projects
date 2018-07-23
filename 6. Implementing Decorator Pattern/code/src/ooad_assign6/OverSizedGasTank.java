package ooad_assign6;

public class OverSizedGasTank extends Additional_Features {

	Car car;
	 public	OverSizedGasTank(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Over Sized Gas Tank";
		}
		public  double cost() {
			return 900 + car.cost();
		}
}
