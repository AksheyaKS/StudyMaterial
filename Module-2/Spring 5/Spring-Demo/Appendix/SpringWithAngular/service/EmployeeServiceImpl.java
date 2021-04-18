package com.cg.springwithangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.springwithangular.beans.Employee;
import com.cg.springwithangular.dao.IEmployeeDao;
@Service("empservive")
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	IEmployeeDao empdao;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empdao.getAllEmployee();
	}
	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		empdao.deleteEmployee(id);
	}
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
	  empdao.addEmployee(emp);
		
	}
	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return empdao.searchEmployee(id);
	}
	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empdao.updateEmployee(emp);
	}

	/*@Override
	public void addCountry(Employee country) {
		// TODO Auto-generated method stub
		countryDao.addCountry(country);
	}

	@Override
	public Employee deleteCountry(int id) {
		// TODO Auto-generated method stub
		return countryDao.deleteCountry(id);
	}
*/
}
