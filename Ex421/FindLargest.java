import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;        // Counts how many numbers entered
        int number;             // Number most recently input
        int largest = 0;  // Largest number

        // Loop to process 10 numbers
        while (counter <= 10) {
            System.out.print("Enter integer #" + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("\nThe largest number entered is: " + largest);

        input.close();
    }
}
