package Lambda_Expression;

public class LambdaExample {
	public static void main(String[] args) {
		Shape rectangle = () -> System.out.println("Rectangle class: draw() method ");//This replaced line 8-15.
		rectangle.draw();
		Shape square = () -> System.out.println("Square class: draw() method ");
		square.draw();
		Shape circle = () -> System.out.println("Circle class: draw() method ");
		circle.draw();
	}
}
