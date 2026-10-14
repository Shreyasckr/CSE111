public class TaxiTester{
    public static void main(String args []){
        Taxi t1 = new Taxi("MX8190", "Gulshan");
        Passenger p1 = new Passenger("Ali", 20);
        Passenger p2 = new Passenger("Mifta", 45);
        Passenger p3 = new Passenger("Marzan", 32);
        System.out.println("1------------");
        t1.showTaxi();
        System.out.println("2------------");
        p1.info();
        p2.info(); 
        System.out.println("3------------");
        t1.addPassenger(p1);
        t1.addPassenger(p2); 
        t1.addPassenger(p3);
        System.out.println("4------------"); 
        t1.showTaxi();
    }
}

