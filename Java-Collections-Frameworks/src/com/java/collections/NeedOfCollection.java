package com.java.collections;

public class NeedOfCollection {

	public static void main(String[] args) {
		int a = 10;//This is how we used to store integer values in individual variables.
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		int f = 60;
		int g = 30;//But let's say we need more than 10/100/1000 values in individual int variables.
		
		//To overcome this issue we have Arrays concept in Java.
		//Array: Array is a DataStructure which can hold homogeneous data in it or similar type of data.
		//Array is Collection of values with based on indexes.
		//Arrays are fixed in size.
		//After creating array we cannot increase or decrease the size as per our requirement.
		
		
		//Ex:
		int[] array = new int[10000];//We can store multiple values into single variable. So the size is 10k
	//Limitations of Array.
		//1. Arrays are fixed in size.
		//We cannot store more than 10k values in array. If we do so, we get ArrayIndexOutOfBoundException.
		//2. Array can hold only homogeneous data elements.
		//We can store only similar type of data elements. 
		
		Student[] students = new Student[10];//Arrays are objects in java, we can use new keyword to create object of Array.
		students[0] = new Student();//Adding value in the array.
		students[1] = new Student();
		//students[0] = new Book();//We tried to add different type of element, but it gives Compiler Error.
		//We also have a solution for this issue in Array.
		//We can use Array of Objects to store different type of Objects. Object class is super class. So it can hold different type of objects in it.
		Object[] obj = new Object[10];
		obj[1] = new Student();
		obj[0] = new Book();//Here it is possible. To store different Objects without warn. 2nd limitation resolves by this.
		
		//3.Ready-made support is not available in Arrays.
		//Whenever we want to write some logic to implement algorithm/datastructure, we have to explicitly write the code/data structure. There is no ready made APIs available in java to write logic for Algorithms/data structure for arrays.
		
		//To Overcome all these Limitations of Arrays we have Collections concept in java.
		
		
		//Collections concept is introduced in JDK 1.2v release & onwards.
		//Collections are Flexible in Size / internally have Dynamic in size as per the requirement.
		
	}

}

class Book{
	
}
class Student{
	
}