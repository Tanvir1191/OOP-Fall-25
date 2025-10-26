public class Cat {
    // Instance variables
    String name;
    int age;

    // Default constructor
    public Cat() {
        name = "unknown";
        age = 0;
    }

    // Method to display the cat's details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Cat cat1 = new Cat();  // create object using default constructor
        cat1.display();        // print values
    }
}
