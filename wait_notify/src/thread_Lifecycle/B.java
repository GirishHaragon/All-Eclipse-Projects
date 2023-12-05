package thread_Lifecycle;

public class B extends Thread{
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.getState());//What is the current state of the thread if we want to know then we use the built-in method called getState().
		b1.start();
		
		try {
			Thread.sleep(5000);//5000 milliseconds
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(b1.getState());
	}
	
	public void run() {
		System.out.println("Test");//In console 'Test' means this method/Thread is running. Then after sometime(5000milliseconds) we can see in console as 'Terminated'.
	}
}
