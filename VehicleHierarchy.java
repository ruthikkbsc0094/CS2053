class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("🚗 Vehicle Info");
        System.out.println("Brand: " + brand);
        System.out.println("Year : " + year);
    }
}

class Car extends Vehicle {
    int wheels;

    Car(String brand, int year, int wheels) {
        super(brand, year);
        this.wheels = wheels;
    }

    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Wheels: " + wheels);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int year, int wheels, int batteryCapacity) {
        super(brand, year, wheels);
        this.batteryCapacity = batteryCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh ⚡");
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 2023, 4, 100);
        tesla.displayInfo();
    }
}

