package assignment2;
import java.util.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub

	}
	public static void main(String[] args) {
		//necessary data start
		String[] planeType= {"Airbus A330/A330neo","Airbus A350","Boeing 737 NG/737 MAX","Boeing 747-8"};
		String[] cities= {"Islamabad","Karachi","Lahore","Multan","Faisalabad","Sialkot","London","Paris","Manchester","Thailand"};
		int [] emptySeats= {1,8,9,15,17,18,23,29,40,26,30};
		int seatSelected;
		//necessary data end
		System.out.println("Welcome to out flight reservation system\nPlease enter your information below\n");
		//Add new customer Start
		Customer cus=new Customer();
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		//input name
		System.out.println("Please enter your name below ");
		String name= sc.nextLine();
		cus.setName(name);
		//input gender		
		System.out.println("Please enter your gender below ");
		String gender= sc.nextLine();
		cus.setGender(gender);
		//input nationality
		System.out.println("Please enter your nationality below ");
		String nat= sc.nextLine();
		cus.setNationality(nat);
		//input address
		System.out.println("Please enter your address below ");
		String add= sc.nextLine();
		cus.setAddress(add);
		//input passport number
		System.out.println("Please enter your passport number below ");
		String ppn= sc.nextLine();
		cus.setPassportNumber(ppn);
		//input customer age
		System.out.println("Enter your age below");
		int age=sc.nextInt();
		if (age<1)
		{
			System.out.println("invalid age entered.\nBy default 18 selected");
		}
		else {
			cus.setAge(age);
		}
		//input source
		System.out.println("We only provide service to a few places till now.\n");
		System.out.println("For Islamabad press 1.\nFor Karachi press 2.\nFor Lahore press 3.\nFor Multan press 4.\nFor Faisalabad press 5.\nFor Sialkot press 6.\nFor London press 7.\nFor Paris press 8.\nFor Manchester press 9.\nFor Thailand press 10");
		int src=sc.nextInt();
		if (src>0 && src<11) {
			cus.setSource(cities[src-1]);
		}
		else {
			System.out.println("Invalid source entered.\nRandom source sekected");
			src=(int) (Math.random()*(10-1)+1);
			cus.setSource(planeType[src-1]);
		}
		//input destination
		System.out.println("We only provide service to a few places till now.\n");
		System.out.println("For Islamabad press 1.\nFor Karachi press 2.\nFor Lahore press 3.\nFor Multan press 4.\nFor Faisalabad press 5.\nFor Sialkot press 6.\nFor London press 7.\nFor Paris press 8.\nFor Manchester press 9.\nFor Thailand press 10");
		int des=sc.nextInt();
		if (des>0 && des<11) {
			cus.setDestination(cities[src-1]);
		}
		else {
			System.out.println("Invalid source entered.\nRandom source selected");
			src=(int) (Math.random()*(10-1)+1);
			cus.setDestination(cities[src-1]);
		}
		//input plane type
		System.out.println("For Airbus A330/A330neo press 1.\nFor Airbus A350 press 2.\nFor Boeing 737 NG/737 MAX press 3.\nFor Boeing 747-8 press 4.\n");
		int pT=sc.nextInt();
		if(pT>0 && pT<5)
		{
			cus.setPlaneType(planeType[pT-1]);
		}
		else {
			System.out.println("Invalid plane type entered.\nRandom plane type selected");
			pT=(int) (Math.random()*(4-1)+1);
			cus.setPlaneType(planeType[pT-1]);
		}
		//Add new customer end

		//ask for seat number
		System.out.println("We have collected all the necessary information.\nFollowing are the available seats in your flight, select 1");
		for (int i=0;i<emptySeats.length;i++) {
			System.out.println(emptySeats[i]);
		}
		int SC=sc.nextInt();
		for (int i=0;i<emptySeats.length;i++) {
			if (SC==emptySeats[i]) {
				seatSelected=SC;
			}
		}
		System.out.println("We have collected all the necessary information.\nHere is your ticket\n\n\n");
		System.out.println("Customer name is : "+cus.getName());
		System.out.println("Customer age is : "+cus.getAge());
		System.out.println("Customer source is : "+cus.getSource());
		System.out.println("Customer destination is : "+cus.getDestination());
		System.out.println("Customer seat number is : "+SC);
		System.out.println("Travel date is : "+new Date());
	}
}
