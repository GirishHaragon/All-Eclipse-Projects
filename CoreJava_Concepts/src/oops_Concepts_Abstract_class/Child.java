package oops_Concepts_Abstract_class;

public class Child extends Parent {
	public static void main(String[] args) {
		Child c = new Child();
		c.greet();
		c.greet1();
	}
	@Override
	void greet() {
		System.out.println("Good Morning");
	}
	void greet1() {
		System.out.println("this has no deal with Pearent Abstract class");
	}
}