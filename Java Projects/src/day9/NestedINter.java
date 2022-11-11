package day9;
interface abc1{
	void met1();
	interface abc2{
		void met1();
	}
}
class abcd implements abc1.abc2{  //outer interface.inner interface
	public void met1() {
		System.out.println("hi hello");
	}
	
}

public class NestedINter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc1.abc2 obj1=new abcd();//upcasting method
obj1.met1();
	}

}
