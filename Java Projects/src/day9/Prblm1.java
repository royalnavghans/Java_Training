/*1.Create an abstract class 'Parent' with a method 'message'. 
 * It has two subclasses each having a method with the same name 'message' 
that prints "This is first subclass" and "This is second subclass" respectively.
 Call the methods 'message' by creating an object for each subclass.*/




package day9;

abstract class Parent{
 abstract void message();
}

class Class1 extends Parent{
	public void message() {
		System.out.println("This is first subclass");
	}}
class abc extends Parent{
	public void message() {
		System.out.println("This is second subclass");
	}
}

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc obj1=new abc();
Class1 obj2=new Class1();
obj2.message();
obj1.message();


	}

}
