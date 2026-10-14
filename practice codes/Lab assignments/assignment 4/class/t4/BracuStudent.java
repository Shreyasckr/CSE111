public class BracuStudent{
    public String name;
    private String location;
    public boolean pass = false;
    
    public void setLocation(String s){
        location = s;
    }
    
    
    public String getLocation(){
        return location;
    }
    
    public BracuStudent(String s1, String s2){
        name = s1;
        location = s2;
    }
    
    public void collectPass(){
        pass = true;
    }
    
    public void showDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Lives in "+getLocation());
        System.out.println("Have Bus Pass? "+pass);
    }
}