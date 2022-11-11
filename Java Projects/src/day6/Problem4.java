package day6;
class Employee{
	String Name,Address;
	int YearOfJoining;
	
	
	Employee(String name, int yearOfJoining, String address){
		Name=name;
		YearOfJoining=yearOfJoining;
		Address=address;
	}
	void displyEmployee(){
		System.out.println(Name+"\t"+"\t"+YearOfJoining+"\t"+Address);
	}
}

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name \t Year Of Joining  Address");
		Employee obj =new Employee("Robert",1994,"64C-WallsStreat");
		Employee obj1 =new Employee("Sam",2000,"68D-WallsStreat");
		Employee obj2 =new Employee("John",1999,"26B-WallsStreat");
		obj.displyEmployee();
		obj1.displyEmployee();
		obj2.displyEmployee();

}}
