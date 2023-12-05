package Collections_concept_Rec_Sr_2;

import java.util.LinkedList;
import java.util.List;

public class LnkLst {
	public static void main(String[] args) {
//		List<Integer> x = new LinkedList<>();//It's a good practice to give reference variable of object as List Interface, bcz when we give List we can store the reference of ArrayList or LinkedList both in it. Here we r giving Integer in Reference variable but nothing to the object side, but still the Integer in Reference variable takes care of everything. But if we still wanna write then we can write.
//		x.addFirst();//This shows error bcz addFirst() method is exclusive one in LiknedList & we don't get that in List interface that's y it shows error.
		LinkedList<Integer> x = new LinkedList<>();
//		x.addFirst(100);//This methods adds value from the first/head.
//		x.addFirst(200);
//		x.addFirst(300);
//		x.addFirst(400);
//		System.out.println(x);//This output gives as 400,300,200,100. //Bcz every values have stored using addFirst() method. Then every value get stored in place of first node. 
		x.add(100);
		x.add(200);
		x.add(300);
		x.add(400);
		System.out.println(x);//This gives o/p as 100,200,300,400. //Bcz every values r normally adding one by one.
		x.addFirst(500);//This stores the value 500 in place of first node. This becomes the first element.
		System.out.println(x);//This gives o/p as 500,100,200,300,400.
		x.addLast(700);
		System.out.println(x);//This add element in the last place.
		//So we can understand as addFirst() adds element as Head and addLast() adds element as Tail.
		//again if we use add() method then the element adds at the last only.
		//add() method and addLast() looks the same but the internal working will not be good in performance when used add() instead of addLast().
		
	}
}