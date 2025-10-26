// Parent class
public class Employee {

    // Method in parent class
    public void work() {
        System.out.println("Employee is working");
    }

    // Another method in parent class
    public double getSalary() {
        return 40000; // Example base salary
    }

    // Main method to test
    public static void main(String[] args) {
        // Create object of HRManager subclass
        HRManager hr = new HRManager();

        // Call methods
        hr.work();           // Overridden method
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();    // New method in subclass
    }
}

// Subclass
class HRManager extends Employee {

    // Overriding the work() method
    @Override
    public void work() {
        System.out.println("HR Manager is managing employees");
    }

    // New method specific to HRManager
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}
