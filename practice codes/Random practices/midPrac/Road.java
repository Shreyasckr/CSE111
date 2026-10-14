public class Road {
    public String name;
    public int accidents;
    public int lighting;
    public Road(String n, int a, int b){
        name = n;
        accidents = a;
        lighting = b;
    }
    public void roadDetails()
    {
        System.out.println("Road Name: "+name);
        System.out.println("Accident Count: "+accidents);
        System.out.println("Lighting Level: "+lighting);
    }
}