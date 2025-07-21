
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1234", "Shoe", 2, 3.20);

        System.out.printf("Part Number: %s%n", invoice1.getPartNumber());
        System.out.printf("Description: %s%n", invoice1.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice1.getQuantity());
        System.out.printf("Price per Item: $%.2f%n", invoice1.getPricePerItem());
        System.out.printf("Total Invoice Amount: $%.2f%n", invoice1.getInvoiceAmount());
    }
}
