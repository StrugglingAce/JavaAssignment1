
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating Scanner

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        int pro = number1 * number2;

        int diff = number1 - number2;

        int quo = number1 / number2;

        System.out.printf("The sum is %d, product is %d, difference is %d and quotient is %d.%n", sum, pro, diff, quo);
        
        input.close();
    }
}