public class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0; // default speed is 0
    }

    // Methods
    public void start() {
        System.out.println(brand + " " + model + " started.");
    }

    public void accelerate() {
        speed += 10;
        System.out.println(brand + " " + model + " accelerated to " + speed + " km/h.");
    }

    public void brake() {
        if (speed >= 10) {
            speed -= 10;
        } else {
            speed = 0;
        }
        System.out.println(brand + " " + model + " slowed to " + speed + " km/h.");
    }

    public void displayInfo() {
        System.out.println("Car Info: " + year + " " + brand + " " + model + ", Current Speed: " + speed + " km/h");
    }

    // Main method to demonstrate behavior
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Tesla", "Model Y", 2023);

        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.displayInfo();

        System.out.println();

        car2.start();
        car2.accelerate();
        car2.brake();
        car2.displayInfo();
    }
}

