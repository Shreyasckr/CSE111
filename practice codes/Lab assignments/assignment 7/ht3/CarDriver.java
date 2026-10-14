public class CarDriver extends GenericDriver{
    public String profile = "Premium";
    public static String[] restrictedAreas = new String[2];
    public static int count = 0;

    public CarDriver(String s){
        super(s);
    }

    public void hasSafetyTraining(){
        super.hasSafetyTraining();
        System.out.println("Premium drivers receive extra safety briefings.");
    }

    public String toString(){
        return getName() + "'s driver profile is " + profile;
    }

    public static void restrictedAreas(String s){
        if (count < 2) {
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