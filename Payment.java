package assignment2;

public class Payment {

	private String creditCardDetails;
	private float accBalance;
	private boolean confirmPayment;
	public Payment() {
		// TODO Auto-generated constructor stub
		creditCardDetails="";
		accBalance=0;
		confirmPayment=false;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	public Payment(String card,boolean pay) {
		// TODO Auto-generated constructor stub
		creditCardDetails=card;
		confirmPayment=pay;
	}
	public String getCreditCardDetails() {
		return creditCardDetails;
	}
	public void setCreditCardDetails(String creditCardDetails) {
		this.creditCardDetails = creditCardDetails;
	}
	public boolean isConfirmPayment() {
		return confirmPayment;
	}
	public void setConfirmPayment(boolean confirmPayment) {
		this.confirmPayment = confirmPayment;
	}
	public void displayPayment()
	{
		System.out.println(creditCardDetails+accBalance);
	}
}
