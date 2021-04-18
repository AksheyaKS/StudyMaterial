package com.cg.springwithangular.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.springwithangular.beans.Employee;
import com.cg.springwithangular.service.IEmployeeService;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class EmployeeController {
	@Autowired
	IEmployeeService empservice;

	@RequestMapping(value = "/employee",method = RequestMethod.GET,headers="Accept=application/json")
	public List<Employee> getAllCounties(Model model) {
		return empservice.getAllEmployee();
	}

	@RequestMapping(value = "/employee/delete/{id}",
			headers="Accept=application/json",method = RequestMethod.DELETE)
	public List<Employee> deleteEmployee(@PathVariable("id") int id) {
		System.out.println(id);
		empservice.deleteEmployee(id);
		return empservice.getAllEmployee();
	}
	@RequestMapping(value ="/employee/create/",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.POST)
	public List<Employee> createEmployee(@RequestBody Employee emp) {

		System.out.println("hiiii");
		System.out.println(emp);
		empservice.addEmployee(emp);
		return empservice.getAllEmployee();
	}
	@RequestMapping(value ="/employee/search/{id}",headers="Accept=application/json",method = RequestMethod.GET)
	public Employee searchEmployee(@PathVariable("id") int id) {
		System.out.println("In search");
		return empservice.searchEmployee(id);
	}
	@RequestMapping(value ="/employee/update/",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.PUT)
	public List<Employee> updateEmployee(@RequestBody Employee emp) {

		System.out.println("Update");
		System.out.println(emp);
		empservice.updateEmployee(emp);
		return empservice.getAllEmployee();
	}
}
