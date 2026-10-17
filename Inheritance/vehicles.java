// parent class  then child class which inherits parent class 
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println(brand);
    }
}
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDoors() {
        System.out.println(numberOfDoors);
    }
}