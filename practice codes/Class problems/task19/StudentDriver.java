public class StudentDriver {
    public static void main(String[] args){
        Student student1 = new Student(12345678);
        System.out.println("1-----------------");
        student1.addCourse("CSE110");
        System.out.println("2-----------------");
        student1.storeCG(2.5);
        student1.addCourse("CSE110");
        student1.addCourse("ENG101");
        System.out.println("3-----------------");
        student1.showAdvisee();
        System.out.println("4-----------------");
        student1.removeAllCourse();
        System.out.println("5-----------------");
        student1.showAdvisee();
        System.out.println("6-----------------");
        String[] courses = {"SOC101","CSE111","ENG102"};
        student1.addCourse(courses);
        System.out.println("7-----------------");
        student1.showAdvisee();
        System.out.println("8-----------------");
        student1.addCourse("CSE230");
        student1.showAdvisee();
        System.out.println("9-----------------");
        Student student2 = new Student(975738383,3.0);
        System.out.println("10-----------------");
        student2.addCourse(new String []
                               {"CSE220","PHY112","MAT120","BUS101","CHN101"});
        System.out.println("11-----------------");
        student2.showAdvisee();
    }
}
