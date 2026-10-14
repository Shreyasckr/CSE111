public class Student{
    public static int studentCount = 0;
    
    public String name;
    public int id;
    
    public Student(String s, int n){
        name = s;
        id = n;
        studentCount++;
        System.out.println("A student is created!");
    }
    
    public void info(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}