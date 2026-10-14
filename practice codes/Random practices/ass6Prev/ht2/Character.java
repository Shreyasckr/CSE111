public class Character{
    public static int ID = 1;
    public static int kid = 0;
    public static int teen = 0;
    public static int adult = 0;
    public static int cha = 0;
    public static double totalH = 0.0;
    public static String str;
    public static int strH = 0;
    
    public String name;
    public int id;
    public String grp;
    public int h;
    
    public Character(String s1, String s2, int n){
        name = s1;
        grp = s2;
        h = n; 
        id = ID++;
        totalH += n;
        cha++;
        if(s2.equals("Kid")){
            kid++;
        }
        else if(s2.equals("Teen")){
            teen++;
        }
        else{
            adult++;
        }
        if(n>strH){
            strH = n;
            str = s1;
        }
    }
    
    public Character(String s, int n){
        this(s, "Teen", n);
    }
    
    public void printDetails(){
        System.out.println("ID: "+id+", Name: "+name);
        System.out.println("Group: "+grp);
        System.out.println("Health: "+h);
    }
    
    public static void printStats(){
        System.out.println("Total Character: "+cha);
        System.out.println("Kids: "+kid);
        System.out.println("Teens: "+teen);
        System.out.println("Adults: "+adult);
        if(kid == 0 && teen == 0 && adult == 0){
            System.out.println("Average Health: 0");
        }
        else{
            System.out.println("Average Health: "+totalH/cha);
        }
        if(kid == 0 && teen == 0 && adult == 0){
            System.out.println("Strongest Character: None");
        }
        else{
            System.out.println("Strongest Character: "+str+" (Health "+strH+")");
        }
    }
}