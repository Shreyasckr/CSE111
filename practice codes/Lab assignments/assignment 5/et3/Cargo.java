public class Cargo{
    public static int ID = 1;
    public static double cap = 10.0;
    public static int count = 0;
    
    public static double capacity(){
        return cap;
    }
    
    public String name;
    public int id;
    public double weight;
    public boolean loaded = false;
    
    public Cargo(String s, double d){
        name = s;
        id = ID++;
        weight = d;
    }
    
    public void details(){
        System.out.println("Cargo ID: "+id+", Contents: "+name+", Weight: "+weight+", Loaded: "+loaded);
    }
    
    public void load(){
        if(cap-this.weight>0){
            loaded = true;
            cap -= this.weight;
            System.out.println("Cargo "+id+" loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    
    public void unload(){
        loaded = false;
        cap += weight;
        System.out.println("Cargo "+id+" unloaded.");
    }
}