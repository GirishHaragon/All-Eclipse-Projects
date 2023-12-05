package constructor_in_Interface;

public interface A {
	//Default constructor
	public default void A() {//If removed default keyword then Constructor implementation can't happen. 
			//Shows error. public keyword makes no sense in writing it..
		//Constructor logic goes here..
		System.out.println(100);
	}
	public static void main(String[] args) {
		//A a1 = new A();//We cannot create object of an Interface.
		//We can create object of class B that implements this interface A..
		B a2 = new B();
	}
}