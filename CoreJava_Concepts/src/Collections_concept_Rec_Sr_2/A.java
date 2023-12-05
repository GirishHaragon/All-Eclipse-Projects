package Collections_concept_Rec_Sr_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class A {

	public static void main(String[] args) {
//		Employee arun = new Employee("Arun", "k", 100);
//		Employee ravi = new Employee("Ravi", "r", 200);
//		Employee santosh = new Employee("Santosh", "s", 300);
//		
//		LinkedList<Employee> empDetails = new LinkedList<Employee>();//Generics plays major role here. Now all we want is to store the arun,ravi,santosh in empDetails collection List. When we store it the generics is not gonna be ordinary one, even we can store our own objects(Employee) of different generics.
//		empDetails.add(arun);
//		empDetails.add(ravi);
//		empDetails.add(santosh);//Collection is nothing but collection of values which are converted into objects and stored into the collection List.
//		
//		System.out.println(empDetails);//This is giving object addresses. & how we fetch the data?
//		
//		//So we use for each loop here, and iterate over it.
//		for (Employee employee : empDetails) {//From empDetails objects are getting copied by employee.
//			System.out.println(employee.getFirstName());//So first object address is being copied here and we print it's FirstName, LastName & id by using get method. //So this is very important when we r further dealing with SpringBoot Projects lot of Collections will come into picture. That time we should not think that why in a Collection object address are stored. When we r reading data from a table, it will not just read the data but it'll convert that into an object and stores it. That is what is an ORM (Object Relation Mapping).
//			System.out.println(employee.getLastName());//We cannot directly access the data because of encapsulation. But if we want to access it the we should use getters and setters for that.
//			System.out.println(employee.getId());
//		}//This now prints all the values in the object.
//	}//Now we should be more clear what generics is, it gives the power to store any kind of objects in it, it may be the objects we create or the built-in objects, that doesn't matter. But we have to define it properly.
//	import java.util.*;

//	public static void main(String[] args){  
		Stack<String> stack = new Stack<String>();
		stack.add("Ayush");
		stack.add("Garvit");
		stack.add("Amit");
		stack.add("Ashish");
		stack.add("Garima");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
}