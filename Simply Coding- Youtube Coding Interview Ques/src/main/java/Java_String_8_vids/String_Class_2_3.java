package Java_String_8_vids;

public class String_Class_2_3 {
	public static void main(String[] args) {
		//String is a Reference data type.
//		Creating a String object.
		String h = new String();//We r using an empty constructor.
		String h1 = new String("Hello");//or we can use constructor which initializes the object with the value provided.
		
		char[] h2 = {'h','e','l','l','o'};
		String h3 = new String(h2);//We r passing the char array into String object's constructor which is getting stored as a Sequence of chars.
		
		String h4 = "Hello";//Without using the constructor we are storing/assigning value in String object.
		
		
//		Why String is Immutable/Constant?
//		Notes is in Notebook.
		String ch = "Hello";
		String ch1 = ch;
		String ch2 = "Hello";
		System.out.println(ch1==ch2);
		System.out.println(ch==ch1);//Both r true bcz all three variables are referring to same object due to it's same content.
		
//		It is critical that if we convert the String using conversion methods and we don't assign it to any local variable.
		String ch4 = "Hello";
		String ch5;
		ch5 = ch4.toUpperCase();
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch4==ch5);//False because both are different object and ch5 is a modified object from ch4.
		
		
//		Short Question on String
		String s1 = "Simply", s2 = "Coding";
		s1.concat(s2);
		System.out.println(s1);//Answer is Simply. Bcz we haven't assigned the value to any variable. So the object address is not assigned. 
		
//		Conversion functions.
//		Converting String to Primitive Data Types. Using valueOf() function.
		int i = Integer.valueOf("34");
		long l = Long.valueOf("34");
		float f = Float.valueOf("3.4");
		double d = Double.valueOf("3.4");
		
//		Not recommended nowadays.
//		Converting String to Primitive Data Types. Using valueOf() function.
		int i1 = Integer.parseInt("34");
		long l1 = Long.parseLong("34");
		float f1 = Float.parseFloat("3.4");
		double d1 = Double.parseDouble("3.4");
		System.out.println(d1);
		System.out.println(f+""+f1);
		
//		Similarly we can convert Primitive Data Type to String. Using valueOf() function.
		String st = String.valueOf("true");//boolean to String
		String st1 = String.valueOf('A');//char to String
		String st2 = String.valueOf(24);//int to String 
		String st3 = String.valueOf(20.2);//float to String
		
		//Table for all basic & important String methods are written in Notebook.
		//There are 4 kinds of methods in String class.
//		1.Check(All returns Boolean value),   
//		2.Position(All methods return int values),
//		3.Manipulate(all methods return String values),   
//		4.Char(only method that is charAt() which returns char value).
		
		
//	1.  Check methods.
		
//	  i.contains() method.   
//		Parameter to pass = String/charSequence   &    Return type = boolean value
//		Example:
		String s = "This is a String";
		boolean b = s.contains("is");
		System.out.println(b);//true
		//Practical Implementation: It helps to Check User entered password and Database present Password.
		
//	 ii.equals() method.
//		Parameter to pass = String/charSequence   &    Return type = boolean value
		String ss1 = "This is a String";
		String ss2 = "This is a string";
		boolean b1 = ss1.equals(ss2);
		System.out.println(b1);//false
		
//	iii.equalsIgnoreCase() method.
//		Parameter to pass = String/charSequence   &    Return type = boolean value
		String s4 = "This is a String";
		String s5 = "This is a string";
		boolean b2 = s5.equalsIgnoreCase(s4);
		System.out.println(b2);//true
		
//   iv.startsWith() method.
//		Parameter to pass = String/charSequence   &    Return Type = boolean value.
		String s6 = "This is a String";
		boolean b3 = s6.startsWith("is");
		System.out.println(b3);//false
		
//	  v.endWith() method.
//		Parameter to pass = String/charSequence   &    Return Type = boolean value.
		String s7 = "This is a String";
		boolean b4 = s7.endsWith("ing");
		System.out.println(b4);//true
		
		
//	2.  Position methods.
		
//	  i.length() method.
//		Parameter to pass = Nothing   &    Return Type = int value.
		String s8 = "HELLO";
		int len = s8.length();
		System.out.println(len);//5
		
//	 ii.indexOf() method.
//		Parameter to pass = String/int/char    &    Return Type = int value.
		String s9 = "This is a String";
		int ii = s9.indexOf("i");
		System.out.println(ii);//2   Gave the index number of the character.
		int ii1 = s9.indexOf("is",3);
		System.out.println(ii1);//5   Gave the index no of the given String starts from, and counting from the index number given in condition.
		
//	iii.lastIndexOf() method.
//		Parameter to pass = String/int/char    &    Return Type = int value.	
		String s10 = "This is a String";
		int i2 = s10.lastIndexOf('i');
		System.out.println(i2);//13   Gave the index of the char i where it is the last occurring char in the String.
		int i3 = s10.lastIndexOf("is", 4);
		System.out.println(i3);//2   Gave the index of String is where the count limits to the specified last index value.
		
//	 iv.compareTo() method.
//		Parameter to pass = String    &    Return Type = int value.			
		String s11 = "This is a String";
		String s12 = "This is a string";
		int i4 = s11.compareTo(s12);
		System.out.println(i4);//-32    Gave -ve value that means the String is lesser than the argument String
		//It gives +ve value if the String is larger than the argument String.
		//It gives 0 value if both the Strings match each other.
		
//	  v.compareToIgnoreCase() method.
//		Parameter to pass = String    &    Return Type = int value.	
		String s22 = "This is a String";
		String s23 = "This is a string";
		int i5 = s22.compareToIgnoreCase(s23);
		System.out.println(i5);//0   Gave 0 cuz both Strings are matching without Case match.
		
//  3.  Manipulating methods.		
//	  i.trim() method.
//		Parameter to pass = Nothing/empty    &    Return Type = String value.
		String s24 = "   HELLO  ";
		s24 = s24.trim();
		System.out.println(s24);//HELLO
		
//	 ii.toLowerCase()/toUpperCase methods.
//		Parameter to pass = Nothing/empty    &    Return Type = String value.		
		String s25 = "This is a String";
		String s26 = s25.toLowerCase();
		String s27 = s25.toUpperCase();
		System.out.println(s25+"\n"+s26+"\n"+s27);
		
//	iii.concat() method.
//		Parameter to pass = String    &    Return Type = String value.
		String s28 = "Simply", s29 = "Coding";
		String concat = s28.concat(s29);
		System.out.println(concat);//SimplyCoding
		
//	 iv.replace() method.
//		Parameter to pass = char, char    &    Return Type = String value.		
		String ss3 = "This is a String";
		String replace = ss3.replace('a', 'k');
		System.out.println(replace);//This is k String
//		or
		String replace2 = ss3.replace("is", "was");
		System.out.println(replace2);//Thwas was a String
//		or
		String replace3 = ss3.replaceFirst("is", "was");
		System.out.println(replace3);//Thwas is a String
		
//	  v.substring() method.
//		Parameter to pass = int, int    &    Return Type = String value.		
		String s30 = "This is a String";
		String substring = s30.substring(5, 7);
		System.out.println(substring);//is
//		or
		String substring1 = s30.substring(6, 8);
		System.out.println(substring1);//s 
//		or
		String substring2 = s30.substring(4, 8);
		System.out.println(substring2);// is 
//		This is typically used to extract individual words out of a String that starts from begin index and ends with end index.
//		or
		String s31 = "This is a String Test";
		String substring3 = s31.substring(10);
		System.out.println(substring3);//String Test
//		In this case the substring() takes only start index and returns the String till the end of the string
		
//	 vi.charAt() method.
//		Parameter to pass = int    &    Return Type = char value.
		String s32 = "HELLO";
		char charAt = s32.charAt(0);
		System.out.println(charAt);//H
//		If we give exceeding index number than the String's last index then it will give StringIndexOutOfBoundsException
//		char charAt1 = s32.charAt(6);
//		System.out.println(charAt1);//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
		
	}
}