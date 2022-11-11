package day11;
interface A6{
	void main();
	
}
class AB{
	void mains() {
		System.out.println("hai hello");
		A6 obj1=()->{
			System.out.println("hello");
		};
		obj1.main();
	}
	
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB obj2=new AB();
		obj2.mains();
		
		

	}

}
