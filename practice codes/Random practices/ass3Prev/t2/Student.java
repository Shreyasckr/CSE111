public class Student{
    public String name;
    public String prog;
    
    public Student(String s1, String s2){
        name = s1;
        prog = s2;
    }
    
    public void updateName(String s){
        name = s;
    }
    
    public void updateProgram(String s){
        prog = s;
    }
    
    public String accessProgram(){
        return prog;
    }
}