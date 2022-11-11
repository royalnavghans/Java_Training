/*Create a class called Emp that includes three pieces of information as instance variables—a first name (typeString), 
 * a last name (typeString) and a monthly salary (double). Your class should have a constructor that initializes 
 * the three instance variables.Provide a set and a get method for each instance variable.
 If the monthly salary is not positive, set it to 0.0.
 Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
 Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and 
display each Employee’s yearly salary again
*/

package day8;
class Emp{
    String firstName;
	String lastName;
	double salary;
	
	
Emp(String firstName, String lastName,double salary){
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	if(salary>0) {
	this.salary = salary;
}
	else {
		salary=0;
	}
}

void EmployeeTest() {
	System.out.println("First Name : "+firstName+" Last Name : "+lastName+" Monthly Salary : "+salary+" Yearly Salary "+(salary*12));
}


public double raisedSalary() {
	double raised=salary*0.1;     ////salary=monthlysalary
	double raisedSalary=(salary+raised)*12;
	System.out.println("First Name : "+firstName+" Last Name : "+lastName+" Raised salary : "+raisedSalary);
	return raisedSalary;
}

	

}

public class Assesement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp employee1=new Emp("SriHari","Vishnu,",14000);
		Emp employee2=new Emp("Rajesh","Sir,",54000);
		employee1.EmployeeTest();
		employee2.EmployeeTest();
		System.out.println("----------------------------------------------------------");
		System.out.println("Woooooooooooohhhhhhh salary raised 10%");
		System.out.println("----------------------------------------------------------");
		employee1.raisedSalary();
		employee2.raisedSalary();

	}

}
