package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	//We want to copy the data/object from A to B & B to A.
	private int id;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10,5,23,4,6,20);//This is another way to build a List, which we will take it into List Interface (List of Integer-Generic). Data here is a variable. This is another way to create a List. Or else we can create a list like, "ArrayList arr = new ArrayList(); arr.add(10); arr.add(5,23); arr.add(4,6..)". There is a built-in thing called as Arrays, we can just call this method & store these values.
		//Now let's do some Logic Building. *See One of the advantage of Java Programming Language is data-structures is built-in, that's y we don't put efforts to develop Data-structures, unlike other prog. langs the big prob there, is to develop a Data-structure. For ex- we want a dynamic array, then we have to develop, there is no built-in logic. We want a List then we develop the logic. Which means we r wasting our time to develop the logic. Thats where what they did is they built the logics in Java so that developers need not waste time in such things.
		//Let's if we want DoublyLinked List, then we just create LinkList object then we get DoublyLinkedList. Now if we were using C++ then we don't have DoublyLinkedList, we have to develop the logic.
		//In Interviews they might ask us "Difference between ArrayList & LinkedList?","Internal working of HashMap","Internal working of TreeSet". But what if we get Logical questions in Interviews. Like "Give me only even numbers from the list", if they ask us to build some logic on collection, therefore in Java-8 they introduced StreamApi to manipulate Collections(using logics) based on requirement. If we r using StreamApi we can build logic in 1-line. We need not struggle like other developers(C++, C#, etc)
		
		//Firstly Logic no-1, Give me only even nos from your collection(list).
		List<Integer> newDataEvens = data.stream().filter(n->n%2==0).collect(Collectors.toList());//We use a function called filter(Built-in method). Y filter because we r filtering the even values from the record. Function filter should be used when among the given data, we r discarding some & taking some. There r 2 important functions in StreamAPI that r, filter() & map(). To filter elements we use Lambda expression. Now all the array values can be represented with any variables, for eg we used n, it's upto us. Then we use Lambda exp to define the formula. n%2==0 means dividing a numb by 2, if the remainder is 0 then that's even numb. % denotes modulo operator which takes 2 operands (the no being divided & the divisor) & the operator returns the remainder of dividing the dividend(10,5,23..) by a divisor(2). Now what collect does is whatever filtered content we get, that o/p we r storing it into new List. & That new List we call it as newData.
		System.out.println(newDataEvens);//Java doesn't have limitation of building data structures/logic like other programming languages, that's y when we go for java interviews they are more keen on asking questions on collection, it's internal working, and data structure and some logical questions which we can solve with stream Api in one line like this.		
		
		//Secondly Logic no-2, Give me only odd nos from your collection(list).
		List<Integer> newDataOdds = data.stream().filter(n->n%2!=0).collect(Collectors.toList());//Here we just change the formula "filter(n->n%2!=0)" to get odd numbers from Collection(List). 
		System.out.println(newDataOdds);
		
		//Third Logic no-3, Give me number of times/count 'stallin' that has occurred in the list 
		List<String> names = Arrays.asList("mike","stallin","welcome","sTallin");//We have used String data in List, 
		List<String> newData = names.stream().filter(n->n.equalsIgnoreCase("stallin")).collect(Collectors.toList());//Now again there will be filter to use, bcs we r filtering & taking only 2. So we can't use Map function here. We need to count the no of times stallin has used, ignoring case, therefore we use formula 'filter(n->n.equalsIgnoreCase("stallin"))' we could give the formula as 'filter(n.equals("stallin"))' but this does not ignore the casing and gives only the word which matches exactly.
		System.out.println(newData);//This gives the strings which are equals
		System.out.println(newData.size());//This gives the no of counts the String(stallin) has repeated.
		
		//Fourth Logic no-4, Give me names starting with letter "s".
		List<String> newerData = names.stream().filter(n->n.startsWith("s")).collect(Collectors.toList());//We have changed the names List data as last word "sTallin". And we can also get the String starting with more than one letter like "startsWith("s" + "t")". And we cannot use comma in place of +.
		System.out.println(newerData);
		
		//We can also use Set collection using toSet to store the data instead of toList.
		//And we can also try with different DTs like Float, Double etc tried calculating with StreamApi.
		
		//Fifth Logic no-5, Convert all the names in UpperCase.
		List<String> allUpperCases = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());//To convert all the names to Upper-case, here we r not filtering anything so we use map function. And then we have a built-in method called toUpperCase(), which converts all names to uppercase.
		System.out.println(allUpperCases);//use map() when all data is needed, & use filter() to remove some elements & collect some..
		
		//Sixth Logic no-6, Convert all numbers of a List to Multiplied with 2.
		List<Integer> numbers = Arrays.asList(10,20,30);
		List<Integer> numMulti2 = numbers.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(numMulti2);
		
		//Seventh Logic no-7, Sort the numbers in the Array List.
		List<Integer> sorting = Arrays.asList(100,20,30);
		List<Integer> sorted = sorting.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		//Eight Logic no-8, Sort the Strings alphabetically in Array List.
		List<String> sortStr = Arrays.asList("def","abcd","aaaa");
		List<String> sortedStr = sortStr.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedStr);
		
		//Ninth Logic no-9, Remove Duplicate elements from the Array List
		List<String> removeDupl = Arrays.asList("aaaa","def","abcd","aaaa");
		List<String> removed = removeDupl.stream().distinct().collect(Collectors.toList());
		System.out.println(removed);
	}
}