package day9;
interface marker{
	// this is the marker interface
};
class marks implements marker{
	public void met1 () {
		System.out.println("hi hello");
	}
}

public class MarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 marks obj1=new marks();
 if(obj1 instanceof marker)  // check whether class implements to marker or not
	 obj1.met1();
 
	}

}
