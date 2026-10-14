public class Car extends Vehicle{
    public static int ID = 1;
    public static Car[] cars = new Car[3];
    public static int count = 0;
    
    public String id = "";
    public int seat;
    
    public Car(String s1, int n, int m){
        super(s1, n);
        seat = m;
        cars[count++] = this;
        vehicleId = "CAR00"+ID;
        ID++;
        System.out.println("Vehicle  ID: "+vehicleId+" created");
    }
    
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Regular Car");
        System.out.println("Seats: "+seat);
    }
    
    public static void markAsSold(Car obj){
        for(int i = 0; i<count; i++){
            if(cars[i] == obj){
                cars[i].sold = true;
            }
        }
    }
    
    public static void showAllAvailableCars(){
        System.out.println("Total Car: "+count);
        System.out.println("Available Cars:");
        for(int i = 0; i<count; i++){
            if(cars[i].sold == false){
                System.out.println(cars[i].vehicleId+" : "+cars[i].model);
            }
        }
    }
    
    public static void showAllCars(){
        System.out.println("Total Car: "+count);
        for(int i = 0; i<count; i++){
            boolean x  = cars[i].sold;
            String s = "available";
            if(x==true){
                s = "sold";
            }
            System.out.println(cars[i].vehicleId+" : "+cars[i].model+" - "+s);
        }
    }
}