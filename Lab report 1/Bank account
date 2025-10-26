public class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100)
            System.out.println("Cannot withdraw! Minimum $100 must remain.");
        else
            balance -= amount;
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(500);
        acc.withdraw(450); // Blocked
        acc.withdraw(300); // Allowed
        acc.deposit(200);
        System.out.println("Final Balance: $" + acc.balance);
    }
}
