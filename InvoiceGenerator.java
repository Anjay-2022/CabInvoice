package testunit;

public class InvoiceGenerator {
	
	public static final int MINIMUM_FARE = 5;
	public static final int COST_PER_TIME = 1;
	public static final double MINIMUM_COST_PER_KILOMETER = 10;
	
	public double calculateFare(double distance ,int time) {
		double totalfare= distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		return Math.max(totalfare,MINIMUM_FARE);

	}

	public InvoiceSumarry calculateFare(Ride[] rides) {
		double totalfare=0;
		for (Ride ride : rides) {
			totalfare += this.calculateFare(ride.distance,ride.time);
		}
		return new InvoiceSumarry(rides.length,totalfare);
	}
}
