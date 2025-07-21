import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter -1 for miles to quit.");

        while (true) {
            System.out.print("\nEnter miles driven: ");
            miles = input.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            if (gallons <= 0) {
                System.out.println("Gallons must be greater than 0.");
                continue;
            }

            double tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);

            totalMiles += miles;
            totalGallons += gallons;

            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n", combinedMPG);
        }

        if (totalGallons > 0) {
            System.out.printf("%nFinal combined miles per gallon: %.2f%n", 
                              (double) totalMiles / totalGallons);
        } else {
            System.out.println("No data entered.");
        }

        input.close();
    }
}
