package com.cg.sms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.sms.exceptions.SMSException;

public class JdbcUtility {

	private static Connection connection = null;

	public static Connection getConnection() throws SMSException {

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres",
					"capgemini123");
		} catch (ClassNotFoundException e) {
			throw new SMSException("driver not loaded");
		} catch (SQLException e) {
			throw new SMSException("not connected to DB");
		}
		return connection;
	}
}
