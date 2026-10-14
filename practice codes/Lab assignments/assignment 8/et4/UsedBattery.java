public class UsedBattery extends Waste{
    public boolean leak;
    public String type = "BATTERY";
    
    public UsedBattery(String s, boolean b){
        super(s);
        leak = b;
    }
}