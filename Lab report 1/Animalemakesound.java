// Parent class
public class Animal {

    // Method in parent class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Main method to test
    public static void main(String[] args) {
        // Create object of Cat class
        Cat cat1 = new Cat();
        cat1.makeSound(); // Calls overridden method in Cat class
    }
}

// Subclass
class Cat extends Animal {

    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}
