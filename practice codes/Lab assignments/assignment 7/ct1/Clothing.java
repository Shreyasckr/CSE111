public class Clothing extends Product{
    public String size;
    
    public Clothing(String n, double d, String s){
        super(n, d);
        size = s;
    }
    
    public void displayInfo(){
        System.out.println("Clothing: " + productName + ", Price: $" + price+", Size: "+size);
    }
}