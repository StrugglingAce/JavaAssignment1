import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Gender: ");
        String gender = input.nextLine();

        System.out.print("Birth Day (1-31): ");
        int day = input.nextInt();

        System.out.print("Birth Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Birth Year (e.g., 1990): ");
        int year = input.nextInt();

        System.out.print("Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Weight (in pounds): ");
        double weight = input.nextDouble();

        // Create HealthProfile object
        HealthProfile profile = new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);

        // Output results
        System.out.println("\nHealth Profile");
        System.out.println("Name: " + profile.getFirstName() + " " + profile.getLastName());
        System.out.println("Gender: " + profile.getGender());
        System.out.printf("Date of Birth: %d/%d/%d%n", profile.getBirthDay(), profile.getBirthMonth(), profile.getBirthYear());
        System.out.printf("Height: %.2f inches%n", profile.getHeightInInches());
        System.out.printf("Weight: %.2f pounds%n", profile.getWeightInPounds());
        System.out.println("Age: " + profile.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + profile.getMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + profile.getTargetHeartRateRange());
        System.out.printf("BMI: %.2f%n", profile.getBMI());

        // Display BMI chart
        System.out.println("\nBMI Categories");
        System.out.println("Underweight: <18.5");
        System.out.println("Normal:      18.5-24.9");
        System.out.println("Overweight:  25-29.9");
        System.out.println("Obese:       30 or greater");

        input.close();
    }
}
