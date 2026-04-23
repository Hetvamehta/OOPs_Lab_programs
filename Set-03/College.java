import java.util.Scanner;

public class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public class Admission {
        private String studentName;
        private String course;

        public void acceptDetails() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter Student Name: ");
                this.studentName = scanner.nextLine();
                System.out.print("Enter Course to Enroll: ");
                this.course = scanner.nextLine();
            }
        }

        public void displayDetails() {
            System.out.println("\n--- Admission Summary ---");
            System.out.println("College: " + collegeName); 
            System.out.println("Student: " + this.studentName);
            System.out.println("Course : " + this.course);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        College techCollege = new College("Saffrony Institute of Technology");
        College.Admission studentAdmission = techCollege.new Admission();
        studentAdmission.acceptDetails();
        studentAdmission.displayDetails();
    }
}