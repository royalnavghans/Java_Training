/*2.create functional interface for finding area of rectangle using lambda and method references

*/

package day13;
interface Area{
	void AreaOfRectangle(int length, int breath);
}

public class AreaOfRectangle {
void reference(int l,int b) {

	System.out.println("Area of Rectangle 2 "+l*b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area=(s,s1)->{
			System.out.println("Area of Rectangle 1 "+s*s1);
		};
		area.AreaOfRectangle(2,5);
		AreaOfRectangle obj1=new AreaOfRectangle();
		Area obj2=obj1::reference;
		obj2.AreaOfRectangle(2, 10);
	}

}
