
public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    } // constructor
    
    //setter
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    //getter
    public String getPartNumber() {
        return partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        if (quantity < 0) {
            quantity = 0;
        }
        if (pricePerItem < 0.0) {
            pricePerItem = 0.0;
        }
        return quantity * pricePerItem;
    }
}