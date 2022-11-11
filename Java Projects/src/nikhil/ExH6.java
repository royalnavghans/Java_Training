/*6. using Exception Handling: Throw & Used Defined Exception 	

Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program. 
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/
package nikhil;

import java.util.Scanner;

public class ExH6 {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int telugu=sc.nextInt();
		int hindi=sc.nextInt();
		int tamil=sc.nextInt();
		int avg=(telugu+hindi+tamil)/3;
		if ((telugu<0 && telugu>100) && (hindi<0 && hindi>100)&& (tamil<0 && tamil>100)) {
			System.out.println("print"+telugu);
			System.out.println(hindi);
			System.out.println(tamil);
		}
		else {
			System.out.println("invalid ");
		}
//		throw new NumberFormatException("positive numbers");
		
	}

}
