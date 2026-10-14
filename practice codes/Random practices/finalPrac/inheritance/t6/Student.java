public class Student extends Person {
    private String studentId;
    private String enrolledCourses = "";
    private int courseCount = 0;
    protected static int totalStudents = 0;
    private static final int MAX_COURSES = 3;
    public static String[] availableCourses =
        {"CSE110", "CSE111", "CSE220", "MAT110", "PHY101"};

    public Student() {
        this("Unknown", 0, "S000");
    }

    public Student(String name, int age, String id) {
        super(name, age);
        this.studentId = id;
        totalStudents++;
    }

    public static void studentReport() {
        System.out.print("Total Students: " + totalStudents + "\nOffered: ");
        for (String c : availableCourses)
            System.out.print(c + " ");
        System.out.println();
    }

    public void enroll(String course) {
        if (courseCount >= MAX_COURSES) {
            System.out.println(name + ": Course limit reached!");
            return;
        }
        boolean found = false;
        for (String c : availableCourses) {
            if (c.equals(course)) { found = true; break; }
        }
        if (!found) {
            System.out.println(course + " is not offered!");
            return;
        }
        enrolledCourses += course + " ";
        courseCount++;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | ID: " + studentId
               + " | Courses: " + enrolledCourses;
    }
}