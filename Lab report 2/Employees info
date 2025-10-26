public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Setters
    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    // Getter for id and name
    public int getEmployeeId() {
        return employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    // Getter for salary (returns formatted string)
    public String getEmployeeSalary() {
        return String.format("$%.2f", employee_salary);
    }

    // Setter for salary (optional for initialization)
    public void setEmployeeSalary(double salary) {
        this.employee_salary = (salary >= 0) ? salary : 0;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(101);
        e.setEmployeeName("Dear");
        e.setEmployeeSalary(55000.5);

        System.out.println("ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getEmployeeSalary());
    }
}
