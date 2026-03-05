package polymorphism;

public class SavingsAccount extends Account {

	private static double interestRate = 1.0;

	public SavingsAccount(String number, String holderId, double balance) {
		super(number, holderId, balance);
	}

	@Override
	public double calculateInterest() {
		return getBalance() * interestRate / 100;
	}

	@Override
	public String toString() {
		return "[Savings Account] " + super.toString();
	}
}
