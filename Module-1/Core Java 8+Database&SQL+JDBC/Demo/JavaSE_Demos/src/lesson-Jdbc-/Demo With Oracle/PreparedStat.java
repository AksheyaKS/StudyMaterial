package com.capgemini.lesson16;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class PreparedStat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int eno=0;
        String ename=null;
        double esal=0.0;
        try{
        
        System.out.println("Enter the Employee Number := ");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));       
        eno=Integer.parseInt(br1.readLine());
        
        System.out.println("Enter the Employee Name := ");
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));       
        ename=br2.readLine();
        
        System.out.println("Enter the Employee Salary := ");
        BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));       
        esal=Double.parseDouble(br3.readLine());
        
        
               
        
        }catch(IOException e){ 
        	System.out.println(e.getMessage());
        }
        
        
		try	{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			Connection conn = 
			DriverManager.getConnection (
			"jdbc:oracle:thin:@192.168.224.26:1521:trgdb", "user2", "user2");

			
			PreparedStatement pstmt = conn.prepareStatement("insert into emp values(?,?,?)"); 
			pstmt.setInt(1, eno);
			pstmt.setString(2,ename);
			pstmt.setDouble(3,esal);
			
			int count=pstmt.executeUpdate();
					
			
			System.out.println("Record is inserted successfully !!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
