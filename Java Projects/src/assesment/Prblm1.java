/*1)Create an interface called StudentInterface. This interface has the abstract method public void study(String subject).
The Student class implements this interface, and provides an implementation for study() which displays that the student 

*/

package assesment;

import java.util.Scanner;

interface StudentInterface{
	public abstract void study(String name,String subject1,String subject2,String subject3 ,String subject4 );
}
class Student implements StudentInterface{
	public void study(String name,String subject1,String subject2,String subject3,String subject4) {
	
		System.out.println("Hi "+name+" Your Subject is "+subject1+" "+subject2+" "+subject3+" "+subject4);
	}
}

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name : ");
String name=sc.nextLine();
System.out.println("Enter your subject 1: ");
String subject1=sc.nextLine();
System.out.println("Enter your subject 2: ");
String subject2=sc.nextLine();
System.out.println("Enter your subject 3: ");
String subject3=sc.nextLine();
System.out.println("Enter your subject 4: ");
String subject4=sc.nextLine();

Student obj=new Student();
obj.study(name, subject1, subject2, subject3, subject4);
	}

}
