class Car {
    String brand;
    String color;

    void drive() {
        System.out.println(brand + " is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.color = "Red";

        car1.drive();
    }
}