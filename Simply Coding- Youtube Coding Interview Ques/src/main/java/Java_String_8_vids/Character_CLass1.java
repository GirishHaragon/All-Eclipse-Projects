package Java_String_8_vids;

public class Character_CLass1 {
	public static void main(String[] args) {
		//Ways to declare a Character using char datatype
		char ch;//Just declaration.
		char ch1 = 'a';
		char ch2 = '8';
		char ch3 = '\n';//Escape Sequence..   But this is giving 2 new lines.. Bcz of 'println'
		char ch4 = (char)65;//Type casted integer to char.
		System.out.println(ch2);
		System.out.println(ch4);
		System.out.print(ch3);//Here gives only 1 new line as reqd.
		//ASCII Charaters..
		//java uses Unicode Character set. It utilizes 16bit from 0 to 65536(2^16) & defines fully international character set representing almost all languages.
		//Unicode 0-127 is equal to ASCII 0-127 for backward compatibility.
		//ASCII codes for english alphabets and digits.
		//Characters     ASCII codes
		//  0-9            48 - 57
		//  A-Z            65 - 90
		//  a-z            97 - 122
		
		//Conversions questions.
		//For getting ASCII code for a Letter can found as
		char c = 'A';
		int i = (int) c;
		System.out.println(i);//65 is the ASCII code for A.
		
		//For converting ASCII code to char value.
		int n = 97;
		char h = (char)n;
		System.out.println(h);
		
		//For converting Upper case to Lower case & inverse.
		char a = 'A';
		a += 32;
		System.out.println(a);//'A' => 65 + 32 = 97 => 'a'
		
		//For lower to upper.
		char b = 'b';
		b -= 32;
		System.out.println(b);
		
		//We can use char as integer datatype to print other value based on ASCII code. (Arithmetic Operation).
		char ac = 'A';
		ac++;//used as increment operator to display next character.
		System.out.println(ac);
		
		
		//Escape Sequences. 
		//Also known as Character literal.
		//It holds a special meaning to the compiler.
		//It could be used as non printable characters.
		//For example : \t		tab
		//				\b		backspace
		//				\n		newline
		//				\r		carriage return
		//				\f		form feed
		//				\'		single quote character
		//				\"		double quote character
		//				\\		backslash character.
		
		//Character class is a part of Wrapper classes in java.lang package.
		//Wrapper class.
		//It wraps around primitive data types.
		
		//To create an object of type Character we can use any of follwing
		Character cha = new Character('a');//Using new keyword.
		Character cha1 = Character.valueOf('a');//Using valueOf() method.
		Character cha2 = 'a';//Using Autobox feature, without constructor.
		//It has few static methods.
		
		//Character methods...
		//isLetter()   Return type=boolean     Parameter = char
		System.out.println(Character.isLetter('C'));//true
		System.out.println(Character.isLetter('5'));//false
		System.out.println(Character.isLetter((char)65));//true   Type-Casted Unicode number.
		System.out.println(Character.isLetter('\n'));//false
		
		//isDigit()   Return type=boolean     Parameter = char
		System.out.println(Character.isDigit('c'));//false
		System.out.println(Character.isDigit('5'));//true
		System.out.println(Character.isDigit((char)49));//true   Type-Casted Unicode number.
		System.out.println(Character.isDigit('\t'));//false
		
		//isLowerCase() or isUpperCase()     Returntype = boolean     Parameter = char
		System.out.println(Character.isLowerCase('c'));//true
		System.out.println(Character.isLowerCase('C'));//false
		System.out.println(Character.isUpperCase('c'));//false
		System.out.println(Character.isUpperCase('C'));//true
		
		//isWhiteSpace()    Return type=boolean   Parameter = char
		System.out.println(Character.isWhitespace('c'));//false
		System.out.println(Character.isWhitespace(' '));//true
		System.out.println(Character.isWhitespace('\n'));//true
		System.out.println(Character.isWhitespace('\t'));//true
		
		System.out.println("Twelve" + '\n' + "Hi The above data is a number");
		
		//toUpperCase() or toLowerCase()    Return type = char    parameter = char
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase((char)97));
		System.out.println(Character.toUpperCase((char)98));
		System.out.println(Character.toLowerCase('A'));
		
		//Character class also has toString() method.  Return type = String    Parameter = char.
		String str = Character.toString('A');
		System.out.println(str);
//		String str1 = Character.toString('A','B');//It doesn't take more than 1 char
		
		
//		Questions that can be asked on Character Class as
//	1)  ReturnTypes
//	1.	What is the return type of the given code..
//		isLetterOrDigit('7');   //Answer is boolean
//		toUpperCase('c');   //Answer is char
//		isWhitespace('\n');    //Answer is boolean
		
//	2.  What is the DataType of x & y.
//		DATATYPE   x1='7';   //Answer is char
//		DATATYPE   y =Character.isLetter(x);    //Answer is boolean
		
//		All Character class methods are listed as table in Notebook.
		
//	2)  Write a code segment.
//	1.  Write a statement to determine 
//		If Character ch is in Uppercase  -  Answer is Charactr.isUpperCase(ch);
//		If Character ch is a digit       -  Answer is Character.isDigit(ch);
		
//	3)  Write the output of following
		System.out.println(Character.isUpperCase('S'));//Answer is true 
		System.out.println(Character.isWhitespace('\n'));// Answer is true.
		
//	4)  State the output of the following
//		char x = 'A';
//		x += 32;
//		char y = x;
//		y += 2;
//		System.out.println(x);//Answer is 'a'
//		System.out.println(y);//Answer is 'c'
		
//		Done with Character class video with Simply Coding
	}
}
