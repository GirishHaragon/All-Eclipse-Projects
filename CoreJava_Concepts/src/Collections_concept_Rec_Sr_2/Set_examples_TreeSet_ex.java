package Collections_concept_Rec_Sr_2;

import java.util.TreeSet;

public class Set_examples_TreeSet_ex {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();//Here we are giving Generic in one side only and try.
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(100);
		treeSet.add(33);
		
		System.out.println(treeSet);//We can see TreeSet sorts the data we store in it.
	}
}
