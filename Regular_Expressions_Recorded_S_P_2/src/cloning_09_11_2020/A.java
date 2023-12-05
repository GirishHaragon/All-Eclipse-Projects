package cloning_09_11_2020;

public class A implements Cloneable{//This interface is a Marker Interface which has nothing in it. Means empty. Only if our class implements Cloneable interface we can clone the objects, so that the JAVA Compiler will understand that cloning should be done.
	public static void main(String[] args) throws Exception {
		//First of all we should have an object, to clone..
		A a1 = new A();
		
			for(int i=0;i<100000;i++)//We don't need to write flower brackets when only one statement is to be ran..
				System.out.println(a1.clone());//This is not producing 1Lakh clones of objects.
//			A a2 = (A) a1.clone();//It should be surrounded with the try/catch block. Or even we can use 'throws CloneNotSupportedException'
//			System.out.println(a1);
//			System.out.println(a2);
		 //This throws a compileTime exception, we can use Exception or CloneNotSupportedException' both.
			
	}
}
