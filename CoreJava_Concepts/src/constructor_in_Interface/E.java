package constructor_in_Interface;

public class E extends D{
	private static int value;
	public E() {//Constructor for the object created.
	}
	public E(int value) {
		super(value);
	}//When inheriting with Abstract class to Class we use extends Keyword.
	
	public static void main(String[] args) {
		E e1 = new E();//This object was giving error because i had not created similar constructor
		  //in Abstract class. //That means we have to create constructor of the object in this class
		  //and also similar constructor present in Parent Abstract class. Or else Error occurs.
	}
	@Override
	public void anyValue() {
		System.out.println(10);
	}
}