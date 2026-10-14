public class CSEStudent extends Student{
    public String[] crses = {"CSE110", "CSE111", "CSE220", "CSE221"};
    public static int st = 0;
    
    public CSEStudent(String s, int n){
        super(s, n);
        st++;
    }
    
    public static void details(){
        System.out.println("Total CSE Student: "+st);
        System.out.println("Available Lab Based Courses: ");
        System.out.println("CSE110 CSE111 CSE220 CSE221");
    }
    
    public void addLabBasedCourse(String s){
        boolean found = false;
        for(int i = 0; i<4; i++){
            if(crses[i].equals(s)){
                found = true;
                courses += s+" ";
            }
        }
        if(!found){
            System.out.println("It is not a lab based course!");
        }
    }
}