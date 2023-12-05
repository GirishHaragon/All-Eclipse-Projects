package Coding_with_Logics;

import java.util.HashMap;

/*Series of Strings given like {"ArrayList", null, "List", "String", null, "Hash"} 
you have to iterate over each of the Strings, handle the null values, output should be 
such that, it should give String at 0 index is not null and the value at 0 index should be
displayed.*/
public class Interview_Que {
	public static void main(String[] args) {
        String[] strings = {"Arrays", null, "List", "String", null, "Hash"};

        HashMap<Integer, String> stringMap = new HashMap<>();

        for (String d : strings) {
            if (d != null) {
                stringMap.put(0, d);
	                if (strings[2] != null) {
	                    System.out.println("Value at index 2 is not null");
	                }
                break;
            }
        }

        if (stringMap.containsKey(0)) {
            System.out.println("String at 2 index the value is: " + stringMap.get(0));
        }
    }
}

//Or

/*public class Interview_Que {
     public static void main(String[] args) {
        String[] strings = {"ArrayList", null, "List", "String", null, "Hash"};

        HashMap<Integer, String> stringMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                stringMap.put(i, strings[i]);
                break;
            }
        }

        if (stringMap.containsKey(0)) {
            System.out.println("String at 0 index is not null and the value is: " + stringMap.get(0));
        }
    }
}*/