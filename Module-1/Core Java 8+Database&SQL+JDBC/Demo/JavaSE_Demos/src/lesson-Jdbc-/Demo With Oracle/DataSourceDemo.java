package com.capgemini.lesson16;
import java.sql.*;

import oracle.jdbc.pool.OracleDataSource;

public class DataSourceDemo {

	public static void main(String[] args) {
		
		try {
			// Create a OracleDataSource instance explicitly
			OracleDataSource ods = new OracleDataSource();

			// Set the user name, password, driver type and network protocol
			ods.setUser("testuser");
			ods.setPassword("testuser");
			ods.setDriverType("thin");
			ods.setNetworkProtocol("tcp");
			ods.setURL("jdbc:oracle:thin:@192.168.224.26:1521:trgdb");

			// Retrieve a connection
			Connection conn = ods.getConnection();
			// Create a Statement
			Statement stmt = conn.createStatement();

			// Select the NAME column from the Account_1 table
			ResultSet rset = stmt.executeQuery("select ename from emp");

			System.out.println("Emp Names are:- ");
			// Iterate through the result and print the Account holder names
			while (rset.next())
				System.out.println(rset.getString(1));

			// Close the RseultSet
			rset.close();
			rset = null;

			// Close the Statement
			stmt.close();
			stmt = null;
			// Close the connection
			conn.close();
			conn = null;
		} catch (SQLException se) {

			System.out.println("Error :-" + se.getMessage());
		}

	}
}
