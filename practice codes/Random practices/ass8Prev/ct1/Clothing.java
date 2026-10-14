public class Clothing extends Product{
    public String size;
    
    public Clothing(String s1, double d, String s2){
        super(s1, d);
        size = s2;
    }
    
    public void displayInfo(){
        System.out.println("Clothing: " + productName + ", Price: $" + price+", Size: " + size);
    }
}