public class Department{
    public String dept;
    public int sts;
    
    public Department(String s, int n){
        dept = s;
        sts = n;
    }
    
    public void info(){
        System.out.println("Name: "+dept);
        System.out.println("Total Students: "+sts);
    }
    
    public void addStudents(int[] arr){
        for(int i = 0; i<arr.length; i++){
            sts += arr[i];
            arr[i] = 0;
        }
    }
    
    public void mergeStudents(Department obj){
        this.sts += obj.sts;
        obj.sts = 0;
        System.out.println("Students of CS are merged with students of CSE");
    }
}