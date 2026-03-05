package polymorphism;

public class Account {
	/**
	 * TODO: create attributes.
	 * 
	 * This class has 3 attributes: number : String, private. holderId : String,
	 * private. balance: double, private.
	 */
	private String number;
	private String holderId;
	private double balance;
	
	/**
	 * TODO: create constructor.
	 * 
	 * This constructor receives 3 values and initializes the 3 attributes
	 * accordingly.
	 */
	public Account(String number, String holderId, double balance) {
		this.number = number;
		this.holderId = holderId;
		this.balance = balance;
	}

	/**
	 * TODO: create getters and setters. These getters and setters expose the
	 * private attributes.
	 *
	 * Note: number should be retrieve-only, i.e. can not be set from outside.
	 */
	public String getNumber() {
		return this.number;
	}

	public String getHolderId() {
		return this.holderId;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setHolderId(String holderId) {
		this.holderId = holderId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	/**
	 * TODO: create method display.
	 * 
	 * This method prints out the number, holder id and balance of the account.
	 */
	public void display() {
		System.out.printf("Account number %s, holder %s, balance %.1f\n", this.number, this.holderId, this.balance);
	}

	/**
	 * . TODO: implement method deposit().
	 * 
	 * This method increases the account balance by the given amount.
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}

	/**
	 * TODO: implement method withdraw().
	 * 
	 * This method decreases the account balance by the given amount. Balance must
	 * NOT be negative. It makes sure that there is enough balance to withdraw.
	 * 
	 * Return true if the withdraw is successful and false otherwise.
	 */
	public boolean withdraw(double amount) {
		if (this.balance < amount) {
			return false;
		}
		
		this.balance -= amount;
		return true;
	}

	/**
	 * TODO: implement method transferTo()
	 * 
	 * This method transfers a given amount to another given account. It makes sure
	 * that this sender has enough balance before transferring.
	 * 
	 * Return true if there is enough balance to transfer and false otherwise
	 */
	public boolean transferTo(double amount, Account toAccount) {
		boolean isWithdrawOk = withdraw(amount);

	      if (!isWithdrawOk) {
	         return false;
	      }
	      
	      toAccount.deposit(amount);
	      return true;
	}
	
	   public void creditInterest() {	
			double interest = calculateInterest();
			
			deposit(interest);	
	   }
	  
	   public double calculateInterest() {
		   return 0.0;
	   }
	

	/**
	 * TODO: override method toString().
	 * 
	 * This method returns the representation of the current object in the form of
	 * the combination of values of its attributes in a more readable format.
	 * 
	 */
	@Override
	public String toString() {
		return "Account number " + number + ", holder " + holderId + ", balance " + balance;
	}

}
