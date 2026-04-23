abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Vehicle myCar = new Car();
        System.out.println("Car Fuel Type: " + myCar.fuelType());
        System.out.println("Car Wheels: " + myCar.noOfWheels());

        Vehicle myBike = new Bike();
        System.out.println("Bike Fuel Type: " + myBike.fuelType());
        System.out.println("Bike Wheels: " + myBike.noOfWheels());
    }
}