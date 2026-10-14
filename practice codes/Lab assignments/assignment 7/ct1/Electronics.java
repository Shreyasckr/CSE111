public class Electronics extends Product{
    public int war;
    
    public Electronics(String n, double d, int s){
        super(n, d);
        war = s;
    }
    
    public void displayInfo(){
        System.out.println("Electronics: " + productName + ", Price: $" + price+", Warranty: "+war+" months");
    }
    public void displayInfo(boolean b){
        System.out.println("Electronics: " + productName +", Warranty: "+war+" months");
    }
}