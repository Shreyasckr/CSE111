public class Electronics extends Product{
    public int Warranty;
    
    public Electronics(String s1, double d, int s2){
        super(s1, d);
        Warranty = s2;
    }
    
    public void displayInfo(){
        System.out.println("Electronics: " + productName + ", Price: $" + price+", Warranty: " + Warranty+" months");
    }
    public void displayInfo(boolean b){
        Warranty = 12;
        System.out.println("Electronics: " + productName +", Warranty: " + Warranty+" months");
    }
}