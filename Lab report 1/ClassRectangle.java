public class Rectangle {

    // Instance variables
    private double length;
    private double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Copy constructor
    public Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println();
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Create object using parameterized constructor
        Rectangle rect1 = new Rectangle(10.5, 5.2);

        // Create another object using copy constructor
        Rectangle rect2 = new Rectangle(rect1);

        // Display both objects
        System.out.println("Rectangle 1:");
        rect1.display();

        System.out.println("Rectangle 2 (Copied from Rectangle 1):");
        rect2.display();
    }
}
