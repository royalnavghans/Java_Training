
/*
8. using Exception Handling: Finally block 

Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output. Also illustrate the use of finally block. Print the message “Inside finally block”. Sample Input and Output 1: Enter the 2 numbers 5 2 The quotient of 5/2 = 2 Inside finally block Sample Input and Output 2: Enter the 2 numbers 5 0 DivideByZeroException caught Inside finally block
*/
package nikhil;

import java.util.Scanner;

public class ExceptionHandling8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Scanner sc=new Scanner(System.in);
		       System.out.println("enter the numbers");
		       int a=sc.nextInt();
		       int b=sc.nextInt();
		   	System.out.println("quotient is "+ a/b);

			
		} catch (Exception e) {
			// TODO: handle exception
		
			System.out.println("in catch block"+e);
		}
		finally {
			
			System.out.println("in finally block ");
		}
	}

}
