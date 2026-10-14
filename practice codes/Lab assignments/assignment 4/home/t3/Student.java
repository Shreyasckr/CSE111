public class Student{
    public String name;
    public int id;
    public String dept;
    public String email = null; 
    private String pass = null;
    private boolean sta = false;
    public String advisedCourses;

    public Student(String s, int n, String z){
        name = s;
        id = n;
        dept = z;
        System.out.println("Student object is created");
    }

    public void setPassword(String s) {
        pass = s;
    }

    public String getPass() {
        return pass;
    }

    public void setSta(boolean status) {
        sta = status;
    }

    public boolean getSta() {
        return sta;
    }
}