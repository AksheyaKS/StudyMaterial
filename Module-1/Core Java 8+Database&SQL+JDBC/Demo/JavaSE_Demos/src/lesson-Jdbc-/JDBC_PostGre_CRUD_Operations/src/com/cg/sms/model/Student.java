package com.cg.sms.model;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6296278598140695235L;
	private Integer id;
	private String name;
	private String course;
	private Double feesPaid;
	private String address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String course, Double feesPaid, String address) {
		super();
		this.name = name;
		this.course = course;
		this.feesPaid = feesPaid;
		this.address = address;
	}
	
	public Student(Integer id, String name, String course, Double feesPaid, String address) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.feesPaid = feesPaid;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(Double feesPaid) {
		this.feesPaid = feesPaid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", feesPaid=" + feesPaid + ", address="
				+ address + "]";
	}

}
