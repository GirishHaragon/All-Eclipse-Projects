package wait_notify;

public class B extends Thread {
	
	int total = 0;
	
	public void run() {//At first we purposefully make mistake by not applying wait/notify.0
		for(int i=0;i<1000;i++) {
			total = total+i;
		}
		//notify();  //Commented this bcs it is giving exception. Without this working as it should work.
	}
}
