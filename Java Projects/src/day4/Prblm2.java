/* 2.program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, 
"All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data
Input first number: 123
Input second number: 345
Input third number: 789
Expected Output :

All numbers are different */



package day4;

import java.util.Scanner;

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter first number : "); 
	  int num1=sc.nextInt();
	  System.out.println("Enter Second number : "); 
	  int num2=sc.nextInt();
	  System.out.println("Enter third number : "); 
	  int num3=sc.nextInt();
	   if(num1==num2 && num1==num2 && num2==num3 ) {
		   System.out.println("All three numbers are equals!!");
	   }
	   else {
		   System.out.println("All three numbers are diffrerent");
		   sc.close();
	   }
		}
	}

