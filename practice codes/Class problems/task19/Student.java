public class Student {
    public int id;
    public double cg;          // -1.0 means not set
    public String[] courses;   // array to hold added courses
    public int count;          // number of courses added so far

    // Constructor with ID only
    public Student(int n) {
        id = n;
        cg = -1.0;
        courses = new String[10];  // allocate enough space
        count = 0;
        System.out.println("A student with ID " + id + " has been created");
    }

    // Constructor with ID and CGPA
    public Student(int n, double d) {
        id = n;
        cg = d;
        courses = new String[10];
        count = 0;
        System.out.println("A student with ID " + id + " and cgpa " + cg + " has been created");
    }

    // Set CGPA (only if not already set? but problem allows changing)
    public void storeCG(double n) {
        cg = n;
    }

    // Add a single course
    public void addCourse(String s) {
        if (cg == -1.0) {
            System.out.println("Failed to add " + s + ". Set CG first.");
            return;
        }

        int maxCourses = (cg >= 3.0) ? 4 : 3;

        if (count < maxCourses) {
            courses[count] = s;
            count++;
            System.out.println("Added " + s);
        } else {
            System.out.println("Failed to add " + s);
            if (cg < 3.0) {
                System.out.println("CG is low. Can't add more than 3 courses.");
            } else {
                System.out.println("Maximum 4 courses allowed.");
            }
        }
    }

    // Add multiple courses (array version)
    public void addCourse(String[] courseArray) {
        for (int i = 0; i < courseArray.length; i++) {
            addCourse(courseArray[i]);
        }
    }

    // Remove all courses
    public void removeAllCourse() {
        for (int i = 0; i < count; i++) {
            courses[i] = null;     // optional, but clean
        }
        count = 0;
        System.out.println("All the courses are removed.");
    }

    // Display student info and enrolled courses
    public void showAdvise() {
        System.out.println("Student ID: " + id + ", CGPA: " + cg);
        if (count == 0) {
            System.out.println("No courses added.");
        } else {
            System.out.println("Added courses are:");
            for (int i = 0; i < count; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }
}