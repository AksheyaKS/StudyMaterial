package com.capgemini.lesson16;
import java.sql.*;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try	{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			Connection conn = 
			DriverManager.getConnection (
			"jdbc:oracle:thin:@192.168.224.26:1521:trgdb", "user2", "user2");

			// Query the employee details 
			Statement stmt = conn.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
			ResultSet rset = stmt.executeQuery ("select empno, ename from emp");
			
			// Print the no and name 
			System.out.println("Employee No             Employee Name");
			System.out.println("_______________________________________");
			while (rset.next()) {
				System.out.println (rset.getInt (1)+"                       "+rset.getString (2));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}

/*
 * 
 create table employee_1(
 empno number(5), 
 ename varchar2(20), 
 esalary number(8,2));
 * 
 */
