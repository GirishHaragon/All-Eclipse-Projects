package Java_String_8_vids;

public class String_Word_Programs_6_Word_Manip {
	public static void main(String[] args) {
//		3rd set of programs where we need to break String into words and then do 
//		some manipulations on it.
//		For ex: String s = "This is a String";
//		1.Write a program to find the longest word in a Sentence.
//		2.Write a program to Capitalize first letter of each word in a sentence.
		
//		Program to break String into Words
//		String s = "This is a String";
//		s += " ";//This is to make the last word count.
		
//		String word = "";//We used a new String, to capture our word
//		int end = 0, position = 0;//We r using end & position as word index outside the loop.
//		while(s.indexOf(' ', position)>0) {//To iterate over spaces we use while loop. It runs until it find space in the sentence. 
//			end = s.indexOf(' ', position);//This is to get the index of the space.
//			word = s.substring(position, end);//This is to extract the word before space.
//			
//			//word manipulation code can be written here.
//			
//			position = end + 1;
//		}
		//This above lines is the code to get String to individual words.
		
//		Program to count words in String
//		String s = "This is a String";
//		s += " ";
//		String word = "";
//		int end = 0, position = 0, count = 0;
//		while(s.indexOf(' ', position)>0) {
//			end = s.indexOf(' ', position);
//			word = s.substring(position, end);
//			
//			//word manipulation code can be written here.
//			count++;
//			position = end + 1;
//		}
//		System.out.println(count);//4
		
//		or Using Regular Expression.
//		String s1 = "This is a String";
//        String[] words = s1.split("\\s+");
//        int count1 = words.length;
//        System.out.println(count1); // 4
        
        
//      Program to find longest word  
//        String s = "This is a String tshshdkdkd isi";//This program is invalid for Space before String/line. To make that work too, you need to remove space before the String using trim() function.
//        s += " ";
//        String word = "", lword = "";
//        int end = 0, position = 0, l = 0;
//        while (s.indexOf(' ', position)>0) {//To iterate over spaces we use while loop. It runs until it find space in the sentence. 
//        	end = s.indexOf(' ', position);//This is to get the index of the space.
//        	word = s.substring(position, end);//This is to extract the word before space.
//        	if(word.length()>l) {//Each word is being checked with the count of 'l' length of previous word. 
//        		l = word.length();
//        		lword = word;
//        	}
//        	position = end + 1;
//        }
//        System.out.println("word: "+lword+'\n'+"Length: "+l);
        
        
//      Program to Capitalize first letter of each word.
//        String s = "This is a String";
//        s += " ";
//        String word = "", s1 = "";
//        int end = 0, position = 0;
//        while(s.indexOf(' ', position)>0) {
//        	end = s.indexOf(' ', position);
//        	word = s.substring(position, end);
//        	if(Character.isUpperCase(word.charAt(0))){///My logic - No use 
//        		s1 += word + " ";
//        	}
//        	else if(Character.isLowerCase(word.charAt(0))) {
//        		char firstLetter = word.charAt(0);
//        		s1 += Character.toUpperCase(firstLetter);
//        		s1 += " ";
//        	}
//        	if (Character.isLowerCase(word.charAt(0))) {
//        	    if (word.length() >= 1) {
//        	        char firstLetter = word.charAt(0);
//        	        s1 += Character.toUpperCase(firstLetter) + word.substring(1);
//        	    } else {
//        	        s1 += word;
//        	    }
//        	    s1 += " ";
//        	}
//        	position = end + 1;
//        }
//        System.out.println(s1.trim());
        
		//Or By SimplyCoding.
        String s = "This is a String";
        s += " ";
        String word = "", s1 = "";
        int end = 0, position = 0;
        while(s.indexOf(' ', position)>0) {
        	end = s.indexOf(' ', position);
        	word = s.substring(position, end);
        	s1 = s1 + Character.toUpperCase(word.charAt(0));
        	s1 = s1 + word.substring(1) + " ";
			position = end + 1;
      }
      System.out.println(s1.trim());
	}
}