package JDBC_example;

import java.sql.*;//Here it may become more than 1 SQL imports, then we can simply write * after sql. That would reduce extra unnecessary imports. 

public class A {
	public static void main(String[] args) {
		try {//JDBC program always throws CompileTimeException, so writing try/catch block becomes mandatory.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1", "root", "test"); //There r lot of built-in class, in which driver manager in sql package. //'getConnection' is a static method present in DriverManager class & DrMngr is a part of our 'java.sql' package. //To connect with the DB we need 2 params that r 'the URL','username'.'password'. //We assign this statement to a local var so that whenever we refer to that variable we can use this jdbc connection code.
		} catch (Exception e) {//JDBC is the protocol/concept using which we r connecting to Mysql db, mysql is the DB, localhost is local computer, 3306 is the port no, db_1 is the name of our DB. username is root & password is pswrd of MySQL DB.
			e.printStackTrace();
		}
	}
}