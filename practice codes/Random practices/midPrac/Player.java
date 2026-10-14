public class Player{
    public String name;
    public int age;
    public String[] cup = new String[4];
    public int[] quan = new int[4];
    public int count;
    public int total;
    
    public Player(String s, int n){
        name = s;
        age = n;
        System.out.println("Player created!");
    }
    
    public void addAward(String s, int n){
        if(count != 4){
            cup[count] = s;
            quan[count++] = n;
            System.out.println(s+" added to award list of "+name);
            total += n;
        }
        else{
            System.out.println("Cannot add more awards");
        }
    }
    
    public void addAward(String s1, int n1, String s2, int n2){
        addAward(s1, n1);
        addAward(s2, n2);
    }
    
    public String totalAwards(){
        return "Total award of "+name+" : "+total;
    }
    
    public String clearAwards(){
        for(int i = 0; i<count; i++){
            cup[i] = null;
            quan[i] = 0;
            total = 0;
        }
        return "All awards of "+name+" have been cleared.";
    }
    
    public void display(){
        System.out.println("Name: "+name+", Age: "+age);
        if(total>0){
            System.out.println("Award List:");
            for(int i = 0; i<count; i++){
                System.out.println(cup[i]+": "+quan[i]);
            }
        }
    }
}