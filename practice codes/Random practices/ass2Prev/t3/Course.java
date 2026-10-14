public class Course{
    public String name;
    public String code;
    public int credit;
    
    public void updateDetails(String s1, String s2, int n){
        name = s1;
        code = s2;
        credit = n;
    }
    public void displayCourse(){
        System.out.println("Course Name: "+name);
        System.out.println("Course Code: "+code);
        System.out.println("Course Credit: "+credit);
    }
}