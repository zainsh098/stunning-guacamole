
public class Employee {
    // Private properties to hold the employee name, position, and salary
    private String name;
    private String position;
    private double salary;

    // Constructor to initialize the employee name, position, and salary
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        setSalary(salary); // Use the setSalary method to ensure the salary is valid
    }

    // Method to get the employee name
    public String getName() {
        return name;
    }

    // Method to set the employee name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the employee position
    public String getPosition() {
        return position;
    }

    // Method to set the employee position
    public void setPosition(String position) {
        this.position = position;
    }

    // Method to get the employee salary
    public double getSalary() {
        return salary;
    }

    // Method to set the employee salary
    public void setSalary(double salary) {
        // Ensure the salary is positive
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be positive.");
        }
    }
}


class   Main
{
public static void main(String[] args) {


    // Create a new instance of Employee
    Employee employee = new Employee("Zain Shakoor", "Manager", 90000.0);

    // Print the employee name
    System.out.println("Employee Name: " + employee.getName());

    // Print the employee position
    System.out.println("Employee Position: " + employee.getPosition());

    // Print the employee salary
    System.out.println("Employee Salary: " + employee.getSalary());

    // Set a new name for the employee
    employee.setName("Ahsan Shakoor");

    // Set a new position for the employee
    employee.setPosition("Director Finance");

    // Set a new salary for the employee
    employee.setSalary(6000000.0);

    // Print the updated employee name
    System.out.println("Updated Employee Name: " + employee.getName());

    // Print the updated employee position
    System.out.println("Updated Employee Position: " + employee.getPosition());

    // Print the updated employee salary
    System.out.println("Updated Employee Salary: " + employee.getSalary());


}}


