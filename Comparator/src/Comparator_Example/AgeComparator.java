package Comparator_Example;

import java.util.Comparator;

public class AgeComparator implements Comparator<Emps>{

	@Override
	public int compare(Emps e1, Emps e2) {
		if(e1.age == e2.age) {//There r 3 possibilities we need to check therefore we use if, else if & else conditional statements.
			return 0;
		}else if(e1.age>e2.age) {
			return 1;
		}
		else return -1;
	}
	
}