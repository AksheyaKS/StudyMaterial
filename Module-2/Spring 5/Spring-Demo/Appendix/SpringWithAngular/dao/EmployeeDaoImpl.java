package com.cg.springwithangular.dao;

import java.util.List;

import org.springframework.stereotype.Repository;



import com.cg.springwithangular.beans.Employee;
import com.cg.springwithangular.staticdb.EmployeeDb;
@Repository("empdao")
public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return EmployeeDb.getEmpList();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		List<Employee> myList=EmployeeDb.getEmpList();
		for (Employee emp : myList) {
			if(emp.getEmpId()==id) {
				myList.remove(emp);
				break;
			}
		}
		
		
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		List<Employee> allList=EmployeeDb.getEmpList();
		allList.add(emp);
		System.out.println(allList);
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		List<Employee> allList=EmployeeDb.getEmpList();
		for (Employee employee : allList) {
			if(employee.getEmpId()==id) {
				emp=employee;
				break;
			}
		}
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		List<Employee> allList=EmployeeDb.getEmpList();
		for (Employee employee : allList) {
			if(employee.getEmpId()==emp.getEmpId()) {
				employee.setEmpName(emp.getEmpName());
				employee.setEmpSalary(emp.getEmpSalary());
				employee.setEmpDepartment(emp.getEmpDepartment());
				break;
			}
		}
	}

	
}
