package reg_exp_characters_06_11_2020;

import java.lang.reflect.Array;
import java.util.Scanner;

public class C {//String Matcher we will test it out here, by doing Name Validation..
	public static void main(String[] args) {
	try {
		System.out.println("Enter your Name (Without space)");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//String regex = "[a-zA-Z]{20}";//This makes the letters to be '20' in a string then only it gives Valid.
		//String regex = "[a-zA-Z]";//This gives Valid only if the String user input is just 1 letter out here.
		//So We search for the code online as 'name validator regex java' and we will find something like ("^[A-Za-z]\\w{5, 29}$") but that doesn't worked for us..
		//String regex = "^[A-Za-z]\\w{5, 29}$";//the regular expression checks that the string begins with a letter (uppercase or lowercase), followed by 5 to 29 alphanumeric characters (letters, digits, or underscores), and that the string ends after the final alphanumeric characters, but there may be a flaw that it isn't working well.
		String regex = "[a-zA-Z]+\\.?";//This is taking letters even single letter as name.. So to correct that to take more than 3letters we modify the condition of if block. Here there is + which we can understand as it is adding more conditions. so we tried to tackle the spaces in the str, we make it as "[a-zA-Z]+\\s+\\.?" but that is causing a problem as any kind of letters taking as invalid.
		String[] split = str.split(" ");//This is splitting the str value into spaces present in str.
		System.out.println(str);//We can see that 'str.split(" ")' is making the user input eg.Girish Haragon & it is taking as Girish only.
		if (str.matches(regex) && str.length()>2) {//Here '&&' denotes 'and' & str.length()>2 specifies the letter in str to be more than 2.. 
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}catch(Exception e) {
		System.out.println("Invalid");
	}
	}
}
