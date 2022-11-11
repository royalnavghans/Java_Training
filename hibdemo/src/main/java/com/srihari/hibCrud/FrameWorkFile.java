package com.srihari.hibCrud;


import java.util.Date;

 

public class FrameWorkFile {

	public static void main(String[] args) {
		ServiceFile employeeService = new ServiceImpl();
		createEmployee(employeeService);
    	getEmployeebyId(employeeService);
    	updateEmployeeById(employeeService);
    	deleteEmployeeById(employeeService);
	  }

	private static void deleteEmployeeById(ServiceFile employeeService) {
		employeeService.deleteEmployeeById(8);
	}

	private static void updateEmployeeById(ServiceFile employeeService) {
		employeeService.updateEmployeeById(12, 180000.00);
	}

	private static MainFile getEmployeebyId(ServiceFile employeeService) {
		MainFile employee = employeeService.getEmployeebyId(2);
		System.out.println(employee);
		return employee;
	}

	private static void createEmployee(ServiceFile employeeService) {
		employeeService.createEmployee(getEmployee());
	}
	
	private static MainFile getEmployee(){
		MainFile employee= new MainFile();
		employee.setEmployeeName("Srihari");
		employee.setEmail("abc@gmail.com");
		employee.setSalary(35600.00);
		employee.setDoj(new Date());
		return employee;
	}
}