package polymorphism;
import java.util.ArrayList;

public class BankBranch {
	String name;
	private ArrayList<Account> accountList;
	
	public BankBranch(String name)
	{
		this.name=name;
		accountList = new ArrayList<Account>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void addAccount(Account accounts)
	{
		accountList.add(accounts);
	}
	
	public void printCustomers()
	{
		System.out.println("Customer List: ");
		for (int i=0; i<accountList.size(); i++)
		{
			System.out.println(accountList.get(i).getHolderId());
		}
	}
	
	public double totalDeposits()
	{
		double total = 0;
		for (int i=0; i<accountList.size(); i++)
		{	
			total += accountList.get(i).getBalance();
		}
		return total;
	}
	
	public double totalInterestPaid()
	{
		double total = 0;
		for (int i=0; i<accountList.size(); i++)
		{	
			if(accountList.get(i).calculateInterest() >0)
			{
				total += accountList.get(i).calculateInterest();
			}	
		}
		return total;
	}
	
	public double totalInterestEarned()
	{
		double total = 0;
		for (int i=0; i<accountList.size(); i++)
		{
			if(accountList.get(i).calculateInterest() <0)
			{
				total -= accountList.get(i).calculateInterest();
			}	
		}
		return total;
	}
	
	public double totalNegativeDeposits()
	{
		double total = 0;
		for (int i=0; i<accountList.size(); i++)
		{	
			if(accountList.get(i).getBalance() <0)
			{
				total += accountList.get(i).getBalance();
			}
		}
		return total;
	}
	
	public void printAccounts()
	{
		System.out.println("Account List: ");
		for (int i=0; i<accountList.size(); i++)
		{
			System.out.println(accountList.get(i));
		}
	}
	
	public String toString()
	{
		return "Branch: " + name;
	}
	
	
	
	
	
	
	
}
