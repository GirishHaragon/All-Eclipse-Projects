package p2;

public class C {
	public static void main(String[] args) {
		String s1 = "Pankaj";
		String s2 = "Pankaj";//We are not writing new keyword here. So String will search for objects 
					//whether already same value is stored. If yes then the reference of the object will 
					//be given to s2. So new objects will not be created. Refer a.
		System.out.println(s1==s2);//Object adresses are compared here.
		System.out.println(s1.equals(s2));//Object Values are compared here.
		
		String s3 = "xyz";
		String s4 = "xyz";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}//So in this class 2 objects are created and reference of those objects are given to 2, 2 variables.
}
//s1==s2         =>
//s3==s4         =>
//s1.equals(s2)  =>
//s3.equals(s4)  =>