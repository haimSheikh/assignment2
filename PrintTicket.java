package assignment2;

public class PrintTicket {
	private double price;
	private Customer passengerData;
	private String destination,nameOfPlane,Class;
	private SuitableFlight flight;
	public PrintTicket() {
		// TODO Auto-generated constructor stub
		price=0.0;
		passengerData=new Customer();
		flight=new SuitableFlight();
		destination=nameOfPlane=Class="";
	}
	public PrintTicket(double p,Customer data,String D,String NP,String C, SuitableFlight SF) {
		// TODO Auto-generated constructor stub
		price=p;
		passengerData=data;
		flight=SF;
		destination=D;
		nameOfPlane=NP;
		Class=C;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Customer getPassengerData() {
		return passengerData;
	}
	public void setPassengerData(Customer passengerData) {
		this.passengerData = passengerData;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getNameOfPlane() {
		return nameOfPlane;
	}
	public void setNameOfPlane(String nameOfPlane) {
		this.nameOfPlane = nameOfPlane;
	}
	public String getClasss() {
		return Class;
	}
	public void setClasss(String class1) {
		Class = class1;
	}
	public SuitableFlight getFlight() {
		return flight;
	}
	public void setFlight(SuitableFlight flight) {
		this.flight = flight;
	}
}
