package hashcode_09_11_2020;

public class A {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);//The object address being printed is not in Integer representation, but in Hexadecimal value.
		System.out.println(a1.hashCode());//To get the object address in Integer representation of memory address.
	}
}
