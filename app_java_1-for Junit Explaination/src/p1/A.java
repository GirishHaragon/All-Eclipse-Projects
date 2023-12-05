package p1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {//Eclipse by Default comes with Junit framework, no extra installations needed, & there r lot of annotations present in junit.
	//The 1st annotation present in Junit is @Test
	@Test
	public void test1() {
		//Whenever we r using Junit we don't require main method, we need not create object to call this method, it's non-static, calling of this method is done by the annotation.
		//The @Test annotation automatically calls this method, when the method finishes its complete execution this annotation will check, was there any failure in the code, inside this method if any line of code doesn't run correctly, then it'll report a failure automatically, or else it'll report pass.
		//and to run & check the method we use Run on Junit.
		//we can have any number of test methods.
		//When we run this whole code the methods will run in sequence, & we can select a single test1/test2 and run as Junit then only that method runs.
		System.out.println("From Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("From Test2");
	}
	
	//We also have many other Annotations than Test, let's explore
	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
		//"Before Method" it runs before every methods,,
		//What kind of codes can we write in here, like before Test you want to connect to DB so write Connection of DB code in Before method & CRUD operation in test method 
	}
	//Then same way we have After method which runs after every methods.
	@After
	public void afterMethod() {
		System.out.println("After Method");
	}
	//Some more Annotations which we might use,
	@BeforeClass
	public static void beforeClass() {//this annotation will fail bcs BeforeClass should be applied only on a Static method hence the method needs to be 'public static void', this is like Main method, which runs before all the methods only for once.
		System.out.println("Before Class");
	}
	//same way we have @AfterClass
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
//So These Annotations will help us to perform Unit Testing/WhiteBox/Transparent testing on CRUD Operations.
//Just now what we did, we use Junit in our project/code where we had to do CRUD Operations, weather these CRUD Op r working or not we used Junit.
//JUnit by Default comes with SpringBoot as well, no need of any separate Configurations.