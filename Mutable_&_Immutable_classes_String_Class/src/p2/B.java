package p2;

//Immutable class Object
public final class B {
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		System.out.println(s1==s2);//Object's adresses will get compared and shows o/p as False.
		System.out.println(s1.equals(s2));//True
	}
}