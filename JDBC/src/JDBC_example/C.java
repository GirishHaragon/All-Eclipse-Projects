package JDBC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//Here we save the record through Scanner class with user inputs Dynamically.
public class C {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter You Name:");
			String name = scan.next();//The name here is a local Variable.
			System.out.println("Enter You Email Id:");
			String email = scan.next();
			System.out.println("Enter You Mobile No:");
			String mobile = scan.next();
			System.out.println("Enter You city:");
			String city = scan.next();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","test");
			Statement stmnt = con.createStatement();
			//Now the challenge is how do we integrate these variables with the SQL Statement below.
			stmnt.executeUpdate("insert into employee values('"+name+"','"+email+"','"+mobile+"','"+city+"')");
			con.close();
			System.out.println("The record is Saved!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}