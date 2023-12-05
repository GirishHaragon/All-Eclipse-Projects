package Coding_with_Letters_String;

//Find occurrence of a letter 'a' and 'b' in the given String "aabaaabaaz" 
public class StringLettersCounter {
    public static void main(String[] args) {
        String s = "aabaabaaaz";
        int counta = 0;
        int countb = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counta++;
            } else if(s.charAt(i) == 'b') {
            	countb++;
            }
        }
        System.out.println("Number of 'a' letters: " + counta);
        System.out.println("Number of 'b' letters: " + countb);
    }
}