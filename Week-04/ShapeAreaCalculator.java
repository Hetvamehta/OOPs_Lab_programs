abstract class Shape {
    protected double d1;
    protected double d2;

    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public abstract double calculateArea();
}

class Triangle extends Shape {
    @Override
    public double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    @Override
    public double calculateArea() {
        return d1 * d2;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        System.out.println("Hetva-25");

        Triangle triangle = new Triangle();
        triangle.getData(10.0, 5.0);
        
        Rectangle rectangle = new Rectangle();
        rectangle.getData(10.0, 5.0);

        System.out.println(triangle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}