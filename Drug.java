public class Drug {
    private int id;
    private String name;
    private Category category;
    private int stock;
    private String code;

    // Constructor Drug
    public Drug(int id, String name, Category category, int stock, String code) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.code = code;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public Category getCategory() { return category; }
    public int getStock() { return stock; }
    public String getCode() {return code; }
    public void updateStock(int quantity) { this.stock += quantity; }
    
    // toString Method
    @Override
    public String toString() {
        return " (" + category + ") "+ name + " - Stock: " + stock;
    }
}
