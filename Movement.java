import java.time.LocalDate;

public class Movement  {
    private Drug drug;
    private int quantity;
    private LocalDate date;

    // Constructor Movement
    public Movement(Drug drug, int quantity, LocalDate date) {
        this.drug = drug;
        this.quantity = quantity;
        this.date = date;
        drug.updateStock(quantity);
    }

    // toString Method
    @Override
    public String toString() {
        return date + ": " + drug + " Quantity: " + quantity;
    }
}
