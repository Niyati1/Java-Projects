package ooad_assign6;

public class KomodoDragonSeats extends Additional_Features {
	Car car;
	 public	KomodoDragonSeats(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Komodo Dragon Seats";
		}
		public  double cost() {
			if(car.getCarType().equals("CS"))
			return 12000 + car.cost();
			else{
				System.err.println("Komodo Dragon Seats not available on "+car.getCarType());
				return 0 + car.cost();
			}
		}
		

}
