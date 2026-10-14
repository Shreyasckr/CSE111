public class Toy{
    public String name;
    public int price;
    public Toy(String s, int n){
        name = s;
        price = n;
        System.out.println("A new toy has been made!");
    }
    
    public void updateName(String s){
        String temp = name;
        name = s;
        System.out.println("Changing old name: "+temp+"\n"+"new name: "+s);
    }
    
    public void updatePrice(int n){
        price = n;
    }
    
    public void showPrice(){
        System.out.println("price: "+price+" Taka");
    }
}