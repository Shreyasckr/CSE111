public class ParkingLot {
    public static int capacity = 4;
    public static int totalFines = 0;
    private static ParkingLot[] parkedCars = new ParkingLot[capacity];
    private static int parkedCount = 0;

    private String plate;
    private String owner;
    private int hours;

    public ParkingLot(String plate, String owner, int hours) {
        this.plate = plate;
        this.owner = owner;
        this.hours = hours;
    }

    public static void park(ParkingLot car) {
        if (parkedCount >= capacity) {
            System.out.println("Lot is full! Cannot park " + car.plate + ".");
        } else {
            parkedCars[parkedCount] = car;
            parkedCount++;
            System.out.println(car.plate + " parked by " + car.owner + ".");
        }
    }

    public static void leave(String plate) {
        for (int i = 0; i < parkedCount; i++) {
            if (parkedCars[i].plate.equals(plate)) {
                if (parkedCars[i].hours > 3) {
                    int fine = (parkedCars[i].hours - 3) * 50;
                    totalFines += fine;
                    System.out.println(plate + " left. Fine charged: " + fine + " taka.");
                } else {
                    System.out.println(plate + " left. No fine.");
                }
                
                for (int j = i; j < parkedCount - 1; j++) {
                    parkedCars[j] = parkedCars[j + 1];
                }
                parkedCars[parkedCount - 1] = null;
                parkedCount--;
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public static int spotsAvailable() {
        return capacity - parkedCount;
    }
}