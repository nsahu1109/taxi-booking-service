
public class PrintForSMS implements PrintTicket{

	@Override
	public void createTicket(int distance, int traveller, String source, String destination, int tripFare) {
		System.out.println("Booking Successful" + '\n' +
                source + " " + '>' + " " +  destination +  '\n' + "Travellers=" + traveller
                + '\n' + "Total=" + tripFare + '\n');
	    }

	}

