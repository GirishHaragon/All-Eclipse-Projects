package p4;

public class B {
	public static void main(String[] args) {
		String s1 = "xyz";//
		s1 = "abc";//Here the object is not being altered but created a new object with new value and
			//the previous object refence address is removed and the new object reference will be given to s1.
			//Hence the previous object without reference address will be removed by Garbage Collector.
		System.out.println(s1);
		s1 = "xxxx";//Here also the same happening, a new object is created and reference is given 
			//to new object with the new value.
			//So now 2 objects get eligible for GC.
		System.out.println(s1);
	}
}
