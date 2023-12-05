package cloning_09_11_2020;

import java.util.Scanner;

public class Reverse_the_String {
	public static void main(String[] args) {
		System.out.println("Enter the String to reverse");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
