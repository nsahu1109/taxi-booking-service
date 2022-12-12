
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trip trip = new Trip();
	
		PrintTicket print = new PrintForTicket();
		PrintTicket printSMS = new PrintForSMS();
		
		 int taxiFare = trip.getTaxiFare(2);
		 int distance = trip.getDistance("PUNE", "MUMBAI");
		 
		 
		 
		 print.createTicket(distance, 2, "PUNE", "MUMBAI", taxiFare);
		 printSMS.createTicket(distance, 1, "PUNE", "NASHIK", taxiFare);
		 
	}

}
