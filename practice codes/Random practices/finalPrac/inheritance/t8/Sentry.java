public class Sentry extends Avenger{
    private String power;
    private int sta;
    private String status = "Sentry";
    
    public Sentry(String n, String t, String p, int s){
        super(n, t);
        power = p; 
        sta = s;
    }
    
    public String toString(){
        return "Name: "+getName()+"\nTeam: "+team+"\nPower: "+power+"\nStability: "+sta+"\nStatus: "+status;
    }
    
    public void decreaseStability(int n){
        if(status.equals("Sentry")){
            if(sta-n>40){
                sta -= n;
                System.out.println(getName()+"'s stability decreases by "+n+". CurrentLevel: "+sta);
                System.out.println(getName()+" maintains stability and remains Sentry");
            }
            else{
                sta -= n;
                System.out.println(getName()+"'s stability decreases by "+n+". CurrentLevel: "+sta);
                System.out.println(getName()+" loses control and transforms into VOID!");
                power = "Eternal Darkness";
                status = "Void";
            }
        }
        else{
            sta -= n;
            System.out.println(getName()+" is already in Void Mode! Current Level: "+sta);
        }
    }
    public void unleashPower(){
        if(status.equals("Sentry")){
            System.out.println(getName()+" (the "+status+") uses "+power+" to protect the world.");
        }
        else{
            System.out.println(getName()+" (the "+status+") unleashes destructive "+power+"!");
        }
    }
}