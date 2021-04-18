package com.cg.sms.service;

import java.util.List;

import com.cg.sms.dao.StudentDAO;
import com.cg.sms.dao.StudentDAOImpl;
import com.cg.sms.exceptions.SMSException;
import com.cg.sms.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDAO studentDao = new StudentDAOImpl();

	@Override
	public void createStudentTable() throws SMSException {
		studentDao.createStudentTable();
	}

	@Override
	public int insertStudentDetails(Student student) throws SMSException {
		return studentDao.insertStudent(student);
	}

	@Override
	public int addStudents(List<Student> list) throws SMSException {
		return studentDao.addStudents(list);
	}

	@Override
	public List<Student> getAllStudents() throws SMSException {
		return studentDao.getAllStudents();
	}

	@Override
	public List<Student> getAllStudentOnCourse(String course) throws SMSException {
		return studentDao.getAllStudentsBasedOnCourse(course);
	}

}
