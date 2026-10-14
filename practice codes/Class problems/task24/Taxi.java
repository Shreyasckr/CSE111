public class Taxi{
    public String id;
    public String route;
    public Passenger[] arr = new Passenger[3];
    public int count;
    
    public Taxi(String s1, String s2){
        id = s1;
        route = s2;
    }
    
    public void addPassenger(Passenger obj){
        arr[count++] = obj;
    }
    
    public void showTaxi(){
        System.out.println("Taxi No: "+id);
        System.out.println("Route: "+route);
        System.out.println("Passenger List:");
        for(int i = 0; i<count; i++){
            System.out.println(arr[i].name+" "+arr[i].age);
        }
    }
}