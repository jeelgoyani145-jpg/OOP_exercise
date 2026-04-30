abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    public String fuelType() { return "Petrol/Diesel"; }
    public int noOfWheels() { return 4; }
}

class Bike extends Vehicle {
    public String fuelType() { return "Petrol"; }
    public int noOfWheels() { return 2; }
}

public class pra18 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Car -> Fuel: " + car.fuelType() + ", Wheels: " + car.noOfWheels());
        Vehicle bike = new Bike();
        System.out.println("Bike -> Fuel: " + bike.fuelType() + ", Wheels: " + bike.noOfWheels());
    }
}
