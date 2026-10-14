public class Manager extends SportsPerson{
    private int wins;
    
    public Manager(String teamName, String name, String role, int wins) {
        super(teamName, name, role);
        this.wins = wins;
        this.earningPerMatch = wins * 1000;
    }
    
    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: " + role);
        System.out.println("Total Win: "+wins);
        System.out.println("Match Earnings: " + earningPerMatch);
    }
}