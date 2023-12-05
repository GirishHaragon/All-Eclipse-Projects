package Java_String_8_vids;

public class Solve_any_String_5_Char_countings {
	public static void main(String[] args) {
//		Character Manipulation code
//		Breaking String into Characters type
		
//		Q1.Count the number of Vowels in a Sentence/String. Or Program to count vowels
		String s = "Thi1s is3 A 1String";
		
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			c = Character.toLowerCase(c);
//			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
//				count++;
//		}
//		System.out.println("Total count of vowels is: "+ count);
		
		
//		Same program can be used to count the White spaces or any digits in a String
//		Counting the no of Whitespaces in a given string
//		int count1 = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (c == ' ') {//Or we can also use condition like if (Character.isWhitespace(c)){ } 
//				count1++;
//			}
//		}
//		System.out.println("Total White spaces in the String: "+count1);
		
//		Counting the digits in the String
//		int count2 = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (Character.isDigit(c)) {
//				System.out.println(c);
//				count2++;
//			}
//		}
//		System.out.println("Total Number of Digits in the String is: "+ count2);
		

//		Counting A & B in a given String
//		String s1 = "Ascending order starts from Top to Bottom, Be Assertive always";
//		int countA = 0, countB = 0;
//		
//		for (int i = 0; i < s1.length(); i++) {
//			char c = s1.charAt(i);
//			boolean c = Character.isUpperCase(c);
//			c = Character.toUpperCase(c);
//			if(c == 'A')
//				countA++;
//			else if(c == 'B')
//				countB++;
//			else {
//				
//			}
//		}
//		System.out.println("Total no of A Characters are: "+countA);
//		System.out.println("Total no of B Characters are: "+countB);
//		System.out.println(countA);
		
		
//		Swapping the case of characters in String s.
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c))
				s2 += Character.toLowerCase(c);
			else if (Character.isLowerCase(c))
				s2 += Character.toUpperCase(c);
			else {
				s2 += c;
			}
		}
		System.out.println(s2);
	}
}