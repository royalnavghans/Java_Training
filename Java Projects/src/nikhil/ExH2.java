/*2. using exception handling: try-catch 	

write a program that takes as input the size of the array and the elements in the array.
 the program then asks the user to enter a particular index and prints the element at that index.
 this program may generate array index out of bounds exception. use exception handling mechanisms to handle this exception. 
in the catch block, print the class name of the exception thrown. 

sample input and output 1: 

i/p:

enter the number of elements in the array 3 
enter the elements  in the array 20 90 4 

enter the index of the array element you want to access 2 

the array element at index 2 = 4 

o/p:

the array element successfully accessed

sample input and output 2: 

enter the number of elements in the array 3 

enter the elements in the array 20 90 4 

enter the index of the array element you want to access 6 

o/p:

java.lang.arrayindexoutofboundsexception





*/
package nikhil;

import java.util.Scanner;

public class ExH2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	try {
		int size=sc.nextInt();
		int[] ar=new int [size];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		for(int j=0;j<ar.length;j++) {
			System.out.print(" "+ar[j]);
		}
		System.out.println(" enter the index of the array element you want to access ");
		int size1=sc.nextInt();
		//ar[size1]=size1;
		System.out.println("enter the index of the array element you want to access "+ar[size1]);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
//	
	
	
	
	
}
}
