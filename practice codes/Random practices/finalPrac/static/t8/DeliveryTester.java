public class DeliveryTester {
    public static void main(String[] args) {
        Courier c1 = new Courier("TRK001", "Mirpur", 3.5);
        Courier c2 = new Courier("TRK002", "Gulshan", 8.0);
        Courier c3 = new Courier("TRK003", "Dhanmondi", 5.0);
        Courier c4 = new Courier("TRK004", "Banani", 6.5);
        Courier c5 = new Courier("TRK005", "Uttara", 7.0);
        System.out.println("=====1=====");
        Deliverer d1 = new Deliverer("Karim");
        System.out.println("=====2=====");
        d1.assign(c1);
        d1.assign(c2);
        System.out.println("=====3=====");
        d1.viewRoute();
        System.out.println("=====4=====");
        Deliverer d2 = new Deliverer("Rahim");
        d2.assign(c3);
        d2.assign(c4);
        d2.assign(c5);
        System.out.println("=====5=====");
        d2.viewRoute();
        System.out.println("=====6=====");
        Deliverer.compare(d1, d2);
    }
}


//=====1=====
//Deliverer ID: 1, Name: Karim - ready for duty!
//=====2=====
//Karim assigned: TRK001 ? Mirpur
//Karim assigned: TRK002 ? Gulshan
//=====3=====
//Karim's Route Code: D1
//TRK001 ? Mirpur (3.5 kg)
//TRK002 ? Gulshan (8.0 kg)
//Total Weight: 11.5 kg
//=====4=====
//Deliverer ID: 2, Name: Rahim - ready for duty!
//Rahim assigned: TRK003 ? Dhanmondi
//Rahim assigned: TRK004 ? Banani
//Rahim assigned: TRK005 ? Uttara
//=====5=====
//Rahim's Route Code: D2
//TRK003 ? Dhanmondi (5.0 kg)
//TRK004 ? Banani (6.5 kg)
//TRK005 ? Uttara (7.0 kg)
//Total Weight: 18.5 kg
//=====6=====
//Delivery Comparison
//Karim's total weight: 11.5
//Rahim's total weight: 18.5
//Rahim takes the heavier load!