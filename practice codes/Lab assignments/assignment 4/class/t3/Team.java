public class Team{
    public String name;
    public Player[] players = new Player[11];
    public int count = 0;
    
    public Team(){
    }
    
    public Team(String s){
        name = s;
    }
    
    public void updateName(String s){
        name = s;
    }
    
    public void addPlayer(Player obj){
        players[count] = obj;
        count++;
    }
    
    public void printDetail(){
        System.out.println("Team: " + name);
        System.out.println("List of players:");
        for (int i = 0; i<count; i++) {
            Player p = players[i];
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge() + ", Total Matches: " + p.getMatch());
        }
    }
}