public class Game{
    private String name;
    private int gb;
    
    public Game(String s, int n){
        name = s;
        gb = n;
    }
    
    public String getName(){
        return name;
    }
    public int getGB(){
        return gb;
    }
}