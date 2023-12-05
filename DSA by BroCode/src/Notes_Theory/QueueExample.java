package Notes_Theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>(); 
		//We cannot use Queue directly bcz it is an Interface.
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.peek()); //We can peek the queue to see the Head element.
//		or
		String peek = queue.peek(); //We can also take return value from peek method.
		System.out.println(peek);
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll(); //When we use methods like: offer(), peek() & poll() doesn't throw exception.
		
		//Instead of using the offer(), poll() & peek() methods if we use their alternatives
			//add(), remove(), element() then we can see exceptions.
//		queue.element();//Then we can see exception (NoSuchElementException) 
							//bcz there is no element/head element in the queue.
//		But we can use peek() methods to see the Head without getting exception
		System.out.println(queue.peek()); //It doesn't throw exception. But shows null.
		
		System.out.println(queue);
		
//		Queue interface extends Collection interface. So we can use any methods from Collection as well.
		System.out.println(queue.isEmpty());
		
		queue.offer("Karen");
		
		System.out.println(queue.size()); //Returns the size of Queue.
		
		System.out.println(queue.contains("Karen")); //Returns true/false depending upon the result. 
		
		
//		Let's see what happens with LinkedList and PriorityQueue when we store double values.
		Queue<Double> linkedQueue = new LinkedList<Double>();
		linkedQueue.offer(3.0);
		linkedQueue.offer(2.5);
		linkedQueue.offer(4.0);
		linkedQueue.offer(1.5);
		linkedQueue.offer(2.0);
		
		while(!linkedQueue.isEmpty()) {
			System.out.println(linkedQueue.poll()); //We are removing the elements from queue and
//				printing them.
		}
//		This LinkedList is storing the elements in the order of insertion.
		System.out.println("  ");
		
		
		
//		But PriorityQueue doesn't store elements in the order of insertion.
		Queue<Double> priorityQueue = new PriorityQueue<Double>(Collections.reverseOrder());
		
		priorityQueue.offer(3.0);
		priorityQueue.offer(2.5);
		priorityQueue.offer(4.0);
		priorityQueue.offer(1.5);
		priorityQueue.offer(2.0);
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
//		This PriorityQueue stores the objects in the ascending manner by default. 
//		We can utilize the Prioritizing by providing comparator in the constructor which becomes advanced.
//		To make the PriorityQueue store objects in descending we change the constructor/argument as:
//			**Collections.reverseOrder()**.
//		But this Collections.reverseOrder() method cannot be applied to other collections.
		
//		Let's see another example with different Data Types which follows Alphabetical order.
		Queue<String> strPriQueue = new PriorityQueue<>(); //We can also reverse the order just like prev. 
		
		strPriQueue.offer("B");
		strPriQueue.offer("C");
		strPriQueue.offer("A");
		strPriQueue.offer("F");
		strPriQueue.offer("D");
		
		while(!strPriQueue.isEmpty()) {
			System.out.println(strPriQueue.poll());
		}
		
		Queue<Integer> nums = new PriorityQueue<>();
		nums.offer(1);
		nums.offer(2);
		nums.offer(3);
		nums.offer(1);
		System.out.println(nums); 
//		PriorityQueue is designed to maintain the smallest element at the 
//		front, but it does not ensure that all elements are sorted when you print it.
		
//		To retrieve the elements in ascending order, you can use a loop to remove elements from 
//		the queue one by one
		while(!nums.isEmpty()) {
			System.out.println(nums.poll());
		}
		
		
	}
}
