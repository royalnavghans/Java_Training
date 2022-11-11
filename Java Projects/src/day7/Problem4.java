package day7;

import java.util.Scanner;

class SavingAccount{
	static int annualInterestRate;
	private double savingsBalance;
	
//SavingAccount(double Savings){
//	savingsBalance=Savings;
//}
 void method1(double number) {
		savingsBalance=number;
		}
 void method2(int interest) {
		annualInterestRate=interest;
		}
	void calculateMonthlyInterest() {
		
		double calculateMonthlyInterest= savingsBalance+(savingsBalance*annualInterestRate)/12;
		System.out.println("Your updated balance : "+calculateMonthlyInterest);
	}
	static void modifyInterestRate(int NewInterest) {
		  annualInterestRate =NewInterest;
		System.out.println("Update interest 4% to "+NewInterest+"%");
	}
}

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Amount 1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter Your Amount 2 : ");
		int num2=sc.nextInt();
		System.out.println("enter your interest : ");
		int num3=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your interest : ");
		int num4=sc.nextInt();
   SavingAccount saver1 =new SavingAccount();
   SavingAccount saver2=new SavingAccount();
    saver1.method1(num1);
    saver2.method1(num2);
    saver1.method2(num3);
    saver2.method2(num3);
    
    
 
   saver1.calculateMonthlyInterest();
   saver2.calculateMonthlyInterest();
   SavingAccount.modifyInterestRate(num4);
   saver1.calculateMonthlyInterest();
   saver2.calculateMonthlyInterest();
  
   
	}

}
