public class Player{
    private String name;
    private int age;
    private int match;
    
    public Player(String s, int n, int m){
        name = s;
        age = n;
        match = m;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getMatch(){
        return match;
    }
}