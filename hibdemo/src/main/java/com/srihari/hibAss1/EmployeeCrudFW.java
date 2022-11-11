package com.srihari.hibAss1;

public class EmployeeCrudFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMain obj = new InterfaceMainImpl();
		createCustomer(obj);
		getCustomerId(obj);
		updateCustomerById(obj);
		deleteCustomerById(obj);

	}

	private static void createCustomer(InterfaceMain obj) {
		// TODO Auto-generated method stub

		obj.createCustomer(createCustomers());
	}

	private static MainFile createCustomers() {
		MainFile obj1 = new MainFile();
		obj1.setCustName("Srihari");
		obj1.setCustLoc("India");
		return (obj1);

	}

	private static void getCustomerId(InterfaceMain obj) {
		// TODO Auto-generated method stub
		obj.getCustomerId(9);

	}

	private static void updateCustomerById(InterfaceMain obj) {
		// TODO Auto-generated method stub
		obj.updateCustomerById(5, "Australia");
	}

	private static void deleteCustomerById(InterfaceMain obj) {
		// TODO Auto-generated method stub
		obj.deleteCustomerById(3);
	}

}
