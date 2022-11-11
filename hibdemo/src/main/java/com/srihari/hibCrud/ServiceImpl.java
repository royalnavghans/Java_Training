package com.srihari.hibCrud;



public class ServiceImpl implements ServiceFile {
	@Override
	public void createEmployee(MainFile employee) {
		new DAOimpl().addEmployee(employee);
	}
 
	@Override
	public MainFile getEmployeebyId(int employeeId) {
		return new DAOimpl().fetchEmployeebyId(employeeId);
	}
 
	@Override
	public void updateEmployeeById(int employeeId, Double newSal) {
		new DAOimpl().updateEmployeeById(employeeId, newSal);
	}
 
	@Override
	public void deleteEmployeeById(Integer employeeId) {
		new DAOimpl().deleteEmployeeById(employeeId);
	}
}
