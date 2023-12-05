package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializing {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.name = "Monica Mittal";
		e.address = "Hyderabad";
		
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\Sanket\\Char.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is Saved in chsr.txt file");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
