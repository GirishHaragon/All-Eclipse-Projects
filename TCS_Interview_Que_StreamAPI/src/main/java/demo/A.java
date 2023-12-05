package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("A", "B", "C", "D");
		List<String> str2 = Arrays.asList("A", "E", "F", "H");

        Set<String> set1 = new HashSet<>(str);
        Set<String> set2 = new HashSet<>(str2);

        set1.retainAll(set2);

        System.out.println("Duplicate elements: " + set1);
		
		
//		str.stream().filter(n -> n.charAt(str.equals(str2))).collect(Collectors.toList());
//		str.stream().filter(n -> n == ).collect(Collectors.toList());
		
		//List<Integer> sortedInts = integers.stream().sorted().collect(Collectors.toList());
		
		List<String> concatedStr = str.stream().map(n->n.concat(n)).collect(Collectors.toList());
//		System.out.println(concatedStr);
		
		//System.out.println(sortedInts)
		
//		integers.stream().map(n -> n.toString().concat(str)).sorted().collect(Collectors.toList);
//		integers.stream().map(null);
		
		
		//From ChatGPT
		List<String> stringList = Arrays.asList("one", "two", "three");
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        Stream<Object> concatenatedStream = Stream.concat(
                stringList.stream(),
                integerSet.stream().map(Object::toString)
        );

        List<Object> concatenatedList = concatenatedStream.collect(Collectors.toList());

        System.out.println(concatenatedList);
        
        ///Or
        List<String> stringList1 = Arrays.asList("one", "two", "three");
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        List<Object> interleavedList = IntStream.range(0, Math.min(stringList.size(), integerSet.size()))
                .mapToObj(i -> Stream.of(stringList1.get(i), integerSet2.toArray()[i]))
                .flatMap(stream -> stream)
                .collect(Collectors.toList());

        System.out.println(interleavedList);
        
        //Another way as i thought
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("x", "y", "z");

        List<String> interleavedList1 = IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> Stream.of(list1.get(i), list2.get(i)))
                .flatMap(stream -> stream)
                .collect(Collectors.toList());

        System.out.println(interleavedList1);
        
        
        //On Face to face first attempt     //Giving NullPointer Exception.
//      List<String> a = new ArrayList<String>(asList("aaa", "abc", "bbb", "bcz", "afs"));
//		List<Integer> integers = new ArrayList<Integer>(asList(1112, 1123, 1234, 2444));
		
//		integers.stream().map().sort

	}
	
//	private static Collection<? extends String> asList(String string, String string2, String string3, String string4,
//			String string5) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static Collection<? extends Integer> asList(int i, int j, int k, int l) {
//		// TODO Auto-generated method stub
//		return null;
//	}
 }