package Amey;

public class SavingsAccount extends Account {

	private static int MIN_BALANCE_S =10_000;
	private int withdrwalLimit = 25_000;
	private int depositeLimit = 50_000;
	Address address;
	private String accountType = "SAVINGS ACCOUNT!";
	
	public String getAccountType() {
		return accountType;
	}

	User user;
	


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	SavingsAccount()
	{}
	
	
	public boolean withdraw(double amt) 
	{
		if(amt>withdrwalLimit ||this.getAccountBalance() - amt < MIN_BALANCE_S) 
			{
				return false;
			}
		else 
			{						
				
			double sal = this.getAccountBalance();
			sal = sal - amt;		
			this.setAccountBalance(sal);
			return true;
			
			}
	}
	
	public boolean deposite(double amt) 
	{
		if(amt<= depositeLimit) {
		
		double sal=this.getAccountBalance();
		sal+=amt;
		this.setAccountBalance(sal);
		return true;}
		else {
			return false;
		}
	}
	
	
	public void getAccountData() 
	{
		System.out.println("**********YOUR ACCOUNT DETAILS***********");
		System.out.println("Name :"+ user.getName() );
		System.out.println("The account holder is from :" + address.getCity()+ " "+address.getState()+" "+address.getZipCode());
		System.out.println("A/c Type: "+ getAccountType());
		System.out.println("Account Balance :" + getAccountBalance());
}
	
	public void greet() {
		boolean flag =true;
		
		while(flag) {
			System.out.println("What do you want to do?/n 1.Deposite /n 2.Withdraw /n3.check Balance /n4.Account Information /n5.Exit");
			int choice2 = sc.nextInt();
			switch(choice2) 
			{
			case 1:
				System.out.println("Enter your amount to deposite");
				int amtd = sc.nextInt();
				boolean k =deposite(amtd);
					if(k) 
					{
						System.out.println("Successfully Deposited");
						System.out.println("Available Balnce is " + getAccountBalance());
					}
					else 
					{
						System.out.println("Failed!");
						System.out.println("Available Balnce is " + getAccountBalance());
					}
				break;
			case 2:
				System.out.println("Enter your amount to withdraw");
				int amtd1 = sc.nextInt();
				boolean p =withdraw(amtd1);
					if(p) 
					{
						System.out.println("Successfully Withdrawed");
						System.out.println("Available Balnce is " + getAccountBalance());
					}
					else 
					{
						System.out.println("Failed!");
						System.out.println("Available Balnce is " + getAccountBalance());
					}
				break;
			case 3:{
				System.out.println("abasd");
				//getAccountData();
				System.out.println("**********YOUR ACCOUNT DETAILS***********");
				System.out.println("Name :"+ user.getName() );
				System.out.println("The account holder is from :" + address.getCity()+ " "+address.getState()+" "+address.getZipCode());
				System.out.println("A/c Type: "+ getAccountType());
				System.out.println("Account Balance :" + getAccountBalance());
			}
				break;
			case 4:
				break;
			}
			System.out.println("Still Want to continue?/n Y/N");
			String yn = sc.next();
			if(yn.equals("y")||yn.equals("Y")) {flag=true;}
			else flag=false;
		}
		}
}
