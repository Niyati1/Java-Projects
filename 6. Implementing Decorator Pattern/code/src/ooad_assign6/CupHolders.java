package ooad_assign6;

public class CupHolders extends Additional_Features {
	

	Car car;
	 public	CupHolders(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", 32oz Cup Holders";
		}
		public  double cost() {
			return 1 + car.cost();
		}


}
