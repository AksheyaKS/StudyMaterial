package com.cg.jpacrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.cg.jpacrud.entities.StudentEntity;
import com.cg.jpacrud.model.Student;

public class StudentDaoImpl implements StudentDao {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public StudentDaoImpl() {
		entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public Student getStudentById(int id) {
		StudentEntity entity = entityManager.find(StudentEntity.class, id);
		Student student = new Student();
		student.setName(entity.getName());
		student.setStudentId(entity.getStudentId());
		return student;
	}

	@Override
	public void addStudent(Student student) {
		beginTransaction();
		StudentEntity entity = new StudentEntity();
		entity.setName(student.getName());
		entity.setStudentId(student.getStudentId());
		entityManager.persist(entity);
		commitTransaction();

	}

	@Override
	public void removeStudent(Student student) {

		StudentEntity entity = entityManager.find(StudentEntity.class, student.getStudentId());
		if(entity!=null)		
			entityManager.remove(entity);
	}

	@Override
	public void updateStudent(Student student) {
		StudentEntity entity = entityManager.find(StudentEntity.class, student.getStudentId());
		if(entity!=null) {
			beginTransaction();
			entity.setName(student.getName());
			commitTransaction();
		}
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}
