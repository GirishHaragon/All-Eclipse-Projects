package JDBC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into employee values('aaditya','aaditya@gmail.com','8884168355','Bangalore')");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}