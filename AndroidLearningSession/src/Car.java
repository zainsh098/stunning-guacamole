/**
 * The Car class encapsulates the car's make, model, and mileage.
 * It provides methods to set and get the car's make, model, and mileage.
 */
public class Car {
    // Private properties to hold the car make, model, and mileage
    private String make;
    private String model;
    private int mileage;

    // Constructor to initialize the car make, model, and mileage
    public Car(String make, String model, int mileage) {
        this.make = make;
        this.model = model;
        setMileage(mileage); // Use the setMileage method to ensure the mileage is valid
    }

    // Method to get the car make
    public String getMake() {
        return make;
    }

    // Method to set the car make
    public void setMake(String make) {
        this.make = make;
    }

    // Method to get the car model
    public String getModel() {
        return model;
    }

    // Method to set the car model
    public void setModel(String model) {
        this.model = model;
    }

    // Method to get the car mileage
    public int getMileage() {
        return mileage;
    }

    // Method to set the car mileage
    public void setMileage(int mileage) {
        // Ensure the mileage is not negative
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            throw new IllegalArgumentException("Mileage must be non-negative.");
        }
    }
}
class  MainCar{

    public static void main(String[] args) {
        // Create a new instance of Car with make "Toyota", model "Corolla", and mileage 50000
        Car car = new Car("Toyota", "Corolla", 50000);

        // Print the car's make
        System.out.println("Car Make: " + car.getMake());

        // Print the car's model
        System.out.println("Car Model: " + car.getModel());

        // Print the car's mileage
        System.out.println("Car Mileage: " + car.getMileage());

        // Set a new make for the car
        car.setMake("Honda");

        // Set a new model for the car
        car.setModel("Civic");


        car.setMileage(30000);

        // Print the updated car make
        System.out.println("Updated Car Make: " + car.getMake());

        // Print the updated car model
        System.out.println("Updated Car Model: " + car.getModel());

        // Print the updated car mileage
        System.out.println("Updated Car Mileage: " + car.getMileage());




    }

}