public class MedStudent extends Student{
    public static int total = 0;
    public static String[] course = {"Anatomy", "Physiology", "Pathology", "Biochemistry"};
    
    public MedStudent(String s, int n){
        super(s, n);
        total++;
    }
    
    public static void details(){
        System.out.println("Total Med Students: "+total);
        System.out.print("Valid Courses: ");
        for(int i = 0; i<course.length; i++){
            System.out.print(course[i]+" ");
        }
        System.out.println();
    }
    
    public void enroll(String s){
        boolean found = false;
        for(int i = 0; i<course.length; i++){
            if(s.equals(course[i])){
                found = true;
                courses += s+" ";
            }
        }
        if(!found){
            System.out.println("Invalid course: "+s);
        }
    }
}