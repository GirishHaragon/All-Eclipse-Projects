package oops_Concepts_Abstract_class;

public abstract class Parent {
	public Parent() {
		System.out.println("Parent object's Constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract void greet();//Now if we create 1 abstract method in a class then the whole class will become abstract class. This is an incomplete method, so we can inherit & implement any thing in this method we want in sub/child class.
}