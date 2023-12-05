package priority_in_Thread;

public class A extends Thread{ //We r doing Inheritance
	String name;//Created a non static variable String object.
	A(String name){//Created a constructor with Argument(String name) field for the objects created.
		this.name = name;
	}
	public static void main(String[] args) {
		A a1 = new A("Mike");
		A a2 = new A("Stallin");
		a2.setPriority(10);
		a1.setPriority(1);
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		a1.start();
		a2.start();
		//We can set the name of threads as our requirements. By default the names will be like for a1 Thread-1, for a2 Thread-2.
		a1.setName("addAmount");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
	}
	
	public void run() {
		System.out.println(this.name);
	}
}
