public class Butterfly extends Caterpillar{
    public Butterfly(String s, int n){
        super(s, n);
    }
    
    public void transform(){
        System.out.println("Caterpillar transforms into Butterfly");
    }
    
    public void eat(int n){
        energy += (n * 5) - 5;
        System.out.println("Butterfly lost energy while flying and absorbed nectar");
    }
    
    public void showDetails(){
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy+" joules");
    }
}