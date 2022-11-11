package com.srihari.hibAss1;


import org.hibernate.Session;


import com.srihari.hibdemo.HibernateUtils;

public class DAOImpl implements DAOInterface {

	@Override
	public void addCustomer(MainFile customer) {
		Session session = HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			Integer id =(Integer)session.save(customer);
			System.out.println("Customer is created  with Id::"+id);
			session.getTransaction().commit();
		 
	}
		
	

	@Override
	public MainFile fetchCustomerbyId(int cus_Id) {
		MainFile customer = null;
		Session session = HibernateUtils.getSessionFactory().openSession();
			 customer = session.get(MainFile.class,cus_Id );
			if(customer != null){
				return customer;
			}else{
				System.out.println("Customer doesn't exist with provided Id..");
			}
		
		return null;
	}

	@Override
	public void updateCustomerById(int cus_Id, String cus_loc)  {
		// TODO Auto-generated method stub
		 Session session = HibernateUtils.getSessionFactory().openSession(); 

			MainFile customer = session.get(MainFile.class, cus_Id);
			if(customer != null){
				//employee.setSalary(newSal);
				session.beginTransaction();
				session.update(customer);
				session.getTransaction().commit();
			}else{
				System.out.println("Customer doesn't exist with provideded Id..");
			}
			
	
	}

	@Override
	public void deleteCustomerById(Integer cus_Id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
			MainFile customer = session.get(MainFile.class, cus_Id);
			if(customer != null){
				session.beginTransaction();
				session.delete(customer);
				session.getTransaction().commit();
			}else{
				System.out.println("Customer doesn't exist with provideded Id..");
			}
		} 
	

}
