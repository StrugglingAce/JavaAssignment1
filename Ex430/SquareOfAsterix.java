import java.util.Scanner;

public class SquareOfAsterix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for size
        System.out.print("Enter the side length of the square (1 to 20): ");
        int size = input.nextInt();

        // Validate input
        if (size < 1 || size > 20) {
            System.out.println("Invalid size. Please enter a number between 1 and 20.");
            input.close();
            return;
        }

        // Generate square
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                // Print asterisk at border
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }
        input.close();
    }
}