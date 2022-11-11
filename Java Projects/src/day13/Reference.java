/*5.create a method IsBoolean() in Functional INterface and implement method references with IsPositive().
 
*/

package day13;
@FunctionalInterface
interface reference1{
	boolean Isboolean(int a );
}
public class Reference {
void  isPositive(int x) {
	if(x>0) {
		System.out.println("Your number is Positive");
	
	}
	else {
		System.out.println("Your number is negative ");
	}
	System.out.println("hi");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
