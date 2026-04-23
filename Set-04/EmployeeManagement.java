public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Hetva-25");

        Employee emp = new Employee("John Doe", "IT Operations");
        Manager mgr = new Manager("Jane Smith", "Software Engineering", 15);

        emp.displayDetails();
        System.out.println("------------------------------");
        mgr.displayDetails();
    }
}

class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String department, int teamSize) {
        super(name, department);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}