/*2) Create a class for Waterbender, Earthbender, Firebender, and Airbender as subclasses of the superclass Avatar. The subclasses provide their actual implementation,
 Firebender must return a String containing the phrase "Fire attack!”, Waterbender = “Water attack!”, Airbender = "Air attack!”, and Earthbender = "Stone attack!". 
Create a testdriver called TestAvatar to demonstrate the classes. Apply the concept of Inheritance and Polymorphism.
Sample Output:



Fire attack!



Water attack!



Air attack!



Stone attack!



Default attack!

*/


package assesment;

class Avatar {
	String method( String attack5) {
		System.out.println("\n");
 System.out.println(attack5);
 return attack5;
	}
}

class Waterbender extends Avatar {

	String method(String attack1) {
		System.out.println("\n");
		System.out.println(attack1);
		return attack1;
	}
}

class Earthbender extends Avatar {
	String method(String attack2) {
		System.out.println("\n");
		System.out.println(attack2);
		return attack2;
	}

}

class Firebender extends Avatar {
	String method(String attack3) {
		System.out.println("\n");
		System.out.println(attack3);
		
		return attack3;
	}

}
class Airbender extends Avatar {

	String method(String attack4) {
		System.out.println("\n");
		System.out.println(attack4);
		return attack4;
	}
}

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firebender TestAvatar1 = new Firebender();
		TestAvatar1.method("Fire attack!");
		Waterbender TestAvatar2 = new Waterbender();
		TestAvatar2.method("Water attack!");
		Airbender TestAvatar3 = new Airbender();
		TestAvatar3.method("Air attack!");
		Earthbender TestAvatar4 = new Earthbender();
		TestAvatar4.method("Stone attack!");
		Avatar TestAvatar5 = new Avatar();
		TestAvatar5.method("Default  attack!");
	}

}
