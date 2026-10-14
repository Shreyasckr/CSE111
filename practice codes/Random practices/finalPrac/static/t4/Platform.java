public class Platform{
    public static Coder[] cdr = new Coder[3];
    public static int count = 0;
    public static double total = 0.0;
    
    public String name;
    
    public Platform(String s){
        name = s;
    }
    
    public void registerCoder(Coder obj){
        if(count<3){
            cdr[count++] = obj;
            total += obj.rating; 
            System.out.println(obj.handle+" ("+obj.type+") registered successfully.");
        }
        else{
            System.out.println("Registration failed! Platform capacity reached. Cannot register "+obj.handle+".");
        }
    }
    
    public void platformDetails(){
        System.out.println("Platform: "+name);
        System.out.println("Total Registered: "+count);
        System.out.println("Average Rating: "+(total/count));
        System.out.println("Registered Coders:");
        for(int i= 0; i<count; i++){
            System.out.println("- "+cdr[i].handle);
        }
    }
}