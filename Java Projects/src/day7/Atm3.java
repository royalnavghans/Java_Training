
package day7;

/*CREATE class Account to provide a method called debit that withdraws money from an Account. 
 * Ensure that the debit amount does not exceed the Account’s balance. 
 * If it does, the balance should be left unchanged and the method should print a message 
 * indicating ―Debit amount exceeded account balance. UPDATE class AccountTest to test method debit*/

import java.util.*;


class Acc1 {
	private String name;
	private long accountNo = Math.round((Math.random()*1000000000));
	private long passcode = Math.round((Math.random()*10000));
	private long balance;
	
	void createAccount(String name) {
		this.name = name;
		System.out.println("Hello " + this.name + " Welcome to HDFC, Use the following credentials to access your account");
		System.out.println("account Number: "+ accountNo);
		System.out.println("Passcode: " + passcode);
	}
	
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Account no: ");
		long accountNo = sc.nextLong();
		System.out.print("Please enter your passcode: ");
		long passcode = sc.nextLong();

		if(this.accountNo == accountNo && this.passcode == passcode) {
			sc.nextLine();
			return true;
		}
		else {
			sc.nextLine();
			return false;
		}
	}
	
	void debitAccess(long debitAmount) {
		if(login()) {
			if(debitAmount <= this.balance) {
				
				this.balance = this.balance - debitAmount;
				System.out.println("You have withdrawn " + debitAmount + " You have " +this.balance +" left in your account.");
			}
			else {
				System.out.println("Insufficent balance, Please check your balance and enter correct amount.");
			}
		}
		else {
			System.out.println("Please enter correct credentials.");
		}

	}
	
	void creditAccess(long creditAmount) {
		
		if(login()) {
			this.balance += creditAmount;
			System.out.println("You have added "+ creditAmount + " in your account.");
			System.out.println("You have "+this.balance+" in your account.");
		}
		else {
			System.out.println("Please enter correct credentials.");
		}
	}
	
	
	void checkBalance() {
		
		
		if(login()) {
			System.out.println("You have "+ this.balance + " left in your account.");
		}
		else {
			System.out.println("Please enter correct credentials.");
		}

	}
	
}

public class Atm3{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();	
		Acc1 hdfc = new Acc1();
		hdfc.createAccount(name);
		
		while (true) {
				System.out.println("Press ENTER to check the menu: ");
				sc.nextLine();
				System.out.println("Hello " + name );
				System.out.println("Please select an option: ");
				System.out.println("debit amount = A");
				System.out.println("credit amount = B");
				System.out.println("check blanace = C");
				System.out.println("close account = D");
				
						String action = sc.nextLine();
						
						if(action.equals("A")) {
							System.out.print("Please enter the amount you want to withdraw: ");
							hdfc.debitAccess(sc.nextLong());
							sc.nextLine();
						}
						else if(action.equals("B")) {
							System.out.print("Please enter the amount you want to deposit: ");
							hdfc.creditAccess(sc.nextLong());
							sc.nextLine();
						}
						else if(action.equals("C")) {
							hdfc.checkBalance();
						}
						else if(action.equals("D")) {
							System.out.println("Thank you for visiting HDFC");
							return;
						}
						
			}
			
		}
		
	}

