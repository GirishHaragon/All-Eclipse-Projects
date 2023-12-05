package oops_PolyMorphism;

public class Square extends Shape {
//	@Override //This method is being Overridden in the Demo class by creating this class's object in it. //If we remove Override anno then this method will not run in the demo class, but the method present in the super class(Shape) will be called. 
	void draw() {
//		super.draw();//Here super keyword helps us to call the member of Super/Parent class(Shape).
		System.out.println("Square Shape");
	}
}