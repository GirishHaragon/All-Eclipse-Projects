package wait_notify;

public class A {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		synchronized (b1) {//Now we r telling the main method to wait for the Total to be calculated in the run() method in class B.java
			try {
				b1.wait();//We must surround this line with try/catch to avoid Compile time exception.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(b1.total);//Without wait/notify this will give us 0 in console.
	}
}