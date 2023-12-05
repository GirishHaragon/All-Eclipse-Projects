package Stream_Api_Automation_Techie_YT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterMethod {
	public static void main(String[] args) {
//		Collection: to present the group of data/objects as single entity we use Collections.
//		Stream: to process the data from Collection we use Streams concepts.
//		Methods in Streams are
//		filter(), map(), sorted(), distinct(), min(), max(), flatMap()
		
//		filter():
//		First of all we need a Collection/group of Objects to work on streams.
		/*ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);
		numbersList.add(30);*/
		
		List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
		
		//Now from the above Collection we need only Even numbers.
		
//		Without using Streams concept how we were processing the Collection of elements?
		List<Integer> evenNumbersList = new ArrayList<Integer>();
//		
//		for (int n: numbersList) {//Using enhanced for loop.
//			if (n%2==0) {
//				evenNumbersList.add(n);
//			}
//		}
//		System.out.println(evenNumbersList);
		
//		With using Streams
		evenNumbersList = numbersList.stream().filter(n -> n%2==0).collect(Collectors.toList());//In filter condition we r passing one predicate to the filter() method.
		System.out.println(evenNumbersList);
		
		numbersList.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
//		or
		List<Integer> collect = numbersList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		collect.forEach(n->System.out.println(n));//filter is taking predicate/argument value and forEach is taking consumer vale.
//		or
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);//Using method reference. And without using Lambda exp. System.out is a static variable which contains a println method. So we can directly access methods from the object using double colons.
		
		
//		Another filter() example.
		
	}
}