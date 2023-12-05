package p4;

public class A {
	public static void main(String[] args) {
		String s1 = new String("xyz");//Whenever new keyword is used new object gets created that rule cannot change in any case.
		String s2 = "xyz";
		//In this case, s2 will not refer to the object s1. 
		//It just creates a new object bcz both are following different syntax to create object.
		String s3 = "xyz"; //This will refer to the object s2. Bcz it has the same syntax. 
							//Also bcz already object with same value is created once.
		String s4 = new String("xyz");//This again creates a new object and doesn't refer to any of the above objects.
	}
}
//s1==s4       =>
//s2==s1       =>
//s2==s3       =>
//s1.equals(s2,s3,s4)  =>