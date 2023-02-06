public class Laptop extends Computer{
    // class attributes
    private double storage;

    // constructor without parameter
    public Laptop() {
        super();
    }

    // constructor(s) using parameter(s)
    public Laptop(double storage) {
        super();
        this.storage = storage;
    }
    public Laptop(String brand, String model, int yearOfRelease, double storage) {
        super(brand, model, yearOfRelease);
        this.storage = storage;
    }

    // getters and setters
    public double getStockage() {
        return storage;
    }

    public void setStockage(double storage) {
        this.storage = storage;
    }

    // class Methods
    public String getDetails() {
        // calling Base Class Function
        String message = "Storage "+storage+super.toString();
        return (message);
    }
}
