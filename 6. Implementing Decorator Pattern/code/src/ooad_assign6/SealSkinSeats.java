package ooad_assign6;

public class SealSkinSeats extends Additional_Features {
	
	Car car;
	 public	SealSkinSeats(Car c) {
			car =c;
		}
		public String  getDesc() {
			return car.getDesc() + ", Seal Skin Seats";
		}
		public  double cost() {
			if(car.getCarType().equals("C"))
			return 5600 + car.cost();
			else{
				System.err.println("Seal Skin Seats not available on "+car.getCarType());
				return 0 + car.cost();
			}
		}
			

}
