public class PremiumUser extends User{
    public static int count = 0;
    public String tier;
    
    public PremiumUser(String s){
        super(s);
        tier = "Silver";
        count++;
    }
    
    public PremiumUser(String s1, String s2){
        super(s1);
        tier = s2;
        count++;
    }
    
    public String getProfile() {
        return "User: " + username+" | Tier: " + tier;
    }
}