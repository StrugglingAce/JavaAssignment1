
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second Integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third Integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        int avg = (num1 + num2 + num3) / 3;

        int prod = num1 * num2 * num3;

        int largest;

        int lowest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        }
        else if ( num2 >= num1 && num2 >= num3) {
            largest = num2;
        }
        else {
            largest = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            lowest = num1;
        }
        else if ( num2 <= num1 && num2 <= num3) {
            lowest = num2;
        }
        else {
            lowest = num3;
        }

        System.out.printf("The sum is %d, Average is %d, Product is %d, Smallest is %d, and the Largest is %d", sum, avg, prod, lowest, largest);
        input.close();
    }
}