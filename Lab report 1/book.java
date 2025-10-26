public class Book {

    // Instance variables
    private String title;
    private String author;

    // Constructor 1: Takes both title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor 2: Takes only title (author set to "Unknown")
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using the first constructor
        Book book1 = new Book("The Alchemist", "Paulo Coelho");

        // Using the second constructor
        Book book2 = new Book("Unknown Tales");

        // Display both books
        book1.display();
        book2.display();
    }
}
