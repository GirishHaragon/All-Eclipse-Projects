import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B {
	public static void main(String[] args) throws SQLException, IOException {
		FileWriter fw = new FileWriter("D://test.txt");
		DriverManager.getConnection("", "", "");//We use JDBC code here. //With this we get two categories of exception //When we press Ctrl+1 keeping cursor on the error we get to see 'add throws declaration(IOException)'. And again we get to see 'Add Throws declaration' when we press Ctrl+1.
		//This means, after throws keyword we can give Multiple class names.
	}
}