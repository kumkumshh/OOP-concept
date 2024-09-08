// Base class Employee
abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary(int hoursWorked);
}

// Full-time employee with fixed salary
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return monthlySalary;  // Fixed salary regardless of hours
    }
}

// Part-time employee with hourly rate
class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;  // Payment based on hours worked
    }
}

// Main class to demonstrate employee management
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 101, 3000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 20);

        System.out.println("Full-time Employee Salary: " + fullTimeEmployee.calculateSalary(160));
        System.out.println("Part-time Employee Salary: " + partTimeEmployee.calculateSalary(120));
    }
}
