package Notes_Theory;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
	
	public static void main(String[] args) {
		/*
		LinkedList<String> linkedList = new LinkedList<>();
		/*We can treat LinkedList as a Stack, Queue. Based on methods we use for insertion/deletion
		like if we use push & pop methods then it behaves as a stack. And if we use offer & poll the
		it acts as a Queue
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("E");
		linkedList.offer("F");
//		linkedList.poll();
		
		linkedList.add(4, "E");
		linkedList.remove("E");
		System.out.println(linkedList.indexOf("F"));
		
		System.out.println(linkedList.peek()); //This gives us the Head/first node
		System.out.println(linkedList.peekFirst()); //This gives the First node
		System.out.println(linkedList.peekLast()); //This gives the last node
		linkedList.addFirst("0");
		linkedList.addLast("G");
		String remove = linkedList.remove(); //remove/removeFirst/Last method returns the value.
		System.out.println(remove);
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast(); 
		System.out.println(first); //Gave 0.
		
		System.out.println(linkedList);
		while(!linkedList.isEmpty()) {
			System.out.println(linkedList.poll());
		} */
		
//		ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(); //This is a built-in dynamic array
		
//		But let's create our own Dynamic Array. For this we need a new class for the Array. So follow
//		DynamicArray class
		DynamicArray dynamicArray = new DynamicArray();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
//		dynamicArray.insert(0, "X");
		
		System.out.println(dynamicArray); //Here toString method is getting called since it is an overridden method from Object class
		System.out.println("Size: "+dynamicArray.size);
		System.out.println("Capacity: "+dynamicArray.capacity);
		System.out.println("Empty: "+dynamicArray.isEmpty());
		
	}
}
