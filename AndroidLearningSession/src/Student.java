
public class Student {
    // Private properties to hold the student name and grade
    private String name;
    private String grade;

    // This is Constructor to initialize the student name and grade
    public Student(String name, String grade) {
        this.name = name;
        setGrade(grade); // Use the setGrade method to ensure grade is valid
    }

    // Method to get the student name
    public String getName() {
        return name;
    }

    // Method to set the student name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the student grade
    public String getGrade() {
        return grade;
    }

    // Method to set the student grade
    public void setGrade(String grade) {
        // Ensure the grade is valid (A, B, C, D, F)
        if (grade.matches("[A-F]")) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Invalid grade. Valid grades are A, B, C, D, F.");
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Zain S", "A");

        // Print the student name
        System.out.println("Student Name: " + student.getName());

        // Print the student grade
        System.out.println("Student Grade: " + student.getGrade());

        // Set a new name for the student
        student.setName("Ahsan");

        // Set a new grade for the student
        student.setGrade("B");

        // Print the updated student name
        System.out.println("Updated Student Name: " + student.getName());

        // Print the updated student  grade
        System.out.println("Updated Student Grade: " + student.getGrade());


    }
}
