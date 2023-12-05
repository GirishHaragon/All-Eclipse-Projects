package Student;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Class cl = new Class();
		cl.studentDetails.setName("Santosh");
		cl.subject.setMathematics(85.4);
		cl.subject.setScience(95.3);
		cl.subject.setHistory(78.4);
		
		Class c2 = new Class();
		c2.studentDetails.setName("Sanket");
		c2.subject.setMathematics(89.4);
		c2.subject.setScience(97.3);
		c2.subject.setHistory(88.4);
		
		Class c3 = new Class();
		c3.studentDetails.setName("Stephen");
		c3.subject.setMathematics(89.4);
		c3.subject.setScience(97.3);
		c3.subject.setHistory(98.4);
		
		Class c4 = new Class();
		c4.studentDetails.setName("Alex");
		c4.subject.setMathematics(85.4);
		c4.subject.setScience(95.3);
		c4.subject.setHistory(78.4);
		
		Class c5 = new Class();
		c5.studentDetails.setName("Mike");
		c5.subject.setMathematics(45.4);
		c5.subject.setScience(65.3);
		c5.subject.setHistory(38.4);
		
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(cl);
		arrayList.add(c2);
		arrayList.add(c3);
		arrayList.add(c4);
		arrayList.add(c5);
		
//		arrayList.stream()
	}
}
