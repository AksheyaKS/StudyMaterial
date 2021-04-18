package com.cg.sms.dao;

public interface QueryMapper {

	String createQuery = "create table student_course_master(id int primary key,student_name varchar(20),course_name varchar(20),fees_paid decimal(8,3),address varchar(20))";

	String insertQuery = "insert into student_course_master values(nextval('student_sequence'),?,?,?,?)";

	String selectQuery = "select *from student_course_master";

	String selectQueryOnCourse = "select student_name,fees_paid from student_course_master where course_name=?";

}
