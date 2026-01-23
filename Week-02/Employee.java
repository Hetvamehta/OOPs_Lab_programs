import java.util.Scanner;

public class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter employee name: ");
            employeeName = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            employeeSalary = scanner.nextDouble();
        }
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}