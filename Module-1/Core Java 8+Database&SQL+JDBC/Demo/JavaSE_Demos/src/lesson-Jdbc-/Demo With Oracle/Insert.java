package com.capgemini.lesson16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try	{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			Connection conn = 
			DriverManager.getConnection (
			"jdbc:oracle:thin:@192.168.224.26:1521:trgdb", "user2", "user2");

			
			Statement stmt = conn.createStatement (); 
			int count = stmt.executeUpdate ("insert into emp values(4070,'Habib','Sales',1111,'12-Jan-2010',1200,12,10)");
			
			
			System.out.println("Record is inserted successfully !!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
