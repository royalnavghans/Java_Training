package day9;
class abcde implements Cloneable{
	int age;
	String name;
	
abcde (int age,String name){
	this.age=age;
	this.name=name;
}
public void display() { 
	System.out.println("name "+name);
	System.out.println("age "+age);
}
}
public class CloneMarkerInterface {


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
abcde obj1=new abcde(20,"ram");
//abcde obj2=(abcde) obj1.clone();
obj1.display();
	
	}
}
