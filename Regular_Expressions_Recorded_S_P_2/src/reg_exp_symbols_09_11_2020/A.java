package reg_exp_symbols_09_11_2020;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {//These are called as Wild cards in Regular expressions.
//		Pattern p = Pattern.compile("a*");//a* means the output will be group of a letters, and it is also giving indexes where there are no a letters (0 occurances of letter a)
//		Matcher m = p.matcher("aabaaababaaaab");
//		
//		while(m.find()) {
//			System.out.println(m.start()+"...."+m.group());
//		}
		
		
//		Pattern p = Pattern.compile("a+");//a+ means the output will be group of a letters. And no non occurances are being given here. And it is giving indexes where at-least one/more occurances of letter a.
//		Matcher m = p.matcher("aabaaababaaaab");
//		
//		while(m.find()) {
//			System.out.println(m.start()+"...."+m.group());
//		}
		
		
		Pattern p = Pattern.compile("a?");//a+ means the output will be group of a letters. And no non occurances are being given here. And it is giving indexes where at-least one/more occurances of letter a.
		Matcher m = p.matcher("aabaaababaaaab");
		
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());
		}
	}
}