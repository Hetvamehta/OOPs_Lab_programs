import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60.0) {
            return "First Division";
        } else {
            return "Other Division";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double m3 = sc.nextDouble();

        double sum = m1 + m2 + m3;
        double average = sum / 3.0;

        Result res = new Result();
        String division = res.getDivision(average);

        System.out.println("\n--- Result Summary ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Division: " + division);

        sc.close();
    }
}