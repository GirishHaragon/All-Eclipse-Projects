package examples;

public class A {
	public static void main(String[] args) {
		Integer i = 10;//It makes no difference storing data in data type 'int i =10;'  or 'Integer' except one Major difference. That is it has lot of classes in it.
		System.out.println(Integer.MAX_VALUE);//There r lot of members we can see in it. Let's say we want to know what is the maximum value of integer we can store in it? So in MAX_VALUE there is a static & final variable, whenever we create static & final we use the convention, everything to be in capital letter & if there are 2 words, we seperate them with underscore. If we type 'i.MAX_VALUE' it shows warning as we r accessing a static in a non static way. Actually we r supposed to access with 'Integer.MAX_VALUE'
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(i.longValue());//Here we don't do type-casting to convert Integer to long, instead use this method longValue() to convert to DataType long automatically for this line only.
		System.out.println(i.hashCode());//Converted long to HashCode in this line.
		System.out.println(i.SIZE);//To Know the size of our int value which is another built-in function. what is the size of int? -> 4Bytes  (1Byte = 8bits, 8bits*4=32bits).
		System.out.println(i.toString());//It's converting the integer to String value.
		System.out.println(i.doubleValue());//Converted from Integer to double value (10.0).
		//All of these extra functionalities we are getting with wrapper class.
		System.out.println(i.byteValue());//Converted Integer to byte Data type.
		//Whether it is Up-casting / Down-Casting we are able to do both out here.
		//What is Wrapper Class? -> A Wrapper class has lot of built in methods, variables that helps us to manipulate the data easily.
		//We will be using this in Adv Prog, not much but toString() we may use much for converting integer to string, Integer.parseInt also comes in wrapper class.
	}
}