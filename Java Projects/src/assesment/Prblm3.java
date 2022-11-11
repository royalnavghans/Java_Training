/*3) Create three sub classes namely: programmer, admin and librarian to store bonus,
overtime and total salary for each employee. Each of the constructor in should inherit the properties of Employee and implement the EmployeeSalary interface.

Hide the properties from the parent class Employee using encapsulation principle.

Use getters and setters to make the properties in Employee visible and accessible to other.
*/


package assesment;
interface EmployeeSalary{

}

class Employee implements EmployeeSalary {
	double bonus;
	double overtime;
	double totalsalary;
	

}

class programmer extends Employee {
	
	programmer() {
		bonus = overtime;
		overtime = overtime;
		totalsalary = totalsalary;
		
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}
}



class admin extends Employee {

	admin(double bonus, double overtime, double totalSalary) {
		this.bonus = bonus;
		this.overtime = overtime;
		this.totalsalary = totalSalary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}
}

class librarian extends Employee {

	librarian(double bonus, double overtime, double totalSalary) {
		this.bonus = bonus;
		this.overtime = overtime;
		this.totalsalary = totalSalary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}
	
}

public class Prblm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		admin obj1=new admin(2500,7500,35000);
		obj1.setBonus(2500);
		obj1.setOvertime(3500);
		obj1.setTotalsalary(35000);
		System.out.println("The Admin Salary List :"+"\n Bonus : "+obj1.getBonus()+"\n Overtime : "+obj1.getOvertime()+"\n Total Salary "+obj1.getTotalsalary());
		System.out.println("\n");
		
	//======================================================================================================//
		programmer obj2=new programmer();
		obj2.setBonus(7500);
		obj2.setOvertime(7500);
		obj2.setTotalsalary(35000);
		System.out.println("The Programmer Salary List :"+"\n Bonus : "+obj2.getBonus()+"\n Overtime : "+obj2.getOvertime()+"\n Total Salary "+obj2.getTotalsalary());
		System.out.println("\n");
		//=====================================================================================================//
		librarian obj3=new librarian(2500,7500,35000);
		obj3.setBonus(2500);
		obj3.setOvertime(2500);
		obj3.setTotalsalary(25000);
		System.out.println("The Librarian Salary List :"+" \n Bonus : "+obj3.getBonus()+"\n Overtime : "+obj3.getOvertime()+" \n Total Salary "+obj3.getTotalsalary());
		
		
		
		
		
	}
	

}
