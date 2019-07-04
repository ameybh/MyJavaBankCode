package Amey;

import java.util.Scanner;

public class JavaMain {
	
	public static void main(String args[]) 
{		Address address0= new Address();
		User user1=new User();
		
		System.out.println("Want to open an Account with us?");
		System.out.println("Please provide your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
	    user1.setName(name);
		System.out.println("Please provide your address");
		address0.setCity(sc.next());
		System.out.println("Please provide your State");
		address0.setState(sc.next());
		System.out.println("Please provide your Pincode");
		address0.setZipCode(sc.nextInt());
		user1.setAddress(address0);
		System.out.println("Choose your option from below/n 1.Savings Account /n2.Salary Account /n3.Current Account /n");
		int choice = sc.nextInt();
		
		
		switch(choice) 
		{
		case 1:
			SavingsAccount SA  = new SavingsAccount();
			SA.setUser(user1);
			System.out.println("/n your savings account is created");
			SA.greet();
			break;
			
		case 2:
			SalaryAccount SAa = new SalaryAccount();
			SAa.setEuser(user1);
			System.out.println("/n your Salary account is created");
			SAa.greet();
			break;
		case 3:
			CurrentAccount CA = new CurrentAccount();
			CA.setUser(user1);
			System.out.println("/n your Current account is created");
			CA.greet();
			break;
		default:
			System.out.println("Wrong Option Selected! ");
		}
}
		

		}
	
		
		
		
		