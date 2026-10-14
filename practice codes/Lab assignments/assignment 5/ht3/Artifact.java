public class Artifact {
    private static Artifact[] vault = new Artifact[4];
    private static int count = 0;
    
    private String name;
    private String addedby;
    private int power;
    
    public Artifact(String s1, String s2){
        name = s1;
        addedby = s2;
        power = calculatePower(name);
    }
    public Artifact(String s){
        this(s, "Okabe");
    }
    
    public String GetName(){
        return name; 
    }
    public int CalcPower(){
        return power;
    }
    
    public int calculatePower(String s){
        int sum = 0;
        int len = s.length();
        if(len % 2 == 0){
            for(int i = 0; i < len; i += 2){
                sum += s.charAt(i);
            } 
        } 
        else {
            for(int i = 1; i < len; i += 2){
                sum += s.charAt(i);
            }
        }
        return sum;
    }
    
    public static void AddtoVault(Artifact obj){
        if (count<4) {
            vault[count] = obj;
            count++;
            System.out.println(obj.addedby+ " added " +obj.name+ " successfully to the vault.");
        } 
        else {
            System.out.println("!! " +obj.addedby+ " unsuccessful in adding artifact to the vault!!");
        }
    }
    
    public static void labReport(){
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i<count; i++) {
            System.out.println(vault[i].name + " added by " + vault[i].addedby + " has power of " + vault[i].power + ".");
        }
    }
    
    public static String strongest(){
        Artifact strongest = vault[0];
        for (int i = 1; i<count; i++){
            if (vault[i].power>strongest.power){
                strongest = vault[i];
            }
        }
        return strongest.name;
    }
    
    public void changeName(String s){
        name = s;
        power = calculatePower(s);
        System.out.println("Name changed and power recalculated.");
    }
    
    public void revealArtifact(){
        System.out.println(name + " added by " + addedby + " has power of " + power + ".");
    }
}