package polymorphism;

public class OverdraftAccount extends Account {

	private static double interestRate = 0.25;
	private static double overdraftInterestRate = 6;
	
	public OverdraftAccount(String number, String holderId, double balance) {
		super(number, holderId, balance);
	}
	
	@Override
	public boolean withdraw(double amount) {		
		setBalance(getBalance() - amount);
		return true;
	}
	
	@Override
	public double calculateInterest() {
		if (getBalance() > 0) {
			return getBalance() * interestRate / 100;
		}
		else {
			return getBalance() * overdraftInterestRate / 100;
		}
		
	}
	
	@Override
	public String toString() {
		return "[Overdraft Account] " + super.toString();
	}
	
}
