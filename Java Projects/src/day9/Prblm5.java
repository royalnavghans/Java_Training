/*
5.Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 
'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
 Now create an object for each of the subclasses and call their respective methods.*/


package day9;
abstract class Animals{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals{
	void cats() {
		System.out.println("Cats meow");
	}
	void dogs() {}
	}
class dog extends Animals{
	void dogs() {
		System.out.println("Dogs bark");
	}
	 void cats() {}
}
public class Prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cats obj1=new Cats();
dog obj2=new dog();
obj1.cats();
obj2.dogs();

	}

}
