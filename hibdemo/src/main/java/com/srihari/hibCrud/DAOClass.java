package com.srihari.hibCrud;



public interface DAOClass {
	public abstract void addEmployee(MainFile employee);
	public abstract MainFile fetchEmployeebyId(int employeeId);
	public abstract void updateEmployeeById(int employeeId,Double newSal);
	public abstract void  deleteEmployeeById(Integer employeeId);
}

