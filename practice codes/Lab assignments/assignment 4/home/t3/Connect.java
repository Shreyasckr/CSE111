public class Connect{
    public Student[] st = new Student[5];
    public int totalAdvisee = 0;

    public Connect(){
        System.out.println("Connect is ready to use!");
    }

    public void login(Student obj){
        if(obj.getPass() == null || obj.email == null){
            System.out.println("Email and password need to be set.");
        } 
        else{
            System.out.println("Login successful");
            obj.setSta(true);
        }
    }

    public void advising(Student obj){
        if(!obj.getSta()){
            System.out.println("Please login to advise courses!");
        }
        else{
            System.out.println("You haven't selected any courses.");
        }
    }

    public void advising(Student obj, String s1, String s2, String s3, String s4){
        System.out.println("You need special approval to take more than 3 courses.");
    }

    public void advising(Student obj, String s1, String s2, String s3){
        System.out.println("Advising successful!");
        obj.advisedCourses = s1 + " " + s2 + " " + s3; 
        st[totalAdvisee++] = obj;
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: " + totalAdvisee);
        for (int i = 0; i<totalAdvisee; i++){
            Student s = st[i];
            System.out.println("Name: " + s.name + " ID: " + s.id);
            System.out.println("Department: " + s.dept);
            System.out.println("Advised Courses:");
            System.out.println(s.advisedCourses);
            System.out.println("==============");
        }
    }
}