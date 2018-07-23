package ooad_assign6;

public class PumaSkinSeats extends Additional_Features {
	
	Car car;
	 public	PumaSkinSeats(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Puma Skin Seats";
		}
		public  double cost() {
			if(car.getCarType().equals("E"))
			return 7000 + car.cost();
			else{
				System.err.println("Puma Skin Seats not available on "+car.getCarType());
				return 0 + car.cost();
			}
		}


}
