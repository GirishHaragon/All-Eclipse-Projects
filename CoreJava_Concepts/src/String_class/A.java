package String_class;

//How to convert String value to Integer, Float, Double etc.
public class A {
	public static void main(String[] args) {
		try {
			String str = "100";// We have a integer value in form of String class.
//			int x = str;//Error. We cannot write this to convert String to integer.
//			int x = (int)str;//Error. We cannot do type-casting also because String is a class & int is a Data type.
			// In assignment videos sir has covered type-casting from Int to Float when both
			// are Data Types. But the problem here is String is not a Primitive Data Type.
			// So that's where we use the concept Wrapper class.

			// Wrapper classes
			int x = Integer.parseInt(str);// So by this using Wrapper class Integer we converted String 100 to Integer.
			System.out.println(x);//100 value.

//			String stri = "mike";// We convert String value into Integer Data type by same method.
//			int y = Integer.parseInt(stri);// This gives NumberFormatException.
		
//			//When do we get NumberFormatException? => When we give invalid String to Number conversion being done..
//		//Removing double quotes from the String value, when we get a number then such conversions are valid & will work.
//			String strin = "1344mike";//If we give AlphaNumericvalue then it crashes bcs such conversions are In-valid.
//		
		//Size of String is Dynamic. Not like other primitive Data types. Bcs Data types have barrier to store values in
			//them but String is a Class & it has no limit. 
//		
//		//NumberFormatException - When an Invalid Conversion from String to Number is done, we get NumberFormatException..
//		
			String st = "10.3";//To convert this String value to FLoat we have built-in class Float.
			float c = Float.parseFloat(st);//There will be no exception for this.
			System.out.println(c);
//		
//			//We can store same float value using DT
		float f = 10.3f;//float here is DT. And we can not manipulate the value from a DT, bcs DT has no built in classes.
		Float F = 10.3f;//Float here is a Wrapper class. Advantage of the WC is it has lot of Built in methods/functionality
			//present in it. So we can easily manipulate the value in Float WC (Wrapper Class).
			System.out.println(F.longValue());//So this method automatically converted Float value to Long value (10). 
				//How we could convert is bcs its a class. Here we have not done Type casting but just used a method to 
				//convert the value type.
//			//For every Datatype we have Wrapper class. If we store value in a wrapper class we can take the advantages 
				//of Built-in methods.
			
//			//Like that if we convert String "100" to byte it gives Exception bcs decimal value will be lost.
			String s = "100.3";
			byte b = Byte.parseByte(s);
			System.out.println(b);//Thus gives us NoFmtException bcs there is loss in value (decimal).
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
