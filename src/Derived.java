//Base Vehicle class
class Vehicle {
    // class attributes
    protected String model;
    protected double speed;

    // constructor without parameters
    public Vehicle() {
        super();
    }
    // constructor(s) using parameter(s)
    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}

// Derived Class
class Car extends Vehicle {

    private String name;

    // Default Constructor
    public Car() {
        super();
    }

    // constructor(s) using parameter(s)
    public Car(String model, double speed, String name){
        super(model,speed);
        this.name = name;
    }

    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
        this.name = name;
    }

    // This function calls the Base class functions and appends the result with the input
    public String getDetails(String carName) {
        // calling Base Class Function
        String message = "Name "+carName+super.toString();
        return (message);
    }

}