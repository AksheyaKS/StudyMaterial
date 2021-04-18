package com.cg.springwithangular.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.springwithangular.beans.Employee;



public class EmployeeDb {
private static List<Employee> empList=new ArrayList<Employee>();
	
	static{
		
		empList.add(new Employee(1001,"Rahul",5000,"Java"));
		empList.add(new Employee(1002,"Vikash",6000,"Java"));
		empList.add(new Employee(1003,"Shital",7000,".Net"));
		empList.add(new Employee(1004,"Mainframe",9000,"Veena"));
		empList.add(new Employee(1005,"Sachin",8000,"OraApps"));
	}

	public static List<Employee> getEmpList() {
		
		return empList;
	}

	public static void setCountryList(List<Employee> empList) {
		
		EmployeeDb.empList = empList;
	}
}
