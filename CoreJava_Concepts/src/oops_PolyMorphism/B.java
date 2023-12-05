package oops_PolyMorphism;

public class B extends A{
	
	@Override//This method is considered to be a method of class B until and unless we write Override annotation over it.
	public void test() {
		System.out.println("This is the modified/overridden method of class A according to the requirement of class B");
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();//This is Overridden method.
		
		A a1 = new A();
		a1.test();//We call this as Overriding method.
	}
}