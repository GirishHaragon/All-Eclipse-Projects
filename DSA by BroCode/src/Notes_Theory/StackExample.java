package Notes_Theory;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
//		stack.add("Minecraft");  //add() method is present in Vector which is extended by Stack class.
		//Which also does the same work.
		//Stack starts inserting objects from 1 not from 0.
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Doom");
		stack.push("BorderLands");
		stack.push("FFVII");
		
//		stack.pop(); //We don't need to list the item to be popped bcz it always remove the top one.
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop(); //This will give EmptyStackException bcz there is nothing left to remove from stack.
		
		String myFavGame = stack.pop(); //We can use the popped object by assigning it to local variable.
		
		System.out.println(stack);
		System.out.println(myFavGame);
		
//		If we don't to want remove top object but see what's on top of stack, then we use peek() method.
		System.out.println(stack.peek());
		System.out.println(stack.search("Doom")); //This returns the position where the object is in the stack.
		System.out.println(stack.search("doOm")); //If the Object is not found then it return -ve 1.
		
//		Stack can actually run out of memory if stored about it's capacity.
//		for (int i = 0; i < 1000000000; i++) {
//			stack.push("Fallout76");
//		}
//		We need to wait for 2 minutes for getting the exception in console.
//		Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		
//		-> We can add duplicates into stack

	}
	
}
