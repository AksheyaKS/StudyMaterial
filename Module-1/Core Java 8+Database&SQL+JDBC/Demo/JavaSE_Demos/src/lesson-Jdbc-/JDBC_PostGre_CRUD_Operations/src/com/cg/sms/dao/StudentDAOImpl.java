package com.cg.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.sms.exceptions.SMSException;
import com.cg.sms.model.Student;
import com.cg.sms.utility.JdbcUtility;

public class StudentDAOImpl implements StudentDAO {

	Connection connection = null;
	PreparedStatement statement = null;

	@Override
	public void createStudentTable() throws SMSException {

		connection = JdbcUtility.getConnection();
		try {
			statement = connection.prepareStatement(QueryMapper.createQuery);
			statement.execute();
			System.out.println("table created");
		} catch (SQLException e) {
			throw new SMSException("unable to create statement object");
		}

	}

	@Override
	public int insertStudent(Student student) throws SMSException {

		int result = 0;
		connection = JdbcUtility.getConnection();
		try {

			statement = connection.prepareStatement(QueryMapper.insertQuery);
			// statement.setInt(1, student.getId());
			statement.setString(1, student.getName());
			statement.setString(2, student.getCourse());
			statement.setDouble(3, student.getFeesPaid());
			statement.setString(4, student.getAddress());

			result = statement.executeUpdate();

		} catch (SQLException e) {
			throw new SMSException("some problem occured while creating statement");
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new SMSException("problem occured while closing statement");
			}
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SMSException("problem occured while closing connection");
			}
		}
		return result;
	}

	@Override
	public int addStudents(List<Student> list) throws SMSException {

		int res = 0;
		int arr[] = null;
		connection = JdbcUtility.getConnection();
		try {
			statement = connection.prepareStatement(QueryMapper.insertQuery);

			for (Student student : list) {
				statement.setString(1, student.getName());
				statement.setString(2, student.getCourse());
				statement.setDouble(3, student.getFeesPaid());
				statement.setString(4, student.getAddress());
				// statement.executeUpdate();
				statement.addBatch();
				// connection.commit();
				// res++;
			}

			arr = statement.executeBatch();

		} catch (SQLException e) {
			throw new SMSException("problem occured while creating statement");
		}

		return arr.length;
	}

	@Override
	public List<Student> getAllStudents() throws SMSException {

		connection = JdbcUtility.getConnection();
		ResultSet resultSet = null;
		List<Student> list = new ArrayList<>();

		try {
			statement = connection.prepareStatement(QueryMapper.selectQuery);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String course = resultSet.getString(3);
				double fees = resultSet.getDouble(4);
				String address = resultSet.getString(5);
				Student student = new Student(id, name, course, fees, address);
				list.add(student);
			}
		} catch (SQLException e) {
			throw new SMSException("problem occured while creating statement");
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				throw new SMSException("unable to close resultset");
			}
			try {
				statement.close();
			} catch (SQLException e) {
				throw new SMSException("unable to close statement");
			}
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SMSException("unable to close connection");
			}
		}
		return list;
	}

	@Override
	public List<Student> getAllStudentsBasedOnCourse(String course) throws SMSException {

		List<Student> list = new ArrayList<>();
		ResultSet resultSet = null;

		connection = JdbcUtility.getConnection();
		try {
			statement = connection.prepareStatement(QueryMapper.selectQueryOnCourse);
			statement.setString(1, course);

			resultSet = statement.executeQuery();

			while (resultSet.next()) {

				String name = resultSet.getString("student_name");
				double fees = resultSet.getDouble("fees_paid");

				Student student = new Student();
				student.setName(name);
				student.setFeesPaid(fees);

				list.add(student);
			}

			if (list.isEmpty()) {
				throw new SMSException("no student selected the given course : " + course);
			}

		} catch (SQLException e) {
			throw new SMSException("problem occured while creating statement");
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				throw new SMSException("unable to close resultset");
			}
			try {
				statement.close();
			} catch (SQLException e) {
				throw new SMSException("unable to close statement");
			}
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SMSException("unable to close connection");
			}
		}

		return list;
	}
}
