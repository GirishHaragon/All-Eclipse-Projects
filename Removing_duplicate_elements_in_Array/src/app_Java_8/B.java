package app_Java_8;

import java.util.Arrays;

public class B {
	public static void main(String[] args) {
		//Sort an Array. Using Bubble sort method.
		int[] x = {1,2,3,5,4,5,7,6,2,7,8,9,10};
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]>x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		
		//Using Built-in Function in just 2 lines.
		Arrays.sort(x);
		System.out.println("Using Built-in function: "+Arrays.toString(x));
		
		//Removing Duplicate Elements from an Array
		int[] y = x;
		int[] temp = new int[x.length];
		int j = 0;
		for(int i=0; i<y.length-1; i++) {
			if (y[i] != y[i+1]) {
				temp[j] = y[i];
				j++;
			}
		}
		temp[j] = y[y.length -1];
		for(int q=0; q<temp.length; q++) {
			System.out.print(temp[q]);
		}
		
		//To get the O/p in the form as an Array.
		System.out.println('\n'+Arrays.toString(temp));
		
		//To remove Zeroes from the o/p.
		// Create a new array with only the distinct elements
        int[] distinctArray = Arrays.copyOf(temp, j + 1);

        // Print the distinct elements
        System.out.println(Arrays.toString(distinctArray));
	}
}
