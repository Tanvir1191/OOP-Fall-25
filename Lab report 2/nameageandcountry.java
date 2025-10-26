public class Person {
    // Private instance variables (Encapsulation)
    private String name;
    private int age;
    private String country;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter and Setter for 'country'
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object using default constructor
        Person p1 = new Person();
        p1.setName("Dear");
        p1.setAge(22);
        p1.setCountry("Bangladesh");
        p1.displayInfo();

        System.out.println("--------------------");

        // Create an object using parameterized constructor
        Person p2 = new Person("Alice", 25, "Japan");
        p2.displayInfo();
    }
}
