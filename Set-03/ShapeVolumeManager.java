interface Shape3D {
    double calculateVolume();
}

class Cube implements Shape3D {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}

class RectangularCube implements Shape3D {
    private double length;
    private double width;
    private double height;

    public RectangularCube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

class Sphere implements Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class ShapeVolumeManager {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        
        Shape3D cube = new Cube(5.5);
        Shape3D rectCube = new RectangularCube(5.0, 4.0, 3.0);
        Shape3D sphere = new Sphere(3.5);

        System.out.printf("Cube Volume: %.2f%n", cube.calculateVolume());
        System.out.printf("Rectangular Cube Volume: %.2f%n", rectCube.calculateVolume());
        System.out.printf("Sphere Volume: %.2f%n", sphere.calculateVolume());
    }
}