package com.srihari.hibCrud;
import com.srihari.hibdemo.*;
import com.srihari.hibdemo1.Employee;

import org.hibernate.HibernateException;
import org.hibernate.Session;




public class DAOimpl implements DAOClass {

	public void addEmployee(MainFile employee) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id =(Integer)session.save(employee);
			System.out.println("Employee is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	@Override
	public MainFile fetchEmployeebyId(int employeeId) {
		MainFile employee = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			 employee = session.get(MainFile.class,employeeId );
			if(employee != null){
				return employee;
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateEmployeeById(int employeeId, Double newSal) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			MainFile employee = session.get(MainFile.class, employeeId);
			if(employee != null){
				//employee.setSalary(newSal);
				session.beginTransaction();
				session.update(employee);
				session.getTransaction().commit();
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			MainFile employee = session.get(MainFile.class, employeeId);
			if(employee != null){
				session.beginTransaction();
				
				session.delete(employee);
				session.getTransaction().commit();
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	
	}
}
