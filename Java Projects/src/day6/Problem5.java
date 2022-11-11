package day6;
class Animal{
	void shouts() {
		System.out.println("Animal Shout!!");
	}
}
class Cat extends Animal{
	void shouts() {
		System.out.println("Meow! Meow!");
	}
}
class Dog extends Animal {
	void shouts() {
		System.out.println("BOW!! BOW!!");
	}

}
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Animal obj =new Animal();
		   obj.shouts();
		   Dog obj1=new Dog();
		   obj1.shouts();
		   Cat obj2 =new Cat();
		   obj2.shouts();

	   
	
   
	}

}
