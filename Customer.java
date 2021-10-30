package assignment2;
import java.util.*;
public class Customer {
	private String name,address,gender,nationality,passportNumber,source,destination,planeType;
	private int age;
	private Date flightDate;
	public Customer() {
		// TODO Auto-generated constructor stub
		age=0;
		name="";
		address="";
		gender="";
		nationality="";
		passportNumber="";
		source="";
		destination="";
		planeType="";
		flightDate=new Date();
	}
	public Customer(int Age,String Name,String Address,String Gender,String Nationality,String PassportNumber,String Source, String Destination, String PlaneType, Date date) {
		// TODO Auto-generated constructor stub
		if (Age>0)
		{
			age=Age;			
		}
		else
		{
			age=0;
		}
		name=Name;
		flightDate=date;
		source=Source;
		destination=Destination;
		planeType=PlaneType;
		address=Address;
		if (Gender=="MALE" || Gender=="male" || Gender=="FEMALE" || Gender=="female")
		{
			gender=Gender;			
		}
		else
		{
			gender="OTHER";
		}
		nationality=Nationality;
		passportNumber=PassportNumber;
	}
	public String getName() {
		return name;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if (gender=="male" ||gender=="female" ||gender=="MALE" ||gender=="FEMALE" )
		{
			this.gender = gender;
		}
		else
		{
			this.gender="UNKNOWN";
		}
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
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
	public String getPlaneType() {
		return planeType;
	}
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayPassenger()
	{
		System.out.println("Customer name is : "+name);
		System.out.println("Customer age is : "+age);
		System.out.println("Customer gender is : "+gender);
		System.out.println("Customer nationality is : "+nationality);
		System.out.println("Customer address is : "+address);
		System.out.println("Customer passport number is : "+passportNumber);
		System.out.println("Customer source is : "+source);
		System.out.println("Customer destination is : "+destination);
		System.out.println("Customer plane type is : "+planeType);
		System.out.println("Customer's flight date is : "+flightDate);
		
	}

}
