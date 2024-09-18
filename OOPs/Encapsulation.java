package OOPs;

class Employee {

    // Private variables - hidden from outside of the class
    private String name;
    private int age;
    private double salary;

    // Getter method for name(To read the private variable)
    public String getName() {
        return name;
    }

    // setter method for name to set the private variable
    public void setName(String name) {
        this.name = name;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // setter method for age
    public void setAge(int age) {
        if (age > 0) {
            // Validating age
            this.age = age;
        } else {
            System.out.println("Please enter a valid age");
        }
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Validating salary
            this.salary = salary;
        } else {
            System.out.println("Please enter a valid salary.");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Employee emp = new Employee();

        // Set values using setter methods
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000.50);

        // Get values using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());

    }

}
