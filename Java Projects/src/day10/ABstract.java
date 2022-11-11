package day10;
abstract class srihari{
	
	srihari(int a){
		System.out.println("hi this is great srihari "+a);
	}
	
}
class vishnu extends srihari{
	
	vishnu(){
		super(30);
		System.out.println("this is vishnu");
	
}}

public class ABstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vishnu obj1=new vishnu();

	}

}
