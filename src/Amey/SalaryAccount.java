package Amey;

public class SalaryAccount extends Account {

	private static int MIN_BALANCE_C =0;
	//private int withdrwalLimit = null;
	private int depositeLimit = 50_000;
	Address address;
	private String accountType = "Current ACCOUNT!";
	
	public String getAccountType() {
		return accountType;
	}
User user;

	
	public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


	public User getEuser() {
	return user;
}


public void setEuser(User euser) {
	this.user = user;
}


	SalaryAccount()
	{}
	
	
	public boolean withdraw(double amt) 
	{
		if(this.getAccountBalance() - amt > MIN_BALANCE_C) 
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
		if(amt<= depositeLimit ) {
		
		double sal=this.getAccountBalance();
		sal+=amt;
		this.setAccountBalance(sal);
		return true;}
		else {
			System.out.println("Yoyur depositing amount exceeds limit");
			return false;
		}
	}
	
	
	public void getAccountData() 
	{
		System.out.println("**********YOUR ACCOUNT DETAILS***********");
		System.out.println("Name :"+ user.getName() );
		System.out.println("The account holder is from :" + user.getAddress().getCity()+ " "+user.getAddress().getState()+" "+user.getAddress().getZipCode());
		System.out.println("A/c Type: "+ "SALARY ACCOUNT");
		System.out.println("Account Balance :" + getAccountBalance());
}

	
	public void greet() {
		boolean flag =true;
		
		while(flag) {
			System.out.println("What do you want to do?/n 1.Deposite /n 2.Withdraw /n3.check Balance /n4.Exit");
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
			case 3:
				getAccountData();
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
