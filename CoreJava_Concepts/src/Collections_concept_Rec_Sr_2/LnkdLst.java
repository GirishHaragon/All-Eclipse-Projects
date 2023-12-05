package Collections_concept_Rec_Sr_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LnkdLst {
	public static void main(String[] args) {
		//Instead of writing,
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//We can write,
		List<Integer> lst = new ArrayList<Integer>();//This is nothing but Class-Upcasting, where the object (ArrayList) is created & it's address is stored in the Parent (List) reference variable. Now List is an Interface, which is being implemented by ArrayList & LinkedList. Which makes no change in output. Now we should all know that List interface has lot of built-in methods. And these r the methods implemented in ArrayList. 
		lst.add(1);
		lst.add(23);
		lst.add(21);
		//Now to find the size of an ArrayList, we can add size() method.
		System.out.println(lst.size());//This give the size of the Array (3). Just like the length() function where length() doesn't work here.
		System.out.println("add() method:"+lst);
		
		//Now what all methods we were seeing here in ArrayList are also present in LinkedList.
		List<Integer> list = new LinkedList<Integer>();//Without altering anything in the program, we can still see the same output in the LinkedList.
		//The methods in the ArrayList and LinkedList are same in it. Because both are implementing the same Interface List. So that's much easier to understand that what all methods present in the List, except few exclusive methods which we'll learn soon.
		//Whatever methods r present in List, a class implementing it is forced to develop that.
		//Yeah some methods like add() method the way it works will be different in ArrayList or LinkedList. In interfaces we will be hiding implementation details, as we know what logic present in add() method it adds some value in the LinkedList.
		//In Collection, LinkedList is a Doubly LinkedList. It is internally created as a doubly LiLst.
	}
}