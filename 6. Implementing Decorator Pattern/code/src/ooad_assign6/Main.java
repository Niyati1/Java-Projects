package ooad_assign6;

import java.util.Scanner;

public class Main  {

	public static void main(String args[]){
		
		System.out.println("Enter Car type: "+"\n"+"1. C"+"\n"+"2. E"+"\n"+"3. CS");
		Scanner sc= new Scanner(System.in);
		int car_choice = sc.nextInt();
		Car c=null;
		
		
		switch(car_choice){
		case 1:
			c= new Car_C();
			break;
		case 2:
			c= new Car_E();
			break;
		case 3:
			c= new Car_CS();
			break;
		default:
			System.err.println("Invalid option");
			
		}
		System.out.println("You selected: " + c.getDesc() + " Cost is: "+ c.cost());
		System.out.println("Enter Additional features: "+"\n" + "1. V-8 Engine"+"\n"+"2. V-12 Engine"+"\n"+"3. Sun Roof"+"\n"+"4. Towing Package"+"\n"+"5. Oversized Gas Tank"+"\n"+"6. Puma Skin Seats"+"\n"+"7. Seal Skin Seats"+"\n"+"8. Komodo Dragon Skin Seats"+"\n"+"9. 32oz Cup Holders"+"\n"+"10. Blaupunkt New York 800 Radio"+"\n"+"11. Spare Tire"+"\n"+"12. Free First Oil Change"+"\n"+"13. Quit");
		
		int additional_features = sc.nextInt();
		
		do{
			
			switch(additional_features){
			case 1:
				c= new V8Engine(c);
				break;
			case 2:
				c= new V12Engine(c);
				break;
			case 3:
				c= new SunRoof(c);
				break;
			case 4:
				c= new TowingPackage(c);
				break;	
			case 5:
				c= new OverSizedGasTank(c);
				break;	
			case 6:
				c= new PumaSkinSeats(c);
				break;	
			case 7:
				c= new SealSkinSeats(c);
				break;
			case 8:
				c= new KomodoDragonSeats(c);
				break;
			case 9:
				c= new CupHolders(c);
				break;	
			case 10:
				c= new BlaupunktRadio(c);
				break;
			case 11:
				c= new SpareTire(c);
				break;
			case 12:
				c= new OilChange(c);
				break;
			}
			additional_features=sc.nextInt();
		} while(additional_features!=13);
		System.out.println("New Order"+"\n"+"You selected: " + c.getDesc() + "\n" + "Cost is: "+ c.cost()+"\n"+"End Order");
		}
	}


