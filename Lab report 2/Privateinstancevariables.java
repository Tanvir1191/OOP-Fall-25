public class BankAccount {
    // Private instance variables
    private String accountNumber;
    private double balance;

    // Default constructor
    public BankAccount() {}

    // Parameterized constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Setting to 0.");
            this.balance = 0;
        }
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create object using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.setAccountNumber("ACC1001");
        acc1.setBalance(5000.75);
        acc1.displayInfo();

        System.out.println("------------------------");

        // Create object using parameterized constructor
        BankAccount acc2 = new BankAccount("ACC2002", 12000.50);
        acc2.displayInfo();

        System.out.println("------------------------");

        // Test invalid balance
        acc2.setBalance(-300);
        acc2.displayInfo();
    }
}
