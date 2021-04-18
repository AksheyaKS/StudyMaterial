package com.cg.sms.service;

import java.util.List;

import com.cg.sms.exceptions.SMSException;
import com.cg.sms.model.Student;

public interface StudentService {

	void createStudentTable() throws SMSException;

	int insertStudentDetails(Student student) throws SMSException;

	int addStudents(List<Student> list) throws SMSException;

	List<Student> getAllStudents() throws SMSException;

	List<Student> getAllStudentOnCourse(String course) throws SMSException;

}
