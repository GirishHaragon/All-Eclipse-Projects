package Coding_with_Letters_String;

//Reverse a Given String.
public class ReverseGivenString {
	public static void main(String[] args) {
		String str = "pankaj sir academy";
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}