package com.srihari.hibAss;



public interface InterfaceMain {
	 
	public abstract void createCustomer(MainFile customer);
	public abstract MainFile  getCustomerId(int cus_Id);
	public abstract void updateCustomerById(int cus_Id,String cus_loc);
	public abstract void  deleteCustomerById(Integer cus_Id);
}
