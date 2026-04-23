import java.util.Scanner;

class Triangle {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public boolean isValid() {
        return (sideA + sideB > sideC) && 
               (sideA + sideC > sideB) && 
               (sideB + sideC > sideA);
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Java OOP Triangle Calculator ---");

        System.out.print("Enter side 1: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double c = scanner.nextDouble();

        Triangle myTriangle = new Triangle(a, b, c);

        if (myTriangle.isValid()) {
            double area = myTriangle.calculateArea();
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Error: These sides cannot form a valid triangle.");
        }
        
        scanner.close();
    }
}