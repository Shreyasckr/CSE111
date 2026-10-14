public class Student{
    public int id;
    public double cg;
    public String[] crs = new String[4];
    public int count;
    
    public Student(int n){
        id = n;
        System.out.println("A student with ID "+n+" has been created.");
    }
    
    public Student(int n, double b){
        id = n;
        cg = b;
        System.out.println("A student with ID "+n+"and cg "+cg+"has been created.");
    }
    
    public void addCourse(String s){
        if(cg == 0.0){
            System.out.println("set cg first");
        }
        else{
            crs[count++] = s;
        }
    }
    
    public void addCourse(String[] arr){
        count = 0;
        if(cg<3){
            for(int i = 0; i<3; i++){
                crs[count++] = arr[i];
            }
        }
        else{
            for(int i = 0; i<4; i++){
                crs[count++] = arr[i];
            }
        }
    }
    
    public void showAdvisee(){
    
    }
}