
public class Trip {

	private String source;
	private String destination;
	private int traveller;
	
	
	public Trip() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Trip(String source, String destination, int traveller) {
		super();
		this.source = source;
		this.destination = destination;
		this.traveller = traveller;
	}
	
	

	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getTraveller() {
		return traveller;
	}


	public void setTraveller(int traveller) {
		this.traveller = traveller;
	}


	public int getTaxiFare(int traveller) {
		int distance = getDistance(source, destination);
		int remainingDistance = distance - 100;
		int totalAmount = (750 * traveller) + (5* remainingDistance * traveller);
		return totalAmount;
		
	}

	public int getDistance(String source,String destination) {
		int distance = 0;
		if(source=="PUNE" && destination=="MUMBAI" || source=="MUMBAI" && destination=="PUNE") {
			distance = 120;
		}else if (source=="PUNE" && destination=="NASIK" || source=="NASIK" && destination=="PUNE") {
			distance=200;
		}else if (source=="MUMBAI" && destination=="GOA" || source=="GOA" && destination=="MUMBAI") {
			distance =350;
		}
		return distance;
	}
	

}
