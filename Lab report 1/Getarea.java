// Parent class
public class Shape {

    // Method in parent class
    public double getArea() {
        System.out.println("Area of shape is undefined");
        return 0;
    }

    // Main method to test
    public static void main(String[] args) {
        // Create object of Rectangle subclass
        Rectangle rect1 = new Rectangle(10, 5);
        double area = rect1.getArea();

        System.out.println("Area of Rectangle: " + area);
    }
}

// Subclass
class Rectangle extends Shape {

    private double length;
    private double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding getArea() method
    @Override
    public double getArea() {
        return length * width;
    }
}
