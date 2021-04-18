package com.cg.jpacrud.client;

import com.cg.jpacrud.dao.JPAUtil;
import com.cg.jpacrud.model.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application

		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		student.setStudentId(100);
		student.setName("Sachin");
		service.addStudent(student);

		//at this breakpoint, we have added one record to table

		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());

		student.setName("Sachin Tendulkar"); service.updateStudent(student);

		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());


		service.removeStudent(student);
		//at this breakpoint, record is removed from table

		JPAUtil.closeEntityManagerFactory();

		System.out.println("End of program...");




	}
}
