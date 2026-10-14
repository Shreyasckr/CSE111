// Given class — DO NOT CHANGE
public class Courier {
    private String trackingID;
    private String destination;
    private double weight;

    public Courier(String id, String dest, double wt) {
        this.trackingID = id;
        this.destination = dest;
        this.weight = wt;
    }
    public String getID()   { return trackingID; }
    public String getDest() { return destination; }
    public double getWeight() { return weight; }
}