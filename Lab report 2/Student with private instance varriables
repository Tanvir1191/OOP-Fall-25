import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades = new ArrayList<>();

    // Setters
    public void setStudentId(int id) {
        this.student_id = id;
    }

    public void setStudentName(String name) {
        this.student_name = name;
    }

    // Getters
    public int getStudentId() {
        return student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    // Add grade with validation (0–100 only)
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade! Must be between 0 and 100.");
        }
    }

    // Display all grades
    public void showGrades() {
        System.out.println("Grades: " + grades);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentId(101);
        s.setStudentName("Dear");

        System.out.println("ID: " + s.getStudentId());
        System.out.println("Name: " + s.getStudentName());

        s.addGrade(85);
        s.addGrade(105); // invalid
        s.addGrade(90);
        s.showGrades();
    }
}
