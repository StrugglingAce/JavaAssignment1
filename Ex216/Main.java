
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("The first integer, %d, is larger", num1);
        }
        else if (num1 < num2) {
            System.out.printf("The second integer, %d, is larger", num2);
        }
        else {
            System.err.println("These numbers are equal");
        }
        input.close();
    }
}
