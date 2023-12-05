package Lambda_Expression;

//This is a traditional way of doing the PolyMorphism Method Overriding.
public interface Shape {
	void draw();//Whenever we define method in an interface, it is by default public & abstract.
}

class Rectangular implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle class: draw() method ");
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square class: draw() method ");
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle class: draw() method ");
	}
	
}
//All these lines of codes can be avoided by using Lambdas Expression. Where it is written in LambdaExample class.