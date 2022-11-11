package com.srihari.hibdemo1;
import java.util.Date;
import com.srihari.hibdemo.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class EmployeeFramework {
	
	

	public static void main(String[] args) {
	    try(Session session = HibernateUtils.getSessionFactory().openSession()) {
	    	
	    	session.beginTransaction();
	    	/*
	    	 persist() -> This method is used to save an entity/object into database and return a void.
	    	  It will throw an exception if an entity already exists in the database.
	    	 */
	    	session.persist(getEmployee1());
	    	
	    	/*
	    	 save() -> This method is used to save an entity/object into database and return generated primarykey.
	    	  It will throw an exception if an entity already exists in the database.
	    	 */
	    	Integer id =(Integer)session.save(getEmployee2());
	    	System.out.println("Student is created  with Id::"+id);
	    	
	    	
	    	//saveOrUpdate()->This method is used to either save or update an entity in the database.
	    	session.saveOrUpdate(getEmployee3());
	    	
	    	session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }
	

	
	private static Employee getEmployee1(){
		Employee employee= new Employee();
		employee.setStudentName("srihari");
		employee.setStudentDept("Computer");
		employee.setTotalMarks(95.0);
		employee.setDoj(new Date());
		return employee;
	}
	
	private static Employee getEmployee2(){
		Employee employee= new Employee();
		employee.setStudentName("vishnu");
		employee.setStudentDept("Spring");
		employee.setTotalMarks(89.0);
		employee.setDoj(new Date());
		return employee;
	}
	
	private static Employee getEmployee3(){
		Employee employee= new Employee();
		employee.setStudentName("hari");
		employee.setStudentDept("Java");
		employee.setTotalMarks(85.0);
		employee.setDoj(new Date());
		return employee;
	}	
}
