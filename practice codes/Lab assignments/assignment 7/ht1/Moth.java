public class Moth extends Caterpillar{
    public Moth(String s, int n){
        super(s, n);
    }
    
    public void transform(){
        System.out.println("Caterpillar transforms into Moth");
    }
    
    public void eat(int n){
        energy += (n * 2.5) - 2.5;
        System.out.println("Moth lost energy due to nocturnal activity");
    }
    
    public void showDetails(){
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy+" joules");
    }
}