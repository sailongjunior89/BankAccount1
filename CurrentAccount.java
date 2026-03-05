package polymorphism;

public class CurrentAccount extends Account {

	private static double interestRate = 0.25; 
	
	public CurrentAccount(String number, String holderId, double balance) {
		super(number, holderId, balance);
	}
	
	@Override
	public double calculateInterest() {
		return getBalance() * interestRate / 100.0;
	}
	
	@Override
	public String toString() {
		return "[Current Account] " + super.toString();
	}
	
}
