package assignment2;

public class SuitableFlight extends Customer {

	private Customer cus;
	private double [] priceList;
	public SuitableFlight() {
		// TODO Auto-generated constructor stub
		priceList=new double[] {0.0};
		cus=new Customer();
	}
	public SuitableFlight(double[]price,Customer CUS) {
		// TODO Auto-generated constructor stub
		priceList=price;
	}
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	public double[] getPriceList() {
		return priceList;
	}
	public void setPriceList(double[] priceList) {
		this.priceList = priceList;
	}
	
}
