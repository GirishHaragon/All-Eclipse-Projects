package finalize_method;

public class A extends Object{//We don't need to write 'extends Object' class. Because by default every class is a sub class of object. But still we write because when we click on control while keeping cursor on Objcet, we can look into the code of it in other tab of eclipse, which is not developed by us. In that we can find 'finalize' keyword used by pressing "Ctrl+F".
	//If anybody asks What is the difference between final, finally & finalize. We covered with final & finally. Except throw & throws is not covered.
	//Right now we are Overriding finalize method in class A by inheriting from Object class by copying the method in Object class.  
	protected void finalize() {//This is the method, where the logic of garbage collection is written down.
		//In finalize, all our Garbage collection is present in it.
		//When we r overriding this method in class we can print any of the content we want. But Actually finalise is a special method present inside Object classwhich consist of GC concept. 
		System.out.println(1000);
	}
	
	public static void main(String[] args) {
		//How the Garbage collection should work is decided by the internal implementation of JVM, but if we still want to call the finalise method we can do that by writing,
		A a1 = new A();
		a1 = null;//Now why r we marking 'a1=null', bcs if reference of object address is removed, the object will be eligible for GC. Bcs used object cannot be removed.
		System.gc();//For us to call the finalise() method successfully, we firstly create an object
		//Right now we r overriding it, it may/maynot print 1000. We cannot predict that. Right now it is being called. And if we commented the line a1=null; then the object is not eligible for GC & it is not calling finalize method at all. 
	}
}
