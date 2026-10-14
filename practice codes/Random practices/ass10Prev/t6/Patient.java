public class Patient{
    public static int ID = 1;
    public static int total = 0;
    
    public String name;
    public String doc;
    public String id;
    public String dept = null;
    
    public Patient(String s1, String s2){
        name = s1;
        doc = s2;
        id = "P0"+(ID++);
        total++;
    }
    
    public Patient(String s1, String s2, String s3){
        name = s1;
        doc = s2;
        dept = s3;
        id = "P0"+(ID++);
        total++;
        System.out.println("New patient admitted in "+dept);
    }
    
    public String toString(){
        if(dept != null){
            return "Patient id: "+id+" name: "+name+" doctor: "+doc+" department: "+dept;
        } 
        else{
            return "Patient id: "+id+" name: "+name+" doctor: "+doc;
        }
    }
    
    public static void details(){
        System.out.println("Total patient: "+total);
    }
    public static void details(Patient[] pat){
        System.out.println("Details of "+pat.length+" patients:");
        for(int i = 0; i<pat.length; i++){
            System.out.println("= = = = = =");
            System.out.println(pat[i]);
        }
    }
}