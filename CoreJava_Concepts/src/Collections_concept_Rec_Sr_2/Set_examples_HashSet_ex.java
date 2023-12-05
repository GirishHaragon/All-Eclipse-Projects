package Collections_concept_Rec_Sr_2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set_examples_HashSet_ex {
	public static void main(String[] args) {
		//Example 1.
		HashSet<Integer> hashSet = new HashSet<Integer>();//Here we didn't use import class option from Ctrl+1 where we were not getting import option. Instead we used Ctrl+Shift+O. And it automatically got imported from Util package.
		hashSet.add(20);//After we write 20 without generic, we get warning message. Then we write Generic Integer above to remove warning.
		//Now in JDK 1.8 this feature was introduced where we can just use Generic on only One side (while mentioning parent interface reference for the object i.e LHS). If we are using 1.7 then this will not work. In 1.8 we need not write Generic again at the object side. But sir prefers to write it again to specify more clear code and this removes another warning in our code which looks clean.
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
		hashSet.add(50);//HashSet takes only unique values.
		
		System.out.println(hashSet);//Insertion order is not maintained we can see out here.
		
		hashSet.add(null);//Let's see if it stores null. Even also the DT/Generic is Integer it is storing null value & no warnings also.
		System.out.println(hashSet);
		
		//Example 2.
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		linkedHashSet.add(null);//We can see LinkedHashSet also takes null values.
		System.out.println(linkedHashSet);//We can see the insertion order is maintained in LikedHashSet which an extension of HashSet class.
		linkedHashSet.add(50);//LinkedHashSet only stores unique values. No duplicates.
		System.out.println(linkedHashSet);//We can see value 50 is not repeated again.
	}
}
