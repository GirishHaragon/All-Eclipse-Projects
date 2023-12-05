package oops_PolyMorphism;
//Compile time PolyMorphism is achieved by method-Overloading.
public class E {
//	void add() {
//		int a=10,b=20,c;
//		c=a+b;
//		System.out.println(c);
//	}
	int add() {
		int a=10,b=20,c;
		c=a+b;
		return c;//We have to catch the returning value in the main method.
	}
	void add(int x, int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x, double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		E e = new E();
		int add = e.add();//compiler knows here which method to call, in this case.
//		e.add();//30
		e.add(100, 200);
		e.add(30, 22.5);
//		e.add();
		System.out.println(add);
		
	}//Compiler gets to know which method to be called based on the method parameter/arguments. And if we change the order of the methods then also compiler will accurately find the right method to be executed.
}