package Coding_with_Letters_String;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Printing number of words, vowels and frequency of each characters in a given String "String s = "Learn With Krishna Sandeep".
public class StringCount_Words_vowels_frequency {
	public static void main(String[] args) {
		//Firstly we do Words count.
		//logic => wordCount = 0; initialize a non static variable
		//After this we will iterate through the String and increase the wordCount by 1 every time after getting each space or '.'
		//And lastly print the wordCount.
		String str = "Learn With Krishna Sandeep.";
		StringCount_Words_vowels_frequency p = new StringCount_Words_vowels_frequency();//Object created.
		p.getWordVowelCount(str);//We will build the method. Which prints Wordcount, vowelCount & Upper Chars.
		p.frequency(str);
		
		//Secondly vowelCount we do.
		//logic => vowelCount = 0; initialize a non static variable.
		//And iterate through the string and check for vowels(Upper/Lower cases), everytime we get vowels, we increase the variable count.
		//And lastly we print the vowelCount.
		//For this we do one switch case where we put all the letters of vowels both Upper/lowers.
		
		
		//Thirdly we count the Upper case Characters.
		//Logic => We will iterate through each character and will check whether the ASCII character is between >=65 and <=90 (A to Z)
		//Variable upperCaseCount = 0;
		
		
		
		
		//Fourthly we print the frequency of occurrence of each chars.
		//Logic => We use HashMap and set the values as the String chars in the hashmap then values as their counts/occurrences.  
		
		
		
		
		
	}

	private void getWordVowelCount(String str) {
		int wordCount = 0;
		int vowelCount = 0;
		int upperCaseCount = 0;
		
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);//We r extracting each chars from String into c.
			
			switch(c) {//This is a switch case we can provide.
				case ' ':
				case '.':
				wordCount++;
			}
			
			switch(c) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					
				vowelCount++;
			}
			
			if(c>=65 && c<=90) {
				upperCaseCount++;
			}
			
		}
		System.out.println("WordCount "+wordCount);
		System.out.println("VowelCount "+vowelCount);
		System.out.println("UpperCaseCount "+upperCaseCount);
	}
	
	private void frequency(String str) {
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<str.length(); i++) {//Here we extract each character from str and put it in TreeMap.
			Integer c = map.get(str.charAt(i));//Here we will get the String characters into map (TreeMap) and store the returns by checking the element if present 
			
			if(map.get(str.charAt(i))==null) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), ++c);
			}
			
		}
		for ( Map.Entry entry : map.entrySet()) {
			System.out.println("Character = "+entry.getKey());
			System.out.println("Frequency = "+entry.getValue());
		}
	}
}
