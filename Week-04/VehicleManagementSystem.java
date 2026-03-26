class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    public Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;
    private int chargingTime;

    public ElectricCar(String vehicleNumber, String brand, int numberOfSeats, boolean ACavailable, double batteryCapacity, int chargingTime) {
        super(vehicleNumber, brand, "Electric", numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Vehicle v = new Vehicle("V-101", "Yamaha", "Petrol");
        Car c = new Car("C-202", "Honda", "Diesel", 5, true);
        ElectricCar ec = new ElectricCar("EC-303", "Tesla", 4, true, 85.5, 6);

        System.out.println("--- Generic Vehicle ---");
        v.displayDetails();

        System.out.println("\n--- Standard Car ---");
        c.displayDetails();

        System.out.println("\n--- Electric Car ---");
        ec.displayDetails();

        System.out.println("\n--- Upcasting Demo ---");
        Vehicle upcastedVehicle = new Car("UP-001", "Ford", "Petrol", 7, false);
        upcastedVehicle.displayDetails();

        System.out.println("\n--- Downcasting and Instanceof Demo ---");
        if (upcastedVehicle instanceof Car) {
            Car downcastedCar = (Car) upcastedVehicle;
            System.out.println("Successfully downcasted to Car.");
            System.out.println("Accessing Car attribute (AC): " + downcastedCar.ACavailable);
        }

        if (ec instanceof Vehicle) {
            System.out.println("Verification: ec is indeed an instance of Vehicle.");
        }
    }
}