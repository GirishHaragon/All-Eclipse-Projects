package tokenizer_09_11_2020;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {//We have a built-in method called StringTokenizer.
	public static void main(String[] args) {
//		int count = 0;
//		StringTokenizer str = new StringTokenizer("Pankaj Sir Academy Bangalore");//During String Classes we were getting question like "Count the number of words given in a given String"
//		System.out.println(str);//This is giving us the memory address. And it's not giving us the String out here.
//		while (str.hasMoreTokens()) {//Tokens here are the words. First the 'str.hasMoreTokens()' checks, after splitting the String what words we get the Tokens. Now first 'str.hasMoreTokens()' checks is there a word in the String, if yes then it returns True, after it is true 'str.nextToken()' reads & prints the token. Again the loop continues, & checks are there more words in the String, if true again enter, read & prints the word. 
//			System.out.println(str.nextToken());
//			count++;
//		}
//		System.out.println(count++);//By this we r getting the number of count of words in the given String.
		
		
		//Manytimes we might have a requirement of splitting the date and have only the year.
//		int count = 0;
//		StringTokenizer str = new StringTokenizer("12-12-2020","-");//Here we don't have spaces in String, and we need to split the string by Hyphens(-). In such cases we use De-limiter, which means based on what you want to split the given String, & that will give us the Tokens. Which is achieved by mentioning (,"-")
//		//System.out.println(str);//This is giving us the memory address. And it's not giving us the String out here.
//		while (str.hasMoreTokens()) {//Tokens here are the words. First the 'str.hasMoreTokens()' checks, after splitting the String what words we get the Tokens. Now first 'str.hasMoreTokens()' checks is there a word in the String, if yes then it returns True, after it is true 'str.nextToken()' reads & prints the token. Again the loop continues, & checks are there more words in the String, if true again enter, read & prints the word. 
//			System.out.println(str.nextToken());
//			count++;
//		}
//		System.out.println(count++);
		
		
		//Split a given String using Regular Expression..
		Pattern p = Pattern.compile("\\s+");
		String[] s = p.split("Pankaj Sir Academy");
		//System.out.println(str);
		
		for (String word : s ) {
			System.out.println(word);
		}//Here while loop doesn't work like this,,

		//It needs iterator (i++) & little extra things and it's little prone to error occurring.
		int i = 0;
		while (i < s.length) {
		    System.out.println(s[i]);//This works the same as for loops version.
		    i++;
		}
	}
}