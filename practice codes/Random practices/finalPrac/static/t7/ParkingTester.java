public class ParkingTester {
    public static void main(String[] args) {
        System.out.println("Capacity: " + ParkingLot.capacity);
        System.out.println("Spots Available: " + ParkingLot.spotsAvailable());
        System.out.println("=====1=====");
        ParkingLot car1 = new ParkingLot("DHA-1234", "Adib", 2);
        ParkingLot car2 = new ParkingLot("CHT-5678", "Borna", 5);
        ParkingLot car3 = new ParkingLot("SYL-0001", "Caren", 1);
        System.out.println("=====2=====");
        ParkingLot.park(car1);
        ParkingLot.park(car2);
        ParkingLot.park(car3);
        System.out.println("=====3=====");
        ParkingLot car4 = new ParkingLot("KHU-9999", "Dion", 4);
        ParkingLot car5 = new ParkingLot("BAR-3333", "Elena", 3);
        ParkingLot.park(car4);
        ParkingLot.park(car5);
        System.out.println("=====4=====");
        System.out.println("Spots Available: " + ParkingLot.spotsAvailable());
        System.out.println("=====5=====");
        ParkingLot.leave("CHT-5678");
        System.out.println("=====6=====");
        ParkingLot.leave("SYL-0001");
        System.out.println("=====7=====");
        ParkingLot.leave("XXX-0000");
        System.out.println("=====8=====");
        System.out.println("Spots Available: " + ParkingLot.spotsAvailable());
        System.out.println("Total Fines: " + ParkingLot.totalFines + " taka");
    }
}

//Capacity: 4
//Spots Available: 4
//=====1=====
//=====2=====
//DHA-1234 parked by Adib.
//CHT-5678 parked by Borna.
//SYL-0001 parked by Caren.
//=====3=====
//KHU-9999 parked by Dion.
//Lot is full! Cannot park BAR-3333.
//=====4=====
//Spots Available: 0
//=====5=====
//CHT-5678 left. Fine charged: 100 taka.
//=====6=====
//SYL-0001 left. No fine.
//=====7=====
//Car not found.
//=====8=====
//Spots Available: 2
//Total Fines: 100 taka