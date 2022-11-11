package day5;

class AddSub{
	int a=10;
	int b=20;
	
  void method1() {
			System.out.println("The sum of the given numbers:"+ (a+b));
			System.out.println("The substraction of the given numbers:"+ (a-b));
	}}
  
  class multiplication extends AddSub{
	  void method2() {
		  System.out.println("The Product of the given numbers:"+ (a*b));
	  }
  }


public class Prblm2 {


	public static void main(String[] args) {

		//Inheritance ob1=new Inheritance();
		//ob1.method1();
		multiplication ob2 =new multiplication();
		ob2.method1();
		ob2.method2();
	}

}
