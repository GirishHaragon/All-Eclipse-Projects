package oops_Concepts_Abstract_class;

public class Child2 extends Parent{
	public static void main(String[] args) {
		Child c = new  Child();
		c.greet();
		Child2 c2 = new Child2();
		c2.greet();
	}

	@Override
	void greet() {
		System.out.println("We implemented greet() method as Child2 class requirement");
	}

}
