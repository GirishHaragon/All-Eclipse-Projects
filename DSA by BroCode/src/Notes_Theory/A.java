package Notes_Theory;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		String input = "Hello World!!";
		String inputStr = input.toLowerCase();
		
		HashMap<Integer, Character> hashMap = new HashMap<>();
		
		for (int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				System.out.println(i+ " -> " + c);
			}	
		}		
	}
	
}