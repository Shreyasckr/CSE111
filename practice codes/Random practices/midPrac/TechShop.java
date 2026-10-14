public class TechShop{
    public String name;
    public Laptop[] lp = new Laptop[10];
    public int stock;
    public int count;
    public Laptop recentSold = null;
    
    public TechShop(String s){
        name = s;
        System.out.println("A tech shop is created named "+name);
    }
    
    public void addLaptop(Laptop obj){
        lp[count++] =  obj;
        stock++;
        System.out.println("Added in stock.");
    }
    
    public void addLaptop(Laptop obj1, Laptop obj2){
        addLaptop(obj1);
        addLaptop(obj2);
    }
    
    public String sellLaptop(Laptop obj){
        for(int i = 0; i<count; i++){
            if(lp[i] == obj){
                if(obj.getcon().equals("good")){
                    lp[i] = null;
                    stock--;
                    recentSold = obj;
                    return "A laptop has been sold";
                }
                else{
                    return "Item defected. Cannot sell.";
                }
            }
        }
        return "";
    }
    
    public void shopDetails(){
        System.out.println("Shop name: "+name);
        System.out.println("No of laptops in stock: " + stock);
        for(int i  = 0; i<count; i++){
            if(lp[i] != null){
                String s = lp[i].details();
                System.out.println(s);
            }
        }
    }
}