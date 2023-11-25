class Car {
    private String brand; // instance variable

    Car(String brand) {
        this.brand = brand; // using this to refer to the instance variable
    }

    String getBrand() {
        return brand;
    }

    void displayInfo(String brand) {
        System.out.println("Local variable brand: " + brand);
        System.out.println("Instance variable brand: " + this.brand);
    }
}

class Driver {
    private String name;

    Driver(String name) {
        this.name = name;
    }

    void driveCar(Car car) {
        System.out.println(this.name + " is driving a " + car.getBrand() + " car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("BMW");

        car1.displayInfo("Honda");
        System.out.println();

        car2.displayInfo("Mercedes");
        System.out.println();

        Driver driver1 = new Driver("Aryan");
        Driver driver2 = new Driver("Kritika");

        driver1.driveCar(car1);
        driver2.driveCar(car2);
    }
}

