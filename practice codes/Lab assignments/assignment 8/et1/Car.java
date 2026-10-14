public class Car extends Vehicle {
    private String model;
    private int doors;
    private boolean autopilot;

    public Car(String brand, String model, int year, int doors, int wheels, boolean autopilot) {
        super(brand, year);
        setWheels(wheels);
        this.model = model;
        this.doors = doors;
        this.autopilot = autopilot;
    }

    public void startAutoPilot() {
        if (autopilot)
            System.out.println(getBrand() + ":" + model + " AutoPilot Started");
        else
            System.out.println(getBrand() + ":" + model + " has NO AutoPilot");
    }

    @Override
    public String toString() {
        return "Car Brand: " + getBrand() + ", Year: " + getYear() +
               ", Wheels: " + getWheels() + ", Model: " + model +
               ", Doors: " + doors + ", AI: " + autopilot;
    }
}
