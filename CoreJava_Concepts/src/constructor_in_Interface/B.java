package constructor_in_Interface;

public class B implements A{//Here we cannot use extends keyword.
	
	public B() {
		A.super.A();//We can access constructor of an Interface by super 
			//keyword not by creating object of interface which is impossible.
	}
	
	public static void main(String[] args) {
//		A a1 = new A();//We cannot create object of Interface
		A a1 = new B();//Instead we can create object of class B and assign it to a
				//variable of type A interface..
		B b1 = new B();
		new B();//We can create object like this too...
	}
}