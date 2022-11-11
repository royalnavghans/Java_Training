/*1.create functional interface for finding length of the string using lambda and method references

*/


package day13;

interface hari {
	void name(String name);
}

public class LambdaExpression {
	void getinfo(String name1) {
		System.out.println("The length of the String " + name1.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hari obj = (s) -> {
			System.out.println(" Hai your length is :" + s);
		};
		obj.name("sriharivishnu");

		LambdaExpression obj2 = new LambdaExpression();
		hari obj1 = obj2::getinfo;
		obj1.name("srihri");

	}

}
