package Amey;
import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);
	
	private final long accountId;
	private String accountName;
	private double accountBalance;
	private  int numberOfAccounts=10_000;
	//private int MIN_BALANCE = 1_000;
//	private Address address;
//	private String accountType;
//	
	//Constructor final will make sure that the accoundId is assigned to the user at the object creation only
    //All nouns should be candidate for 
	//All properties of noun are instance
	
	
	
		Account()   
		{    	
			accountId = numberOfAccounts;
			numberOfAccounts++;
	    }
	

	
	
	public String getAccountName() {
		return accountName;
	}

//	public void setAccountName(String accountName) {
//		this.accountName = accountName;
//	}
	
	
//	public accountType getAccountType() 
//	{
//		return (Account.accountType);
//	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

//	public int getMIN_BALANCE() {
//		return MIN_BALANCE;
//	}

		
	public long getAccountId() {
		return accountId;
	}

	public boolean withdraw() {return true;}
	public boolean deposite() {return true;}
	

	

	

}
