package thread_Lifecycle;

public class A {
	public static void main(String[] args) {	
		try {
			Thread.sleep(5000);//5000 milliseconds
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(500);//By using sleep(5000) the thread is not printing the o/p immediately.
		//So wait & sleep r 2 different concepts.
		//Wait means the Thread will wait without any specified  amount of time it will wait. Until & unless we don't notify() the wait state will not end.
		//But Thread.sleep waits for a specified amount of time after that it automatically starts running.
	}
}
