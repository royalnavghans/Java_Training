/*1.create class with employees information id,name,age,gender,department,YOJ,Salary  
  with respective constructor method to initialise and getter and setter methods.
  create list for employees data for all the above mentioned employee class fields.
  using the list implement solutions for the below 

  1.How many  female employees are there in the organization?
  2.display all departments information
  3.find average age of all male employees
  4.find out who paid highest in the organization?
  5.find out Average salary in each department.
  6.who is most experienced in the organization
  7.avg salary of male and female employees
  8.get all the employee names in every department.
  9.average salary and total salary of the whole organization?
*/


package day14;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class EmployeeInformation{
	String id ,name,gender,department;
int age;
	int doj;
	double salary;
 EmployeeInformation(String id,String name,int age,String gender,String department,int doj,double salary){
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.department=department;
	 this.doj=doj;
	 this.salary=salary;
	 
 }
 
 
@Override
public String toString() {
	return "EmployeeInformation [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
			+ ", age=" + age + ", doj=" + doj + ", salary=" + salary + "]";
}


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getDoj() {
	return doj;
}
public void setDoj(int doj) {
	this.doj = doj;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<EmployeeInformation> list=new LinkedList<EmployeeInformation>();
list.add(new EmployeeInformation("01","srihari",26,"male","FullStack",2022,35000));
list.add(new EmployeeInformation("02","Praveen",30,"male","HR",2021,36000));
list.add(new EmployeeInformation("03","Mounika",25,"female","HR",2003,34000));
list.add(new EmployeeInformation("04","raj",24,"male","Developer",2022,37000));
list.add(new EmployeeInformation("05","nikhil",25,"male","FullStack",2010,38000));
list.add(new EmployeeInformation("06","prasad",24,"male","FullStack",2022,39000));
list.add(new EmployeeInformation("07","manas",21,"male","Tech Support",2022,33000));
list.add(new EmployeeInformation("08","suchith",21,"male","FullStack",2003,36000));
list.add(new EmployeeInformation("09","suraj",26,"male","Developer",2012,39000));
list.add(new EmployeeInformation("10","rahul",24,"male","HR",2013,31000));
list.add(new EmployeeInformation("11","asif",27,"male","HR",2022,36000));
list.add(new EmployeeInformation("12","Soumya",26,"female","Manager",2002,138000));

System.out.println("\n//========== 1.How many  female employees are there in the organization?====================//\n");
	long employeedetails=list.stream().filter(p->p.gender=="female")
			.map(p->p.name).
			count();
	System.out.println(employeedetails);
	
	System.out.println("\n//========== display all departments information====================//\n");
	
	List<String>dept=list.stream()
			.map(p->p.department).distinct() .collect(Collectors.toList());
	System.out.println(dept);
	
	System.out.println("\n//========== display all departments information====================//\n");

	list.stream()
			.map(p->p.department).distinct().forEach(System.out::println);

	
	System.out.println("\n//========== find average age of all male employees====================//\n");
	
	OptionalDouble age=list.stream()
			.filter(p->p.gender=="male")
			.mapToDouble( p -> p.getAge())
			.average();
			
	System.out.println(age);
	
	
	System.out.println("\n//========== find out who paid highest in the organization?====================//\n");
	
	Optional<EmployeeInformation> pay=list.stream().max(Comparator.comparing(p->p.getSalary()));
	System.out.println(pay);
	
	
	System.out.println("\n//========== find out Average salary in each department.====================//\n");

	Map<String, Double> avg=
			list.stream().collect(Collectors.groupingBy(n -> n.getDepartment(), 
					Collectors.averagingDouble(n -> n.getSalary())));
	
Set<String> keys=avg.keySet();
for(String str:keys) {
	System.out.println(str+ " "+avg.get(str));
}
	
	

	
	System.out.println("\n//========== who is most experienced in the organization.====================//\n");

	
	Optional<EmployeeInformation> exp=list.stream().min(Comparator.comparing(p->p.getDoj()));
	System.out.println(exp);
	
	System.out.println("\n//========== avg salary of male and female employees====================//\n");

	Map<String, Double> avg1=list.stream()
			
			.collect(Collectors.groupingBy(n->n.getGender(), 
					Collectors.averagingInt(n->n.getAge())));

	
	System.out.println(avg1);
	
	System.out.println("\n//========== get all the employee names in every department.====================//\n");


	Map<String,List<EmployeeInformation>> str=list.stream().collect(Collectors.groupingBy(p->p.getDepartment()));
	Set<String> strr=str.keySet();
	for(String key:strr) {
		System.out.println(key);
		List<EmployeeInformation>list1=str.get(key);
		for(EmployeeInformation lis:list1) {
			System.out.println(lis.getName());
		}
	}
	System.out.println("\n//========== average salary and total salary of the whole organization?.====================//\n");

	DoubleSummaryStatistics empavg=
			list.stream().collect(Collectors.summarizingDouble(EmployeeInformation::getSalary));
			         
			System.out.println("Average Salary = "+empavg.getAverage());
			         
			System.out.println("Total Salary = "+empavg.getSum());
	}

}
