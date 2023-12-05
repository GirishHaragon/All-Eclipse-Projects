package reg_exp_characters_06_11_2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\s");//One imp thing in JAVA, whenever we r giving a path, we cannot use a single slash. Single back slash has a very special meaning in JAVA (like /n for new line, /t also has a meaning).We cannot use a back single slash in Java whenever we r giving path or anything. So to find white spaces in the given string we use \\s.
//		Matcher m = p.matcher("a6b @#9 D E!");//Here we have purposefully written space.
//		while (m.find()) {
//			System.out.println(m.start()+"...."+m.group());
//		}
//		System.out.println(" ");
//		
//		//Now \\S will give exactly opposite of small '\\s', means it gives all the others except white spaces.
//		Pattern pa = Pattern.compile("\\S");//If small letter gives us something then in place of it capital letter if we use then it gives exactly opposite of small letter, in Special char of Reg Exp.
//		Matcher ma = pa.matcher("a6b @#9 D E!");
//		while (ma.find()) {
//			System.out.println(ma.start()+"...."+ma.group());
//		}
//		System.out.println(" ");
//		
//		//In previous, we used [0-9] to get the digits from the given string, but we can use the special character instead of the previous method for getting digits.
//		Pattern pd = Pattern.compile("\\d");
//		Matcher md = pd.matcher("a6b @#9 D E!");
//		while (md.find()) {
//			System.out.println(md.start()+"...."+md.group());
//		}
//		System.out.println(" ");
//		
//		//Now what if we need everything but not digits, then we go for \\D, which gives us everything except digits even gives spaces.
//		Pattern pAo = Pattern.compile("\\D");
//		Matcher mAo = pAo.matcher("a6b @#9 D E!");
//		while (mAo.find()) {
//			System.out.println(mAo.start()+"...."+mAo.group());
//		}
//		System.out.println(" ");
//		
//		//What '\\w' gives is lower case letters, upper case letters & numbers from the given string. And not any other than that like in our case Special cha, white spaces.
//		Pattern pLUN = Pattern.compile("\\w");
//		Matcher mLUN = pLUN.matcher("a6b @#9 D E!");
//		while (mLUN.find()) {
//			System.out.println(mLUN.start()+"...."+mLUN.group());
//		}
//		System.out.println(" ");
//		
//		//If we want opposite of \\w then we use \\W to get everything other than lower case letter, upper case letter & numbers from the given string.
//		Pattern pA = Pattern.compile("\\W");
//		Matcher mA = pA.matcher("a6b @#9 D E!");
//		while (mA.find()) {
//			System.out.println(mA.start()+"...."+mA.group());
//		}
//		System.out.println(" ");
//		
//		//So these will all help us to do Validation.. If a given string should not have a space, special chars, etc...
//		int count = 0;
//		Pattern pp = Pattern.compile("\\s");
//		Matcher mm = pp.matcher("a6b@#9DE!");//If we kept spaces in this String then we get Error in return and if remove spaces then gives Input Accepted.
//		while (mm.find()) {
//			count++;
//		}
//		if(count!=0) {
//			System.out.println("Error");
//		}else {
//			System.out.println("Input Accepted");
//		}//By this code we can develop a string that returns error if spaces used in the String, And if no spaces then returns Input Accepted.
//		
//		//If we don't want Sp chars in our String, then we can simply change the above '\\s' to '\\W'. That's It...
//		
//		//Now if we don't want anything other than a-z & A-Z, then we go for little forward & use Scanner class. And understand this with real example,,
//		//A NAME Validator code developed using Regular Expression..
//		System.out.println("Enter Your Name");
//		Scanner s = new Scanner(System.in);
//		String str = s.next();//We will directly give the user input (Username) into String value.
//		int counts = 0;
//		Pattern pazAZ = Pattern.compile("[^a-zA-Z]");//Here we r firstly checking is there any unwanted things entered, if yes then it will give error. But this is ignoring spaces. 
//		Matcher mazAZ = pazAZ.matcher(str);
//		while (mazAZ.find()) {
//			counts++;
//		}//This block continuously checks all the chars for unwanted chars, & and for every unwanted char it increases the value of variable(counts) with 1
//		if(counts!=0 || str.length()<3) {//It checks if the value of variable is not equals to 0 then if block runs & shows error
//			System.out.println("Error");
//		}else { //If value of variable is equals to 0 then it shows Input Accepted message.
//			System.out.println("Input Accepted");
//		}//So we have also implemented the requirement of name not less than 3 characters by simply applying '|| str.length()<3' in the if block condition.. ('||' denotes 'or' and we shouldn't use '&&' which means 'and')
//		
//		//A Mobile No validator code developed using Reg Exp..
//		System.out.println("Enter Your Mobile No-1");
//		Scanner sc = new Scanner(System.in);
//		String mob_no = sc.next();//We will directly give the user input (Mob No) into Long value. But the problem is matcher takes only the String Datatype, it doesn't take long as an input. Therefore we leave String as it is.
//		int counting = 0;
//		Pattern pMN = Pattern.compile("[6-9][0-9]{9}");//Here we r checking is there the mob no to be starting with 6,7,8,9 (by [6-9]) and the numbers excepting 0 to 9 (by [0-9]), then we take only 10 digits (by {9} where 1 digit will be picked by [6-9] & remaining 9 digits by[0-9]).  
//		Matcher mMN = pMN.matcher(str);
//		while (mMN.find()) {
//			counts++;
//		}//This block continuously checks all the chars for unwanted chars, & and for every unwanted char it increases the value of variable(counts) with 1
//		if(counting!=0) {//It checks if the value of variable is not equals to 0 then if block runs & shows error
//			System.out.println("Error");
//		}else { //If value of variable is equals to 0 then it shows Input Accepted message.
//			System.out.println("Input Accepted");
//		}//We r leaving it here only without properly implementing.
//		//There r 2 ways we can implement the Regular Expressions (RegEx), which are 1.the above type of approach. & 2.The kind of approach explained in class B where we solved the Mobile number validator code more easily with less no of lines.
//		
//		//Sir solved the code, for Mobile Validation..
		try{
			System.out.println("Enter Your Mobile No-2");
			Scanner s = new Scanner(System.in);
			Long m = s.nextLong();//We will directly give the user input (Mob No) into Long value. But the problem is matcher takes only the String Datatype, it doesn't take long as an input. Therefore we leave String as it is.
			String st = m.toString();
			System.out.println(st);//This is to Make sure that the input entered by the user is being read correctly by the code(toString()) or not. 
			int count = 0;
			Pattern p = Pattern.compile("[0-5][0-9]{9}");//Here we r checking is there the mob no to be starting with 6,7,8,9 (by [6-9]) and the numbers excepting 0 to 9 (by [0-9]), then we take only 10 digits (by {9} where 1 digit will be picked by [6-9] & remaining 9 digits by[0-9]).  
			Matcher mMo = p.matcher(st);//Instead of the above regex we can try with this too "^[0-5]\\d{9}$" works the same.
			while (mMo.find()) {
				count++;
			}//This block continuously checks all the chars for unwanted chars, & and for every unwanted char it increases the value of variable(counts) with 1
			if(count!=0 || st.length()<10) {//It checks if the value of variable is not equals to 0 then if block runs & shows error
				System.out.println("Error");
			}else if(st.length()==10){ //If value of variable is equals to 0 then it shows Input Accepted message.
				System.out.println("Input Accepted");
			}
			
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input");
		}
	}
}