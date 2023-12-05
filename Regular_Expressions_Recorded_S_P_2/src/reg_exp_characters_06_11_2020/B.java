package reg_exp_characters_06_11_2020;

import java.util.Scanner;

//Mobile Phone Validator.
public class B {
	public static void main(String[] args){
		System.out.println("Enter your Mobile Number");
		Scanner s = new Scanner(System.in);
		String str = s.next();//This kind of approach with Reg Exp helps us with dealing numbers related validations.
		//String str = "9632882052";  //we will try with user inputs using scanner class.
		String regex = "[6-9][0-9]{9}";
		
		if (str.matches(regex)) {//In this conditional statement only we are matching the user input String value with our conditional String statement. matches() is a built in function 
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}//By this way we can easily implement Mobile No validation. With this back-end java code we can easily Validate any String, without using Html code which is not at all safe., where in html codes breaking and altering the code is so easy that anyone can modify on the browser itself.
	//So no one can see the JAVA code which is in-accessible.
}
