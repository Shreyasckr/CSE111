public class Player extends SportsPerson{
    private int goals;
    private int matches;
    private double ratio;
    
    public Player(String teamName, String name, String role, int goals, int matches) {
        super(teamName, name, role);
        this.goals = goals;
        this.matches = matches;
        this.earningPerMatch = (goals * 1000) + (matches * 10);
    }
    
    public void calculateRatio() {
        this.ratio = (double) goals / matches;
    }
    
    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: " + role);
        System.out.println("Total Goal: "+goals+", Total Played: "+matches);
        System.out.println("Match Earnings: " + earningPerMatch);
        System.out.println("Goal Ratio: " + ratio);
    }
}