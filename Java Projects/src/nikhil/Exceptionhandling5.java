/*5. using throws  :

write a program with a division method who receives two integer numbers and performs the division operation. 
the method should declare that it throws arithmeticexception. this exception should be handled in the main method.
*/


package nikhil;

public class Exceptionhandling5 {
 static void Method()   {
		int a=5;
		int b=2;
		System.out.println(a/b);

 }
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub

		Exceptionhandling5 s1=new Exceptionhandling5();
		
		
		try {
			s1.Method();
			throw new ArithmeticException("Nikhil");
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("enter numbes in btwn 1 to 100"+e);
		}

	}
		
		
	}


