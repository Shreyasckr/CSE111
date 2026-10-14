public class Avenger {
    private String name;
    protected String team ;
    public Avenger(String name, String team) {
        this.name = name;
        this.team = team;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Name: " + name + "\nTeam: " + team;
    }
}