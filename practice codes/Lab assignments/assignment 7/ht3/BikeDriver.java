public class BikeDriver extends GenericDriver{
    public String profile;
    public static String[] restrictedAreas = new String[3];
    public static int count = 0;
    
    public BikeDriver(String s1, String s2){
        super(s1);
        profile = s2;
    }
    
    public String acceptRide(boolean b){
        return super.acceptRide(b);
    }
    
    public String toString(){
        return getName() + "'s driver profile is " + profile;
    }
    
    public static void restrictedAreas(String s) {
        if(count < 3){
            restrictedAreas[count++] = s;
        }
    }
    
    public void fightRestriction(String[] areas){
        for(int i = 0; i < areas.length; i++){
            String targetArea = areas[i];
            boolean isBanned = false;
            for(int j = 0; j < restrictedAreas.length; j++){
                if (restrictedAreas[j] != null && restrictedAreas[j].equals(targetArea)) {
                    isBanned = true;
                    break;
                }
            }
            if(isBanned){
                System.out.println(getName() + " cannot enter " + targetArea);
            } 
            else{
                System.out.println(getName() + " can enter " + targetArea);
            }
        }
    }
}