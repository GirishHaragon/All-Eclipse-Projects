package threads_example;

import java.util.Iterator;

public class A extends Thread {//run() & start(), Now the Run method present in Thread is inherited to Class A And we'll now Override it. 

	@Override
	public void run () {//Now whatever we write in this run() method is eligible for Multi-Tasking.
		for (int i = 0; i < 5; i++) {
			System.out.println("run");
		}
	}
	//The above for loop will run for sometime and the below forloop will run for sometime, but we can't predict that which for loop will run first neither we can control, & that is the drawback of threads. Which program should run first / execute first that cannot be controlled.  
	public static void main(String[] args) {//Main method by default is yet another thread, that threads mean the above method is one module and this main method is another module. Now we need to run the Override method for sometime & this Main method for some time, for this we build a simple for Loop in @Override.
		A a1 = new A();
		a1.start();
		for (int i = 0; i < 7; i++) {
			System.out.println("main");
		}
	}
}