public class ElectricCar extends Car{
    public int range;
    
    public ElectricCar(String s, int n, int m){
        super(s, n);
        range = m;
    }
    public ElectricCar(String s, int n){
        super(s, n);
        range = 300;
    }
}