package JDBC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class E_Update_record {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Email-Id to Update a record!!");
			String email = scan.next();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","test");//At times some developers do not give Port numbers, but that's not a good practice.
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("UPDATE employee SET email='girishharagon115@gmail.com' WHERE email='"+email+"'");
			con.close();//Not mandatory to close connection, but a good practice.
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}//So far we saw 3 imp operations inserting, deleting & updating a record. //No we need to look at Reading record from DB.
