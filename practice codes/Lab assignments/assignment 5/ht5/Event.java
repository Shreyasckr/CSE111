public class Event{
    private String name;
    public String date;
    
    public static Event[] ev = new Event[5];
    public static int totalev = 0;
    
    
    public String getName(){
        return name;
    }
    
    public Event(String s1, String s2){
        name = s1;
        date = s2;
        ev[totalev++] = this;
    }
    
    public String details(){
        return "Name: "+name+"\nDate: "+date;
    }
    
    public static void allEventInfo(){
        System.out.println("Total Events: "+totalev);
        System.out.println("Event Details: ");
        for(int i = 0; i<totalev; i++){
            System.out.println("Event "+(i+1)+":");
            System.out.println(ev[i].details());
        }
    }
}