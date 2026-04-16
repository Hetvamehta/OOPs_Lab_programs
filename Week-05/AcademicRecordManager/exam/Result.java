package exam;

import student.Student;

public class Result extends Student {
    private int marks1;
    private int marks2;
    private int marks3;

    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("----- Student Mark Sheet -----");
        displayStudent();
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f%n", average);
    }

    public static void main(String[] args) {
        Result studentResult = new Result(25, "Hetva", 86, 92, 88);
        studentResult.displayResult();
    }
}
