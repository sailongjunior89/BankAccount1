package polymorphism;

public class Test {
	public static void main(String[] args) {
		BankBranch branch = new BankBranch("Clementi Central");
	    
	    branch.addAccount(new SavingsAccount("S111-1111-111", "S1111111A", 2000.0));
	    branch.addAccount(new CurrentAccount("C222-2222-222", "S3333333B", 2000.0));
	    branch.addAccount(new OverdraftAccount("O333-3333-333", "S2222222B", 2000.0));
	    branch.addAccount(new OverdraftAccount("O444-4444-444", "S2222222B", -2000.0));

		
	    System.out.println(branch);
	    
	    System.out.println("\n---- Print all accounts ----");
	    branch.printAccounts();
	    
	    System.out.println("\n---- Deposits and interest ----");
	    System.out.println("Total deposits: " + branch.totalDeposits());
	    System.out.println("Total interest paid to accounts: " + branch.totalInterestPaid());
	    System.out.println("Total negative deposits: " + branch.totalNegativeDeposits());
	    System.out.println("Total interest earned from accounts: " + branch.totalInterestEarned());

	    System.out.println("\n---- Print all unique customer IDs ----");
	    branch.printCustomers(); 

		
		//testSavingsAccounts();
		//testCurrentAccounts();
		//testOverdraftAccounts();
	}

	public static void testSavingsAccounts() {
		System.out.println("----------- Test Savings Accounts ----------");
		boolean isSuccessful;

		SavingsAccount savingsAccount = new SavingsAccount("S111-1111-111", "S1111111A", 2000.0);
		System.out.println(savingsAccount);

		System.out.println("\n--- Calculating and crediting interest ---");

		System.out.println("Interest: " + savingsAccount.calculateInterest());
		System.out.println("Interest is credited");
		savingsAccount.creditInterest();
		System.out.println(savingsAccount);

		System.out.println("\n--- Withdrawing --- ");

		isSuccessful = savingsAccount.withdraw(500.0);
		if (isSuccessful) {
			System.out.println("500.00 is withdrawn");
		} else {
			System.out.println("500.00 cannot be withdrawn because balance is not enough");
		}
		System.out.println(savingsAccount);

		System.out.println(); // New line

		isSuccessful = savingsAccount.withdraw(2000.0);
		if (isSuccessful) {
			System.out.println("2000.0 is withdrawn");
		} else {
			System.out.println("2000.0 cannot be withdrawn because balance is not enough");
		}
		System.out.println(savingsAccount);

		System.out.println(); // New line
	}

	static void testCurrentAccounts() {
		System.out.println("----------- Test Current Accounts ----------");
		boolean isSuccessful;

		CurrentAccount currentAccount = new CurrentAccount("C222-2222-222", "S3333333B", 2000.0);
		System.out.println(currentAccount);

		System.out.println("\n--- Calculating and crediting interest ---");

		System.out.println("Interest: " + currentAccount.calculateInterest());
		System.out.println("Interest is credited");
		currentAccount.creditInterest();
		System.out.println(currentAccount);

		System.out.println("\n--- Withdrawing --- ");

		isSuccessful = currentAccount.withdraw(500.0);
		if (isSuccessful) {
			System.out.println("500.00 is withdrawn");
		} else {
			System.out.println("500.00 cannot be withdrawn because balance is not enough");
		}
		System.out.println(currentAccount);

		System.out.println(); // New line

		isSuccessful = currentAccount.withdraw(2000.0);
		if (isSuccessful) {
			System.out.println("2000.0 is withdrawn");
		} else {
			System.out.println("2000.0 cannot be withdrawn because balance is not enough");
		}
		System.out.println(currentAccount);

		System.out.println(); // New line
	}

	public static void testOverdraftAccounts() {
		System.out.println("----------- Test Overdraft Accounts ----------");
		boolean isSuccessful;

		OverdraftAccount overdraftAccount1 = new OverdraftAccount("O333-3333-333", "S2222222B", 2000);
		System.out.println(overdraftAccount1);

		System.out.println("\n--- Calculating and crediting interest ---");

		System.out.println("Interest: " + overdraftAccount1.calculateInterest());
		System.out.println("Interest is credited");
		overdraftAccount1.creditInterest();
		System.out.println(overdraftAccount1);

		System.out.println("\n--- Withdrawing --- ");

		isSuccessful = overdraftAccount1.withdraw(500.0);
		if (isSuccessful) { //will always return true
			System.out.println("500.00 is withdrawn");
		} else {
			System.out.println("500.00 cannot be withdrawn because balance is not enough");
		}
		System.out.println(overdraftAccount1);

		System.out.println(); // New line

		isSuccessful = overdraftAccount1.withdraw(2000.0);
		if (isSuccessful) { //will always return true
			System.out.println("2000.0 is withdrawn");
		} else {
			System.out.println("2000.0 cannot be withdrawn because balance is not enough");
		}
		System.out.println(overdraftAccount1);

		System.out.println(); // New line

		OverdraftAccount overdraftAccount2 = new OverdraftAccount("O444-4444-444", "S2222222B", -2000);
		System.out.println(overdraftAccount2);

		System.out.println("\n--- Calculating and crediting interest for negative balances ---");

		System.out.println("Interest: " + overdraftAccount2.calculateInterest());
		System.out.println("Interest is credited");
		overdraftAccount2.creditInterest();
		System.out.println(overdraftAccount2);

		System.out.println(); // New line
	}

}
