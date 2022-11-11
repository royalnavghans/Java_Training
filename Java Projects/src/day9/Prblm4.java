/*4.An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method'
 *  and a non-abstract method which prints "This is a normal method of abstract class". 
A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". 
Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)*/


package day9;
abstract class constructor{
	
	constructor(){
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();
	public void b_method() {
		System.out.println("This is a normal method of abstract class");
	}
}

class SubClass extends constructor{
	void a_method() {
		System.out.println("This is abstract method");
	}
}

public class Prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj1=new SubClass();
		obj1.a_method();
		obj1.b_method();

	}

}
