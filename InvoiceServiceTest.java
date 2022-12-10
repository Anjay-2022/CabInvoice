package testunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
	InvoiceGenerator invoiceGenerator=null;
	
	@Before
	public void setUp() throws Exception {
		 invoiceGenerator = new InvoiceGenerator();		
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnFare() {
		//InvoiceGenerator invoiceGenerator = new InvoiceGenerator();   this line replace byline 8to13
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		System.out.println(fare);
		Assert.assertEquals(25.0,fare,0.0);		
		
	}
	@Test
	public void multipleRides() {
		//InvoiceGenerator invoiceGenerator = new InvoiceGenerator();   this line replace byline 8to13
		Ride[] rides =  { new Ride(2.0,5), new Ride(0.1,2)};
		InvoiceSumarry summary =invoiceGenerator.calculateFare(rides);
		InvoiceSumarry expectedSummary = new InvoiceSumarry(2,30.0);
		Assert.assertEquals(expectedSummary,summary);
		
		
	}
	
}
