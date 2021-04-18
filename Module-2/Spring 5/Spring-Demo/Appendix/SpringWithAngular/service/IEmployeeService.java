package com.cg.springwithangular.service;

import java.util.List;

import com.cg.springwithangular.beans.Employee;



public interface IEmployeeService {
	public List<Employee> getAllEmployee();
	public void addEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee searchEmployee(int id);
	public void updateEmployee(Employee emp);
}
