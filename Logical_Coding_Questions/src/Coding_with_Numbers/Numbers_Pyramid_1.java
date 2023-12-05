package Coding_with_Numbers;

public class Numbers_Pyramid_1 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print("1 ");
            }

            System.out.println();
        }
    }
}
