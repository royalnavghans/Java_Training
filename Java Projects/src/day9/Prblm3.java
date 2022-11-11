/*
3.We have to calculate the area of a rectangle, a square and a circle. 
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 
'SquareArea' and 'CircleArea' taking one parameter each. 
The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is 
its side and that of 'CircleArea' is its radius.
 Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for
  printing the area of rectangle, square and 
circle respectively.Create an object of class 'Area' and call all the three methods.*/

package day9;
abstract class  Shape{
	public abstract void RectangleArea(int length,int breadth);
	public abstract  void SquareArea(double area);
	public abstract void CircleArea(double radius);
}

class Area extends Shape{
	public void RectangleArea(int length,int breadth) {
		int RectangleArea=length*breadth;
		System.out.println("Area of a Rectangle is :"+RectangleArea);
	}
	public void SquareArea(double area) {
		double SquareArea=area*area;
		System.out.println("Area of a Square : "+SquareArea);
	}
	public void CircleArea(double radius) {
		double CircleArea=22/7*(radius*radius);
		System.out.println("Radius of Circle : "+CircleArea);
	}
}


public class Prblm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj1=new Area();
		obj1.CircleArea(25);
		obj1.RectangleArea(50, 60);
		obj1.SquareArea(54);

	}

}
