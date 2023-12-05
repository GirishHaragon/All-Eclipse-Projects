package Comparator_Example;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_Comparator {
	public static void main(String[] args) {
		ArrayList<Emps> a1 = new ArrayList<Emps>();
		a1.add(new Emps("Monica", 50));
		a1.add(new Emps("Sameer", 45));
		
		Collections.sort(a1, new AgeComparator());//To do the sorting based on age we need to call the Collections interface sort() method. Now this AgeComparator will be operated on the ArrayList Collection of Objects.
		for(Emps e: a1) {//This is called enhanced for loop. We r traversing through our arraylist elements and printing the name and age after sorting. 
			System.out.println(e.name+" "+e.age);
		}
	}
}