package ooad_assign6;

public class BlaupunktRadio extends Additional_Features {
	Car car;
	 public	BlaupunktRadio(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Blaupunkt New York 800 Radio";
		}
		public  double cost() {
			return 900 + car.cost();
		}

}
