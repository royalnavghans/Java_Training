/*2.We have to calculate the percentage of marks obtained in three subjects (each out of 100)
  by student A and in four subjects (each out of 100) by student B. 
Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the
 same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects 
as its parameters for student B.
Create an object for each of the two classes and print the percentage of marks for both the students.*/



package day9;

import java.util.Scanner;

abstract class Marks1{
	abstract double getPercentage();
}
class A1 extends Marks1{
	 int maths;
	 int english;
	 int science;
	

A1(int maths,int english,int science){
   this.english=english;
	this.maths=maths;
	this.science=science;
}
public double getPercentage() {
	int marks=(english+maths+science)*100/300;
	System.out.println("The Average marks of a Student A is : "+marks);
	return marks;
}}
class B extends Marks1 {
	 int english;
     int maths;
	 int science;
	 int computer;
	
B(int english,int maths,int science,int computer){
	this.english=english;
	this.maths=maths;
	this.science=science;
	this.computer=computer;
}

public double getPercentage() {
	double marks=(english+maths+science+computer)*100/400;
	System.out.println("The Average marks of a Student B is : "+marks);
	return science;
}

}

	


public class Prblm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eng marks");
		int a=sc.nextInt();
		System.out.println("enter mat marks");
		int b=sc.nextInt();
		System.out.println("enter sci marks");
		int c=sc.nextInt();
		System.out.println("enter hin marks");
		int d=sc.nextInt();
		
	 A1 obj1=new A1(55, 25, 65);
	 obj1.getPercentage();
	 B obj2=new B(65,87,86,55);
	 obj2.getPercentage();
	}

}
