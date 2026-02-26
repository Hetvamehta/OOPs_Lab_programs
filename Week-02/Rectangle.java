public class Rectangle {
    double width = 1.0;
    double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("The area of a rectangle with width " + rect1.width + " and height " + rect1.height + " is " + rect1.getArea());
        System.out.println("The perimeter of a rectangle is " + rect1.getPerimeter());

        System.out.println("The area of a rectangle with width " + rect2.width + " and height " + rect2.height + " is " + rect2.getArea());
        System.out.println("The perimeter of a rectangle is " + rect2.getPerimeter());
    }
}