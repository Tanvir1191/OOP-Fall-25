public class Student {

    // Instance variables
    private int studentId;
    private String studentName;
    private char grade;

    // Default constructor
    public Student() {
        // Call the parameterized constructor using constructor chaining
        this(0, "Unknown", 'N');
    }

    // Parameterized constructor
    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();

        // Using parameterized constructor
        Student s2 = new Student(101, "Alice", 'A');

        // Display both objects
        System.out.println("Student 1 (Default Constructor):");
        s1.display();

        System.out.println("Student 2 (Parameterized Constructor):");
        s2.display();
    }
}
