public class GamingMonitor{
    public static int totalMonitors = 0;
    public static double totalRevenue = 0.0;
    
    public String model;
    private int hz;
    private double price;
    public String type = "Standard";
    
    public GamingMonitor(String s, int n, double d){
        model = s;
        price = d;
        setRefreshRate(n);
        totalMonitors++;
        totalRevenue += d;
    }
    
    public int getRefreshRate(){
        return hz;
    }
    public void setRefreshRate(int n){
        hz = n;
        if(n>=144){
            type = "Esports Ready";
        }
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double d){
        totalRevenue -= price;
        price = d;
        totalRevenue += price;
    }
    
    public void printDetails(){
        System.out.println("Model: "+model);
        System.out.println("Refresh Rate: "+hz+"Hz ("+type+")");
        System.out.println("Price: $"+price);
    }
}