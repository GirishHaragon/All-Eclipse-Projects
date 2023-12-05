package Java_String_8_vids;

public class Z {
	public static void main(String[] args) {
//	Q1. Print each character of the String in separate line.
		String s = "ITS SIMPLE1";
		String st = "Its Sim12ple121";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c+" : "+(int)c);
		}
		
//	Q2. Print only Uppercase characters of the String.
		for (int i = 0; i < st.length();i++) {
			char c = st.charAt(i);
			if(Character.isUpperCase(c))
				System.out.println(c);//IS
		}
	
//	Q3. Print only Lowercase characters of the String.
		for (int i = 0; i < st.length();i++) {
			char c = st.charAt(i);
			if(Character.isLowerCase(c))
				System.out.println(c);//tsimple
		}
		
//	Q4. Print only Digit characters of the String.
		for (int i = 0; i < st.length();i++) {
			char c = st.charAt(i);
			if(Character.isDigit(c))
				System.out.println(c);//1
		}
		
//	Q5. Print without spaces from the String.
		for (int i = 0; i < st.length();i++) {
			char c = st.charAt(i);
			if(!Character.isWhitespace(c))
				System.out.print(c);//ItsSimple1
		}
		
//	Q6. Count the Uppercases from the String.
		int count = 0;
		
		for (int i = 0; i<st.length(); i++) {
			char c = st.charAt(i);
			if(Character.isUpperCase(c))
				count++;
		}
		System.out.println('\n'+"Count of Uppercases are: "+count);
		
//	Q7. Count the Lowercases from the String.
		int countL = 0;
		
		for (int i = 0; i<st.length(); i++) {
			char c = st.charAt(i);
			if(Character.isLowerCase(c))
				countL++;
		}
		System.out.println("Count of Lowercases are: "+count);
		
//	Or
		int countLower = 0, countUpper = 0;
		
		for (int i = 0; i<st.length(); i++) {
			char c = st.charAt(i);
			if(Character.isLowerCase(c))
				countLower++;
			if(Character.isUpperCase(c))
				countUpper++;
		}
		System.out.println("Count of Lowercases are: "+countLower);
		System.out.println("Count of Uppercases are: "+countUpper);
		
//	Q7. Count the Lowercases from the String.
		int countDigits = 0;
		for (int i = 0; i<st.length(); i++) {
			char c = st.charAt(i);
			if(Character.isDigit(c))
				countDigits++;
		}
		System.out.println("Count of Digits are: "+countDigits);
	}
}
