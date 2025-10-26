// Parent class
public class Vehicle {

    // Method in parent class
    public void drive() {
        System.out.println("Driving a vehicle");
    }

    // Main method to test
    public static void main(String[] args) {
        // Create object of subclass
        Car car1 = new Car();
        car1.drive(); // Calls overridden method from Car class
    }
}

// Subclass
class Car extends Vehicle {

    // Overriding the drive() method
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
