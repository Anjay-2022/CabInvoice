package testunit;

import java.util.Objects;

public class InvoiceSumarry {
	
	public int noOfRide;
	public double totalfare;
	public double averagefare;

	public InvoiceSumarry(int noOfRide, double totalfare) {
		this.noOfRide=noOfRide;
		this.totalfare=totalfare;
		this.averagefare=this.totalfare/this.noOfRide;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSumarry other = (InvoiceSumarry) obj;
		return Double.doubleToLongBits(averagefare) == Double.doubleToLongBits(other.averagefare)
				&& noOfRide == other.noOfRide
				&& Double.doubleToLongBits(totalfare) == Double.doubleToLongBits(other.totalfare);
	}
}
