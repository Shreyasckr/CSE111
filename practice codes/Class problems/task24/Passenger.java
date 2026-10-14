public class Passenger{
    public String name;
    public int age;
    
    public Passenger(String s, int n){
        name = s;
        age = n;
    }
    
    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}