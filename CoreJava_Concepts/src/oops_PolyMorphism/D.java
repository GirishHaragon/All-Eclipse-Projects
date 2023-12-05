package oops_PolyMorphism;

public class D extends C {
	@Override//This Override annotation helps complier to check whether Overriding is happening or not.
	public void test1() {//After using Override Annotation we cannot vary the method name. It should exactly match the method name present Super/Parent class.
		System.out.println(300);
	}
	
	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();//This is calling Overridden method in class D
		d1.test2();//This is calling Overriding method, in class C
		
		C c1 = new C();
		c1.test1();
	}
}