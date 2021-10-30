package assignment2;
import java.util.*;
public class AvailableFlight {

	private double lowestFare;
	private int [] availableSeats;
	private Date particularDate;
	private AvailableFlight() {
		// TODO Auto-generated constructor stub
		lowestFare=0.0;
		particularDate=new Date();
		availableSeats=new int [] {0};
	}
	public Date getParticularDate() {
		return particularDate;
	}
	public void setParticularDate(Date particularDate) {
		this.particularDate = particularDate;
	}

	public double getLowestFare() {
		return lowestFare;
	}
	public void setLowestFare(double lowestFare) {
		this.lowestFare = lowestFare;
	}
	public int[] getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int[] availableSeats) {
		this.availableSeats = availableSeats;
	}

}
