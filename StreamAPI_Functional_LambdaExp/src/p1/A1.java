package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A1 {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10,1,3,2,4,6,5,776,34);
		List<Integer> evenNoData = data.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNoData);
		
		List<Integer> oddNoData = data.stream().filter(n->n%2 !=0).collect(Collectors.toList());
		System.out.println(oddNoData);
		
		List<String> newData = Arrays.asList("staLlin","staLlin","Stallin","Denver","Satish","STALLIN","Varun","DhanusH");
		List<String> staLlinData = newData.stream().filter(n->n.equals("staLlin")).collect(Collectors.toList());
		System.out.println(staLlinData);
		List<String> stallinIgnoredCase = newData.stream().filter(n->n.equalsIgnoreCase("stallin")).collect(Collectors.toList());
		System.out.println(stallinIgnoredCase);
		System.out.println(stallinIgnoredCase.size());
		List<String> startsWith_s = newData.stream().filter(n->n.startsWith("s" + "t")).collect(Collectors.toList());
		System.out.println(startsWith_s);
		Set<String> upperCases = newData.stream().map(n->n.toUpperCase()).collect(Collectors.toSet());//Set has ignored repeated values in it. but List has all the values incl duplicates.
		System.out.println(upperCases);
		List<String> upperCasesList = newData.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCasesList);
		List<String> lowerCases = newData.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowerCases);
		
		List<Float> newerData = Arrays.asList(10f,20f,30f);
		List<Float> numMilti2div23 = newerData.stream().map(n->n*2/23).collect(Collectors.toList());
		System.out.println(numMilti2div23);
		
		List<Double> newDoubleData = Arrays.asList(10.3,20.5,30.7);
		List<Double> newerDataDouble = newDoubleData.stream().map(n->n*2/23).collect(Collectors.toList());
		System.out.println(newerDataDouble);
		
		List<Integer> newDataSorting = Arrays.asList(100,200,500,10,23,45);
		List<Integer> newDataSorted = newDataSorting.stream().sorted().collect(Collectors.toList());
		System.out.println(newDataSorted);
		
		List<String> stringSort = Arrays.asList("ades","aswed","swa","qwse","zasw","ades","swa");
		List<String> stringsSorted = stringSort.stream().sorted().collect(Collectors.toList());
		System.out.println(stringsSorted);//String sorting by alphabetical order.
		
		List<String> stringsSortedDistinct = stringSort.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(stringsSortedDistinct);
	}
}