package JDBC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class D_Deleting_record {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Email-Id to delete a record!!");
			String email = scan.next();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","test");//At times some developers do not give Port numbers, but that's not a good practice.
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("DELETE FROM employee WHERE email='"+email+"'");
			con.close();//Not mandatory to close connection, but a good practice.
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}