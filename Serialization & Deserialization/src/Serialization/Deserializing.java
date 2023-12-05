package Serialization;

import java.io.*;

public class Deserializing {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp = null;//Instead of keeping the object value null we can use Emp emp at line 13 only
		try {
			FileInputStream fileIn = new FileInputStream("D:\\Sanket\\Char.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Emp) in.readObject();
			in.close();
			fileIn.close();
		} 
		finally {
			System.out.println("Deserializing Employee..");
			System.out.println("FirstName of Employee: " + emp.name);
			System.out.println("LastName of Employee: " + emp.address);
		}
	}
}