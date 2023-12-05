package Notes_Theory;

public class DynamicArray {
	
	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() {
		this.array = new Object[capacity];
	}
	
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void add(Object data) {
		if(size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) {
		
		if(size >= capacity) {
			grow();
		}
		for(int i = size; i > index; i--) { //We are iterating in reverse manner upto index provided.
			array[i] = array[i - 1]; //This will shift all next elements to right to make room for the data.
		}
		array[index] = data;
		size++;
	}
	
	public void delete(Object data) {
		if(size >= capacity) {
			grow();
		}
//		for(int i = size; i > ; i--) {
//			
//		}
	}
	
	public int search(Object data) {
		
		return -1;
	}
	
	private void grow() {
		
	}
	
	private void shrink() {
		
	}
	
	public boolean isEmpty() {
		return size == 0; //If size is not zero then returns false
	}
	
	/*Overrides: toString() in Object class. Returns: a string representation of the object.*/
	/*This below method is an overridden method from Object class. And our array is made of Object class*/
	public String toString() { 
		String str = "";
		
		for(int i = 0; i < capacity; i++) { //If we change this to capacity then all the array capacity is shown including null elements. Or else  if we want only the contents then we write size instead of capacity.
			str += array[i] + ", ";
		}
		if(str != "") {
			str = "[" +str.substring(0, str.length() - 2) + "]"; //To format the output of array.
		} else {
			str = "[]"; //If the array is empty.
		}
		return str;
	}
	
}
