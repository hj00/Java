package jdpcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrclTest {
	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:70.12.50.50:1521:XE";
		String DB_USER = "dream25";
		String DB_PASSWORD = "catcher";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM emp";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(6);
				String comm = rs.getString(7);
				String depno = rs.getString(8);
				
				System.out.println(empno + " : " + ename + " : " + job + " : " + mgr + " : " + hiredate + " : " + comm + " : " + depno );
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs. close();
				stmt.close();
				conn.close();
			} catch(Exception e) {
				
			}
		}
		
	}
} // Ŭ������ ��