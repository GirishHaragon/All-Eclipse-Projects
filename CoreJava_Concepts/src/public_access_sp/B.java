package public_access_sp;

public class B {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);
		a1.test();
		System.out.println(a1.x);
	}
}