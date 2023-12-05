package Test;

public class ReverseStringAndSumEven {
    public static void main(String[] args) {
        String input = "k#1 b#34 c#56 d#78 e#9 f#";
        
        // Step 1: Remove spaces and #
        String cleanedString = input.replaceAll("[\\s#]", "");

        // Step 2: Reverse the string
        StringBuilder reversedString = new StringBuilder(cleanedString).reverse();
        String reversedResult = reversedString.toString();
        
        // Step 3: Initialize sum for even numbers
        int sumEven = 0;

        // Step 4: Iterate through the characters of the reversed string
        for (char c : reversedResult.toCharArray()) {
            int num = Character.getNumericValue(c);
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        
        // Step 5: Print the reversed string and sum of even numbers
        System.out.println("Reversed String: " + reversedResult);
        System.out.println("Sum of Even Numbers: " + sumEven);
    }
}

