public class Product{
    public static String[] item = new String[3];
    public static int[] quan = new int[3];
    public static int count = 0;
    
    public Product(String s, int n){
        if(count<3){
            item[count] = s;
            quan[count++] = n;
            System.out.println("Stored: "+s);
        }
        else{
            System.out.println("Storage is full! Cannot add "+s);
        }
    }
    
    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for(int i = 0; i<3; i++){
            System.out.println(item[i]+" - Qty: "+quan[i]);
        }
    }
    
    public static void buy(String s, int n){
        boolean found = false;
        for(int i = 0; i<3; i++){
            if(s.equals(item[i])){
                found = true;
                if(quan[i]>=n){
                    System.out.println("Product Sold");
                    quan[i] -= n;
                }
                else{
                    System.out.println("Quantity low");
                }
            }
        }
        if(!found){
            System.out.println("Product not found");
        }
    }
}