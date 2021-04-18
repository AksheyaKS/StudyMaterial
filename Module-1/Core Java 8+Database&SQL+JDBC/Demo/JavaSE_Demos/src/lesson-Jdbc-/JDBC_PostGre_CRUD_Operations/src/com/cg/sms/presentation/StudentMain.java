package com.cg.sms.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.sms.exceptions.SMSException;
import com.cg.sms.model.Student;
import com.cg.sms.service.StudentService;
import com.cg.sms.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		StudentService service = new StudentServiceImpl();
		
		System.out.println("Enter coursename");
		String course = scanner.nextLine();
		List<Student> list = null;
		
		try {
			list = service.getAllStudentOnCourse(course);
			for(Student student : list) {
				System.out.println(student.getName() + " --- " + student.getFeesPaid());
			}
		} catch (SMSException e) {
			System.err.println(e.getMessage());
		}
		
		
		/*===========================================================================================*/
		//select all records
		/*List<Student> students = null;
		try {
			students = service.getAllStudents();
			
			for(Student student : students) {
				System.out.println(student);
			}
			
		} catch (SMSException e) {
			System.err.println(e.getMessage());
		}*/
		
				
		/*===========================================================================================*/
		//inserting multiple records
		
		/*List<Student> list = new ArrayList<>();
		System.out.println("how mant students u want to add?");
		int choice = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < choice; i++) {
			
			System.out.println("Enter StudentName:");
			String studentname = scanner.nextLine();
			System.out.println("Enter course name");
			String course = scanner.nextLine();
			System.out.println("Enter fees paid:");
			double fees = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("enter address:");
			String address = scanner.nextLine();
			Student student = new Student(studentname, course, fees, address);
			list.add(student);
		}
		int result = 0;
		try {
			result = service.addStudents(list);
			System.out.println(result + " students inserted..");
		} catch (SMSException e) {
			System.err.println(e.getMessage());
		}*/
		
			
		/*===========================================================================================*/
		//inserting one record
		/*System.out.println("Enter StudentName:");
		String studentname = scanner.nextLine();
		System.out.println("Enter course name");
		String course = scanner.nextLine();
		System.out.println("Enter fees paid:");
		double fees = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("enter address:");
		String address = scanner.nextLine();
		
		Student student = new Student(studentname, course, fees, address);

		int count = 0;

		try {
			count = service.insertStudentDetails(student);
			System.out.println(count + " records inserted..");
		} catch (SMSException e) {
			System.err.println(e.getMessage());
		}finally {
			scanner.close();
		}*/

		/*===========================================================================================*/
		//create table call
		/*try {
			service.createStudentTable();
		} catch (SMSException e) {
			System.err.println(e.getMessage());
		}*/
	}
}
