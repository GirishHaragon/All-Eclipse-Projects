package p2;

public final class A {
	private final int age;//By making the variables private no-one can access these outside the class. 
			//And final will make the variable final and re-initialization will not be allowed.
	private final String name;//Final variables needs to be initialized or else error will be showing. 

	public A(int age, String name) {//In the constructor we r not keeping super keyword bcz we r 
										//not doing inheritance in here.
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		A a1 = new A(20, "Pankaj");//Object values are initialized and they are final.
		System.out.println(a1.age + a1.name);
	}
}