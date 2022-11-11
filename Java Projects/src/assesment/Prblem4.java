/*4)Create a class called Register with three instance variables: username, email, and password. These three pieces of information are all String. 
Your class should have a constructor that initializes the three instance variables and assumes that the provided values are correct.
For each instance variable, provide a set and a get method. Create a displayInformation method in order to display the username, email, and password.
By calling getMethods.

*/

package assesment;
class Register{
	String username;
	String email;
	String password;
	
	Register(){
		email=email;
		username=username;
		password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
void displayInformation(){
	System.out.println("Hi \n Your mail ID is "+email+" \n Your Username is "+username+" \n Your Pasword is "+password);
}
}

public class Prblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Register obj=new Register();
obj.setEmail("abc@gmail.com");
obj.setUsername("srihari");
obj.setPassword("abcd1234");
obj.displayInformation();

	}

}
