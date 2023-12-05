package CodingForShapes;

public class Square_with_Asterisks_by_ChatGPT {
    public static void main(String[] args) {
        int size = 5; // Change this to the desired size of the square
        int space = 1; // Change this to the desired amount of space inside the square
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < space || j < space || i >= size - space || j >= size - space) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
