/*3.create an interface testinterface with method m1() and implement method refrences for the same .

*/
package day13;

interface TestInterface1{
	void m1(); 
}
public class TestInterface {
void Reference() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestInterface obj=new TestInterface();
TestInterface1 obj2=obj::Reference;
obj2.m1();

	}

}
