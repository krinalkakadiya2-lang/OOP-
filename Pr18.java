abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class Pr18 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car Fuel Type: " + car.fuelType());
        System.out.println("Car Wheels: " + car.noOfWheels());

        System.out.println("Bike Fuel Type: " + bike.fuelType());
        System.out.println("Bike Wheels: " + bike.noOfWheels());
    }
}

/*
Output:
Car Fuel Type: Petrol/Diesel
Car Wheels: 4
Bike Fuel Type: Petrol
Bike Wheels: 2
*/
