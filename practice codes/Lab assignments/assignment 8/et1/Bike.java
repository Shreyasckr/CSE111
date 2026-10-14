public class Bike extends Vehicle {
    private String model;
    private boolean sidecar;

    public Bike(String brand, String model, int year, int wheels, boolean sidecar) {
        super(brand, year);
        setWheels(wheels);
        this.model = model;
        this.sidecar = sidecar;
    }

    public void doAWheelie() {
        if (sidecar)
            System.out.println("Wheelie Failed. " + getBrand() + ":" + model + " has SideCar");
        else
            System.out.println(getBrand() + ":" + model + " is doing Wheelie!!");
    }

    @Override
    public String toString() {
        return "Bike Brand: " + getBrand() + ", Year: " + getYear() +
               ", Wheels: " + getWheels() + ", Model: " + model +
               ", SideCar: " + sidecar;
    }
}