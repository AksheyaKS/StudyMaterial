package com.capgemini.lesson16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try	{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			Connection conn = 
			DriverManager.getConnection (
			"jdbc:oracle:thin:@192.168.67.177:1521:trgdb", "user2", "user2");

			
			Statement stmt = conn.createStatement (); 
			int count = stmt.executeUpdate ("delete from employee_1 where empno=40705");
			
			
			System.out.println("No of Records deleted :="+count);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
