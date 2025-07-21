import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Process 3 customers
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nCustomer " + i);

            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + charges - credits;

            // Display results
            System.out.println("Account Number: " + accountNumber);
            System.out.println("New Balance: " + newBalance);

            // Check if credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }
        }
        input.close();
    }
}
