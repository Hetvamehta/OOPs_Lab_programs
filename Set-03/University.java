public class University {
    static int totalStudents = 0;
    static String universityName;

    static {
        universityName = "Global Tech University";
        System.out.println("Static Block: University name initialized to " + universityName);
    }

    {
        totalStudents++;
        System.out.println("Instance Block: A new student object is being created.");
    }

    public University() {
        System.out.println("Constructor: Student successfully enrolled.");
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        System.out.println("Main Method: Starting execution...");
        System.out.println("Welcome to " + University.universityName);
        
        System.out.println("\n--- Creating Student 1 ---");
        new University();
        
        System.out.println("\n--- Creating Student 2 ---");
        new University();
        
        System.out.println("\nTotal Students Enrolled: " + University.getTotalStudents());
    }
}