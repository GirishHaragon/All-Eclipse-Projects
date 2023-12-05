package Coding_with_Letters_String;

public class StringClassBuiltinMethods {
	public static void main(String[] args) {
//		String str = new String("Pankaj SiR AcAdeMy");
//		System.out.println(str.toLowerCase());//All letters of a String to Lower case
//		System.out.println(str.toUpperCase());//All letters of a String to Uppercase
		
//		String stri = new String(" Pankaj SiR AcAdeMy ");//We r keeping white spaces here.
//		System.out.println(stri);
//		System.out.println(stri.trim());
		
//		String str = new String("aabaaabaaaabaz");
//		System.out.println(str.startsWith("a"));//This gives true if the string starts with letter a.
//		System.out.println(str.endsWith("z"));//This gives true if the string ends with letter z.
//		System.out.println(str.startsWith("x"));
//		System.out.println(str.endsWith("x"));
		
//		String str = new String("12345678");
//		System.out.println(str.length());//The return type of length is integer value not a long value.
		
//		int i = 10;
//		String str = String.valueOf(i);//This 'valueOf' is ideally a static method present in the String class.
				//Thta's the reason we r accessing it with a class name.
				//So valueOf() will convert the integer 10 to a String.
				//So we were already learnt coverting String integer or any value to any DT,
					//by using 'Integer.parseInt'
				//So now we've learnt how to convert Integer to String value.
//		System.out.println(str);
//		double i = 10.3;
//		String str = String.valueOf(i);//By this we r converting double to String type/value.
				//So valueOf() method works for all primitive DTs.
//		System.out.println(str);
//		char i = 'a';
//		String str = String.valueOf(i);
//		System.out.println(str);
		
//		boolean i = true;
//		String str = String.valueOf(i);//There r no errors we can see. So it's perfectly working.
//		System.out.println(str);
		
		//So valueOf() what this method does is,,
			//It converts given type such as int, long, float, double, boolean & char array to String.
		
		char[] i = {'a','b','c'};
		System.out.println(i[0]);
		String str = String.valueOf(i);
		System.out.println(str);
//		System.out.println(str[0]);//We cannot use the same like we use with char value bcz it is converted into String.
		//So this valueOf() is very important when we need value of any DT in String type.
	}
}