package oops_Concepts_Abstract_class;

abstract class A {
	public void test() {//We can create complete method in an Abstract class
		
	}
	abstract void test1();//Incomplete method in abstract class using abstract keyword..
//  public void test2();//Error occurs for not using abstract keyword.
	public static void main(String[] args) {
		System.out.println("main method");
		A a1;//In abstract classes we cannot create objects but we can create reference variable
	}
}