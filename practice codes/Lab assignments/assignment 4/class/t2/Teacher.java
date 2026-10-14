public class Teacher{
    public String name;
    public String ini;
    public int cr = 0; //count
    public String[] courses = new String[3];
    
    public Teacher(String s, String n){
        name = s;
        ini= n;
        System.out.println("A teacher has been created");
    }
    
    public void addCourse(Course obj){
        courses[cr] = obj.name;
        cr++;
    }
    
    public void printDetail(){
        System.out.println("Name: "+name);
        System.out.println("Initial: "+ini);
        System.out.println("List of courses: ");
        for(int i = 0; i<cr; i++){
            System.out.println(courses[i]);
        }
    }
}