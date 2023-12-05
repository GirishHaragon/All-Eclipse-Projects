package Abc;

import java.util.Arrays;
import java.util.List;

public class A {
	public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       int sumOfEvens = numbers.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();

       System.out.println("Sum of even numbers: " + sumOfEvens);
		
		//Reverse a String
	       String original = "Hello, World!";
	
	       String reversed = reverseString(original);
	
	       System.out.println("Original: " + original);
	
	       System.out.println("Reversed: " + reversed);

	}
	
	public static String reverseString(String str) {
		 int length = str.length();
		 StringBuilder reversed = new StringBuilder();
		   
		 for(int i = length - 1; i >= 0; i--) {
			   reversed.append(str.charAt(i));
		 }
		 return reversed.toString();
	}
}
