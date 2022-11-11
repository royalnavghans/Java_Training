/*4.create a method a1() using interfaces and Implement the local variable re-initialization for x and y variables 
*/

package day13;
interface hari1{
	void a1(int x,int y);
}

public class Reinitialization { //Reinitialize is not possible
void m2(int x,int y) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		hari1 lam=(x,y)->{
			 x=10;
		     y=20;
			System.out.println("hi hello "+x*y);
		};
		lam.a1(2, 5);
	}

}
