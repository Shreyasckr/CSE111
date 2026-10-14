public class PlasticBottle extends Waste{
    public int ml;
     public String type = "PLASTIC";
    
    public PlasticBottle(String s, int n){
        super(s);
        ml = n;
    }
}