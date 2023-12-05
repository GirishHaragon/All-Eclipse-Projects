package array_concept;

public class B {
	public static void main(String[] args) {
		int[] age = new int[2];
		System.out.println(age[0]);
		System.out.println(age[1]);
//		System.out.println(age[2]);	//This throws ArrayOutOfBoundException.
		
		String[] name = new String[2];
		name[0] = "mike";
		name[1] = "Stallin";
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		char[] chars = new char[2];
		chars[0] = 'a';
		chars[1] = 'b';
//		chars[2] = 'c'; //This throws ArrayOutOfBoundException.
		System.out.println(chars[0]);
		System.out.println(chars[1]);
//		System.out.println(chars[2]);
		
		float[] x = new float[50];
		x[0] = 10.3f;
		x[1] = 10.4f;
		x[2] = 10.3f;
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}