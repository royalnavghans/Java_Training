/* 5.Write a Java method to compute the sum of the digits in an integer. 
Test Data:
Input an integer: 66
Expected Output:

The sum is 12 */

package day4;

import java.util.Scanner;

public class Prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter Any two digit number or above : ");
int num=sc.nextInt(); 
int num1;
int sum=0;
    while(num>0) {
		num1=num%10;
		sum=sum+num1;
		num=num/10;
		
}
	System.out.println("The sum, of the digit of the integer is : " +  sum);

	
		
	Prblm5 ob =new Prblm5();
	ob.method();
	
	}
	
	void method() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Any two digit number or above : ");
		int num=sc.nextInt(); 
		int num1;
		int sum=0;
	 
			while(num!=0) {
				num1=num%10;   
				sum=sum*10+num1;
				num=num/10;
				
		}
			System.out.println("The Reverse of the integer is : " + sum);
			sc.close();
			}
	}
	

