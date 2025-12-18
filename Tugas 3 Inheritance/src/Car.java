public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public String getInfo() {
        return "Car: " + brand + " " + model + " (" + year + "), Doors: " + doors;
    }
}
