import java.util.Scanner;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class ExamPortal implements Exam, Classify {

    @Override
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    @Override
    public String getDivision(double average) {
        return (average >= 60.0) ? "First Division" : "Other Division";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExamPortal portal = new ExamPortal();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        int sum = m1 + m2 + m3;
        double avg = sum / 3.0;

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + avg);
        
        System.out.println("Subject 1 Passed: " + portal.isPassed(m1));
        System.out.println("Subject 2 Passed: " + portal.isPassed(m2));
        System.out.println("Subject 3 Passed: " + portal.isPassed(m3));
        
        System.out.println("Final Division: " + portal.getDivision(avg));

        sc.close();
    }
}