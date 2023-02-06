
// base class : computer
public class Computer {
    // class attributes
    protected String brand;
    protected String model;
    protected int yearOfRelease;
    // constructor without parameters
    public Computer() {
        super();
    }

    //  constructor(s) using parameter(s)
    public Computer(String brand, String model, int yearOfRelease) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    // class methods
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}

