package com.srihari.hibAss1;


public class InterfaceMainImpl implements InterfaceMain {

	@Override
	public void createCustomer(MainFile customer) {
		new DAOImpl().addCustomer(customer);
		
	}

	@Override
	public MainFile getCustomerId(int cus_Id) {
		
		return new DAOImpl().fetchCustomerbyId(cus_Id);
	}

	@Override
	public void updateCustomerById(int cus_Id, String cus_loc) {
	new DAOImpl().updateCustomerById(cus_Id, cus_loc);
		
	}

	@Override
	public void deleteCustomerById(Integer cus_Id) {
	new DAOImpl().deleteCustomerById(cus_Id);
		
	}

}
