package this_keyword;

//'this' keyword refers to current invoking object.
public class Student {
	
	int studentId;//Non-static variable
	String studentName;
	String studentCity;
	
	Student (){
		this(1, 20);//this function here used to call other constructor
		studentCity = "mumbai";
		//Here both refers to the same variable.
		System.out.println(studentCity);
		System.out.println(this.studentCity);
	}
	
	Student (int i, int s) {
		System.out.println(i);
	}
	
	Student (int studentId, String studentCity){//here the argument variables r local variable.
		this.studentId = studentId;
		this.studentCity = studentCity;
		System.out.println(this.studentId);
		System.out.println(this.studentCity);
	}
	
	public static void main(String[] args) {
		Student a1 = new Student();
		Student a2 = new Student(10, "bengaluru");
		a1.test();
	}
	
	public void test() {
		System.out.println(studentCity);
	}
}
