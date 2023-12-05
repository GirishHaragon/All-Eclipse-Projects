package finding_indexNo_letter_in_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");//This [abc] here is a Regular Expression.
		Matcher m = p.matcher("a6b#@z9D");//It is the given String, in which the letters of Reg Exp will be searched.
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());//Here 'm.start()' gives us the index no/position of letter 'a' in RegExp and 'm.group()' gives us the alphabet 'a' of [abc] (reg.exp). And for all the letters in the reg exp ([abc]) gives the same, if not present then it ignores. 

		}//It is just searching for the content present in [] (Sq Br) in the given String.
		System.out.println("  ");
		
		Pattern pa = Pattern.compile("[a-z]");//If we want all the lower case letters present in the String we use to write like this
		Matcher ma = pa.matcher("a6b#@z9Dcd7efX");
		while(ma.find()) {
			System.out.println(ma.start()+"...."+ma.group());
		}
		System.out.println("  ");
		
		//If we want only numbers from the String.
		Pattern no = Pattern.compile("[0-9]");
		Matcher mat = no.matcher("a6b#@z9Dcd7efX");
		while(mat.find()) {
			System.out.println(mat.start()+"...."+mat.group());
		}
		System.out.println("  ");
		
		//If we want all Capital letters from String,
		Pattern caps = Pattern.compile("[A-Z]");
		Matcher mcaps = caps.matcher("a6b#@z9Dcd7efX");
		while(mcaps.find()) {
			System.out.println(mcaps.start()+"...."+mcaps.group());
		}
		System.out.println("  ");
		
		//If we want Upper, Lower cases & no's from the String, only except Special chars.
		Pattern ups_lows_nos = Pattern.compile("[A-Za-z0-9]");//Here the o/p's getting mixed
		Matcher m_ups_lows_nos = ups_lows_nos.matcher("a6b#@z9Dcd7efX");
		while(m_ups_lows_nos.find()) {
			System.out.println(m_ups_lows_nos.start()+"...."+m_ups_lows_nos.group());
		}
		System.out.println("  ");
		
		//If we want all other than lower case alphabets from the string,
		Pattern all_except_lowcase = Pattern.compile("[^a-z]");
		Matcher m_all_exc_lowcase = all_except_lowcase.matcher("a6b#@z9Dcd7efX");
		while(m_all_exc_lowcase.find()) {
			System.out.println(m_all_exc_lowcase.start()+"...."+m_all_exc_lowcase.group());
		}
		System.out.println("  ");
		
		//If we want only special chars from the string,
		Pattern only_sp_ch = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m_only_sp_ch = only_sp_ch.matcher("a6b#@z9Dcd7efX");
		while(m_only_sp_ch.find()) {
			System.out.println(m_only_sp_ch.start()+"...."+m_only_sp_ch.group());
		}
		System.out.println("  ");
		
		//So what is the purpose of Sq bracket([])? if we give anything in it, matcher matches with that.
		
		//If we want numbers to be 10digit or take only 9digits from the given number of String, then we change the number in flower bracket accordingly.
		Pattern num = Pattern.compile("[0-9]{9}");
		Matcher m_num = num.matcher("9632882052");
		while(m_num.find()) {
			System.out.println(m_num.start()+"...."+m_num.group());
		}
		System.out.println("  ");
		
		//if we write 5 in {} then the string gets a group of 5 digits in index no.
		Pattern num5 = Pattern.compile("[0-9]{5}");
		Matcher m_num5 = num5.matcher("9632882052");
		while(m_num5.find()) {
			System.out.println(m_num5.start()+"...."+m_num5.group());
		}
		System.out.println("  ");
	}
}
