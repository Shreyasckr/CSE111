public class Cart{
    public String[] item = new String[3];
    public double[] price = new double[3];
    public int cnum = 0;
    public int count = 0;
    public double discount = 0.0;
    public double total = 0.0;
    
    public void create_cart(int n){
        cnum = n;
    }
    
    public void addItem(String s, double d){
        if(count<3){
            item[count] = s;
            price[count] = d;
            count++;
            total += d;
            System.out.println(s+" added to cart "+cnum+".\nYou have "+count+" item(s) in your cart now.");
        }
        else{
            System.out.println("You already have 3 items in your cart");
        }
    }
    
    public void addItem(double d, String s){
        if(count<3){
            item[count] = s;
            price[count] = d;
            count++;
            total += d;
            System.out.println(s+" added to cart "+cnum+"\nYou have "+count+" item(s) in your cart now");
        }
        else{
            System.out.println("You already have 3 items in your cart");
        }
    }
    
    public void cartDetails(){
        System.out.println("Your cart(c"+cnum+") :");
        for(int i = 0; i<count; i++){
            System.out.println(item[i]+" - "+price[i]);
        }
        System.out.println("Discount Applied: "+discount+"%");
        System.out.println("Total price: "+total);
    }
    
    public void giveDiscount(double d){
        discount = d;
        total -= total*(d/100);
    }
}