package com.cg.jpacrud.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class StudentEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer studentId;
	private String name;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
