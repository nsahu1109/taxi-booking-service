
public class PrintForTicket implements PrintTicket{
 
	@Override
	  public void createTicket(int distance, int traveller,String source, String destination, int tripFare) {
		  System.out.println("Taxi Ticket" + '\n' +  "---------------------" + '\n' +
                  "source=" + source + '\n' + "destination=" + destination +  '\n' + "Kms=" + distance + '\n' + "No. of Travellers=" + traveller
                  + '\n' + "Total=" + tripFare + '\n');
	    }
 

}
