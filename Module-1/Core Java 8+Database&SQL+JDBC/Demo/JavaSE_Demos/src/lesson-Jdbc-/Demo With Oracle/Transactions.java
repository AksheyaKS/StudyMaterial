package com.capgemini.lesson16;
import java.sql.*;
import oracle.jdbc.*;

public class Transactions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * create table Account_1( ano number(6) not null, name varchar2(20),
		 * balance number(8,2))
		 */
		OracleConnection conn = null;
		OracleSavepoint spoint = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = (OracleConnection) DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.224.26:1521:trgdb", "user2",
					"user2");

			// Disabling auto commit mode
			conn.setAutoCommit(false);
			// conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			/*
			 * Performing transaction to transfer the 100 RS amount from Rohan's
			 * account to Sheela's Account
			 */

			DatabaseMetaData dbmd = conn.getMetaData();

			// Check whether Savepoint is supported

			if (dbmd.supportsSavepoints())
				System.out.println("Savepoint is supported");
			else
				System.out.println("Savepoint is not supported");
			// Display the Account Details before transaction
			System.out.println("Before Transaction .....");
			Statement stmt0 = conn.createStatement();
			ResultSet rs1 = stmt0.executeQuery("select * from Account_1");
			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + "    " + rs1.getString(2)
						+ "     " + rs1.getDouble(3));
			}
			spoint = conn.oracleSetSavepoint();

			Statement stmt1 = conn.createStatement();
			stmt1
					.executeUpdate("update Account_1 set balance=balance-100 where name='ROHAN'");

			Statement stmt2 = conn.createStatement();
			stmt2
					.executeUpdate("update Account_1 set balanc=balance+100 where name='Sheela'");

			conn.commit();
			System.out.println("After Transaction .....");
			Statement stmt3 = conn.createStatement();
			ResultSet rs2 = stmt3.executeQuery("select * from Account_1");
			while (rs2.next()) {
				System.out.println(rs2.getInt(1) + "    " + rs2.getString(2)
						+ "     " + rs2.getDouble(3));
			}

			conn.close();

		} catch (SQLException e) {

			System.out.println("Rollbacking Transaction .....");
			try {
				conn.oracleRollback(spoint);

				System.out.println("After Rollback .....");
				Statement stmt3 = conn.createStatement();
				ResultSet rs2 = stmt3.executeQuery("select * from Account_1");
				while (rs2.next()) {
					System.out.println(rs2.getInt(1) + "    "
							+ rs2.getString(2) + "     " + rs2.getDouble(3));
				}

			} catch (SQLException ae) {
				System.out.println("Error " + ae.getMessage());
			}

		}

	}

}
