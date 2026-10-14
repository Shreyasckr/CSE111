public class Player{
    public String name;
    public int hp = 100;
    public String[] defeated = new String[5];
    public int count = 0;
    
    public Player(String s, int n){
        name = s;
        hp = n;
        System.out.println(s+" joined the game"+"\n"+"HP: "+n);
    }
    
    public Player(String s){
        name = s;
        System.out.println(s+" joined the game"+"\n"+"HP: "+hp);
    }
    
    public void defeatVillain(String s, int n){
        if(hp<n){
            System.out.println("failed to defeat "+s);
        }
        else{
            System.out.println("defeated "+s);
            hp += n;
            defeated[count++] = s;
        }
    }
    
    public void defeatVillain(char c, String s, int n){
        int boost = (c-'0');
        hp *= boost;
        System.out.println("HP with "+boost+"x boost: "+hp);
        if(hp<n){
            System.out.println("failed to defeat "+s);
        }
        else{
            System.out.println("defeated "+s);
            hp += n;
            defeated[count++] = s;
        }
    }
    
    public void defeatVillain(Player obj){
        if(hp<obj.hp){
            System.out.println("failed to defeat "+obj.name);
        }
        else{
            System.out.println("defeated "+obj.name);
            hp += obj.hp;
            defeated[count++] = obj.name;
        }
    }
    
    public void viewInfo(){
        System.out.println("Player Name: "+name);
        System.out.println("Current HP: "+hp);
        if(count>0){
            System.out.println("Defeated: ");
            for(int i = 0; i<count; i++){
                System.out.print(defeated[i]+", ");
            }
            System.out.println();
        }
    }
}