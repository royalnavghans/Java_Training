package com.srihari.hibAss1;

public interface DAOInterface {
	 
	public abstract void addCustomer(MainFile customer);
	public abstract MainFile  fetchCustomerbyId(int cus_Id);
	public abstract void updateCustomerById(int cus_Id,String cus_loc);
	public abstract void  deleteCustomerById(Integer cus_Id);
}
