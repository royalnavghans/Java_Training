package exceptionHandling;
interface A{
 static void abc() {
	 int a=10;
	 System.out.println(a);
	 
 }
}
class ab  implements A{
	 void abc() {
		System.out.println("hi");
	}
}
class bc extends ab{
	void abc() {
		
	}
}
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub





	}

}
