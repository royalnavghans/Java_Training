package com.srihari.hibCrud;



public interface ServiceFile {
	 
	public abstract void createEmployee(MainFile employee);
	public abstract MainFile  getEmployeebyId(int employeeId);
	public abstract void updateEmployeeById(int employeeId,Double newSal);
	public abstract void  deleteEmployeeById(Integer employeeId);
}