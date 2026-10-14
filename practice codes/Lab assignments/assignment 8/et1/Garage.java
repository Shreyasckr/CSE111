public class Garage {
    public Car[] cars;
    public Bike[] bikes;
    private int carCount = 0;
    private int bikeCount = 0;

    public Garage(int carCapacity, int bikeCapacity) {
        cars = new Car[carCapacity];
        bikes = new Bike[bikeCapacity];
        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + carCapacity);
        System.out.println("Bike Capacity: " + bikeCapacity);
    }

    public void addVehicle(Vehicle v) {
        if (v instanceof Car) {
            Car c = (Car) v;
            if (carCount < cars.length) {
                cars[carCount++] = c;
                System.out.println("A " + c.getBrand() + " CAR has been added to the Garage");
            } else {
                System.out.println("Can't add more Cars! Capacity: " + cars.length);
            }
        } else if (v instanceof Bike) {
            Bike b = (Bike) v;
            if (bikeCount < bikes.length) {
                bikes[bikeCount++] = b;
                System.out.println("A " + b.getBrand() + " BIKE has been added to the Garage");
            } else {
                System.out.println("Can't add more bikes! Capacity: " + bikes.length);
            }
        }
    }
}