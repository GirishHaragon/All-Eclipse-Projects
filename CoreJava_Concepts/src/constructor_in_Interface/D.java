package constructor_in_Interface;

abstract class D {
	int value;
	
	public D() {//After creating this empty body constructor only, i am able to create an object of
		//class E and its constructor is being free from showing error.
	}

	public D(int value) {//Constructor of Abstract class.
		this.value = value;
	}

	public int getValue() {//Complete method in abstract class not mandatory to create.
		return value;
	}
	
	public abstract void anyValue();//Incomplete method in Abstract class
}