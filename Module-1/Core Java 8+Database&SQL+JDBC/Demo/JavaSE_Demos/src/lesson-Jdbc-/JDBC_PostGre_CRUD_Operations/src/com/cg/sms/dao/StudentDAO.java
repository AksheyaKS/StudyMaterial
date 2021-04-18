package com.cg.sms.dao;

import java.util.List;

import com.cg.sms.exceptions.SMSException;
import com.cg.sms.model.Student;

public interface StudentDAO {

	void createStudentTable() throws SMSException;

	int insertStudent(Student student) throws SMSException;

	int addStudents(List<Student> list) throws SMSException;

	List<Student> getAllStudents() throws SMSException;

	List<Student> getAllStudentsBasedOnCourse(String course) throws SMSException;

}
