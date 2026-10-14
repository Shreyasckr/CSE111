public class Organizer{
    public String name;
    public Event[] evnt = new Event[4];
    public int count = 0;
    
    public Organizer(){
        System.out.println("Please provide the organizer's name");
    }
    
    public Organizer(String s){
        name = s;
    }
    
    public void organizeEvent(Event obj){
        evnt[count++] = obj;
        System.out.println(name+" successfully organized "+obj.getName());
    }
    
    public void searchEventByDate(String s){
        boolean found = false;
        for(int i = 0; i<count; i++){
            if(evnt[i].date.equals(s)){
                System.out.println(evnt[i].getName());
                found = true;
            }
        }
        if(!found){
            System.out.println("No event is scheduled for "+s);
        }
    }
}