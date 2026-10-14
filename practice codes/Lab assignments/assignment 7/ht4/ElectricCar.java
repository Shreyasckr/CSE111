public class ElectricCar extends Vehicle{
    public static ElectricCar[] ecars = new ElectricCar[3];
    public static int count = 0;
    
    public String id = "";
    public int battery;
    
    public ElectricCar(String s1, int n, int m){
        super(s1, n);
        battery = m;
        ecars[count++] = this;
        vehicleId = "EV000";
        System.out.println("Vehicle  ID: "+vehicleId+" created");
    }
    
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: "+battery+" kWh");
    }
    
    public static void markAsSoldEV(ElectricCar obj){
        for(int i = 0; i<count; i++){
            if(ecars[i] == obj){
                ecars[i].sold = true;
            }
        }
    }
}