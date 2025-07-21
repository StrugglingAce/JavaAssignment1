
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int even = num % 2;

        if (even == 0) {
            System.out.printf("%d is even", num);
        }
        else {
            System.out.printf("%d is odd", num);
        }
        input.close();
    }
}