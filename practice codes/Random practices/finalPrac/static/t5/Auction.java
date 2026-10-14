public class Auction{
    public String name;
    public int price;
    public String high;
    public boolean sold = false;
    
    public static Auction[] auc = new Auction[2];
    public static int count = 0;
    
    public Auction(String s, int n){
        name = s;
        price = n;
        auc[count++] = this;
        System.out.println("Item listed: "+name+" (Starting: "+price+")");
    }
    
    public void placeBid(String s, int n){
        if(price<n){
            price = n;
            high = s;
            System.out.println(s+" bids "+n+" on "+name+". [New higest!]");
        }
        else{
            System.out.println(s+"'s bid "+n+" is too low for "+name+".");
        }
    }
    
    public void close(){
        if(sold){
            System.out.println(name+" auction already closed.");
        }
        else{
            System.out.println(name+" SOLD to "+high+" for "+price);
            sold = true;
        }
    }
    
    public static void auctionSummary(){
        if(count == 0){
            System.out.println("No items in auction.");
        }
        else{
            System.out.println("Active Items: "+count);
            for(int i = 0; i<count; i++){
                System.out.println("Item: "+auc[i].name+" | Top Bid: "+auc[i].price+" by "+auc[i].high);
            }
        }
    }
}