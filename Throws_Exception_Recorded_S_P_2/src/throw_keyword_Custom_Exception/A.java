package throw_keyword_Custom_Exception;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {//Another way of writing try/catch block to the 'throw new InSufficientFunds' we can write throws InSufficientFunds in-front of this method only to avoid exception.
		try {
			throw new InSufficientFunds();// We r not handling this exception therefore it tells us to surround with try/catch block.
		} catch (InSufficientFunds e) {// The exception name is InSufficientFunds & we will name it as e.
			//If we left this blank then the exception gets suppressed, but if we write 'e.printStackTrace();' then the exception shows up in the console with red-mark. & we can use this block to print anything we want.
		}
		
		//Let's implement ATM Insufficient Balance Exception analogy.
		int balance = 500;
		
		Scanner s = new Scanner(System.in);//We have created a scanner class object and imported it.
		System.out.println("Enter the Amount:");
		int amount = s.nextInt();
		if(balance>=amount) {
			System.out.println("Please collect the Cash");
		} else {
			try {
				throw new InSufficientFunds();
			}catch (InSufficientFunds e) {
				System.out.println(e);
				System.out.println("Low Balance!!");
			}
		}
		//Actually we will never use these concepts, it is there in JAVA, they will ask Difference between Throw & Throws keyword in JAVA.
		//But when we r developing a software later, this concept doesn't make any sense, as there r lot of concepts in JAVA that is nowhere required to build a software like this. But still we have to learn bcs in Interviews they ask something even though they don't use it. Just to understand how seasoned you r with JAVA.
	}
}
