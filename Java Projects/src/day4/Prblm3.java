/*
3.program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. 

Test Data
Input first number: 345
Input second number: 567
Input third number: 789
Expected Output :

Increasing order*/


package day4;

import java.util.Scanner;

public class Prblm3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter first number : "); 
	  int num1=sc.nextInt();
	  System.out.println("Enter Second number : "); 
	  int num2=sc.nextInt();
	  System.out.println("Enter third number : "); 
	  int num3=sc.nextInt();
	   if(num1<num2 && num2<num3 ) {
		   System.out.println("All three numbers are Increasing!!");
	   }
	   else if(num1<num3) {
		   System.out.println("All three numbers either decreasing or Increasing!!");
	   }
	   else {
		   System.out.println("All three numbers are Decreasing");
		   sc.close();
	   }
	}}
