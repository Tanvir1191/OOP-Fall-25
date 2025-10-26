public class Book {
    private String title;
    private String author;
    private double price;

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = (price >= 0) ? price : 0;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Method to apply discount
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price -= price * (percent / 100);
            System.out.println("Discount applied: " + percent + "%");
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Effective Java");
        b.setAuthor("Joshua Bloch");
        b.setPrice(1000);

        System.out.println("Book: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price before discount: " + b.getPrice());

        b.applyDiscount(10); // Apply 10% discount
        System.out.println("Price after discount: " + b.getPrice());
    }
}
