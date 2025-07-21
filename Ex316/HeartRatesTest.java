import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year (e.g. 1990): ");
        int year = input.nextInt();

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        // Display information
        System.out.println("\n Heart Rate Information");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.printf("Date of Birth: %d/%d/%d%n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.println("Age: " + person.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.getMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.getTargetHeartRateRange());

        input.close();
    }
}
