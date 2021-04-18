package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.dao.StudentDaoImpl;
import com.cg.jpacrud.entities.StudentEntity;
import com.cg.jpacrud.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {

		dao.addStudent(student);

	}

	@Override
	public void updateStudent(Student student) {

		dao.updateStudent(student);

	}

	@Override
	public void removeStudent(Student student) {

		dao.removeStudent(student);

	}

	@Override
	public Student findStudentById(int id) {
		//no need of transaction, as it's an read operation
		Student student  = dao.getStudentById(id);
		return student;
	}
}
