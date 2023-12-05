import java.util.Iterator;

public class A {//No need to practice such codes as nobody ask these today
	int balance = 0;
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.account();
		System.out.println(a1.balance);//Here we have to use a1.balance bcs this keyword cannot be added automatically in Static methods.
	}

	private void account() {//This account method will add amount&also withdraw the amount. For that we will create 2 threads, there r several ways to do threads, much easiest way is to do using Anonymous Class (It's nothing but a class which has no name & are ideally created inside a class & we will cover this while studying types of inner classes)
		Thread t1 = new Thread( new Runnable() {//This thread object will give us the .java class file for us. Whenever we r using threads we do implement an interface in this way=> (public class A implements Runnable). Same way if we want to implement an interface for an anonymous class, we cannot use implements key here, the syntax is going to be=> (new Runnable) when we do this it makes that this anonymous class is implementing an interface Runnable. And then the Runnable interface has incomplete method, until we complete the method it will show the error. 
			
			@Override
			public void run() {
				add();//Here why we didn't create the object, how we are calling the method directly? why is that basically we are not writing a1.add? => the line will become automatically this.add(); same way with subtract. We need not write here a1.sub(); bcs if we don't add this keyword inside a non-static method, this keyword gets added automatically.
			}

	
		});//This flower bracket is an anonymous class, which has no class name. But how will this class run?=> When the Thread object is created, the class will run automatically.
		
		Thread t2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				sub();
			}
			
		});
		
		t1.start();//Join opeartion, Let's start thread operation & then only threads will run in sequence then we can apply join operation.
		t2.start();
		
		try {//Join operation is done here & It gives exception hence we surround it with try catch block.
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public synchronized void add() {//If we don't put synchronized then the balance gets corrupted, and after applying, the problem gets resolved.
		for (int i = 0; i < 10000; i++) {
			balance = balance +i ;//We have created balance variable already, here we can directly use balance that'll become => this.balance
		}
	}
	
	public synchronized void sub() {
		for (int i = 0; i < 10000; i++) {
			balance = balance -i ;
		}
	}
}