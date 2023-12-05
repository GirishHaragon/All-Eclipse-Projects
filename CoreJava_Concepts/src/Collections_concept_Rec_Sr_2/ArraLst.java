package Collections_concept_Rec_Sr_2;

import java.util.ArrayList;
import java.util.List;

public class ArraLst {//We avoid storing Heterogeneous values in AL. If we want only integer values to be stored in AL then we write,,
	public static void main(String[] args) {
		List<Integer> x = new ArrayList<Integer>();//Now we don't see any warnings, bcs the compiler also didn't wan't the data to be stored like that (without generic).		
		x.add(10);
		x.add(20);//What's add() method is doing here? -> It's adding the element to the ArrayList. 
		x.add(30);
		x.add(100);
		x.add(30);
		x.add(null);
		x.add(null);
		System.out.println("add method() :"+x);
		System.out.println(x);
		//Now we see how do we add value/element in between AL.;
		x.add(1, 500);//We are not just using add() method but actually using add(index, value) method.
		System.out.println("add(index, value) method():"+x);
	}
}