/*Write a program to create a class named shape. In this class we have three sub classes circle, triangle and square each class has two member function 
named draw () and erase (). Create these using polymorphism concepts. Write a program to give a simple example for abstract class. 

Write a program suppose, it is required to build a project consisting of a number of classes, possibly using a large number of programmers. 
It is necessary to make sure that every class from which all other classes in the project will be inherited. Since any new classes in the project must inherit 
from the base class, programmers are not free to create a different interface. Therefore, it can be guaranteed that all the classes in the project 
will respond to the same debugging commands.

*/


package assesment;

abstract class Shape {
	abstract void draw();

	abstract void erase();
}

class Circle extends Shape {
	public void draw(int radius) {
		System.out.println("Area of a Circle is  " + (3.14 * (radius * radius)));
	}

	public void erase() {
		
		System.out.println("The area of Circle will erased.......");
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub

	}

	

}

class Triangle extends Shape {
	public void draw(int breadth, int height) {
		System.out.println("Area of a triangle is  " + (0.5 * (breadth * height)));
	}

	public void erase() {
		
		System.out.println("The area of traingle will erased.....");
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub

	}


}

class Square extends Shape {
	public void draw(int area) {
		System.out.println("Area of a Square is  " + (area * area));
	}

	public void erase() {
	
		System.out.println("The area of square will erased......");
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub

	}

	
}

public class Prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle();
		obj1.draw(6);
		obj1.erase();
		Triangle obj2 = new Triangle();
		obj2.draw(5, 8);
		obj2.erase();
		Square obj3 = new Square();
		obj3.draw(4);
		obj3.erase();
	}

}
