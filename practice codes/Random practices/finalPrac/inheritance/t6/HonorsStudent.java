public class HonorsStudent extends Student {
    private double cgpa;
    private static int totalHonors = 0;
    private boolean hasScholarship;

    public HonorsStudent(String name, int age, String id, double cgpa) {
        super(name, age, id);
        this.cgpa = cgpa;
        this.hasScholarship = (cgpa >= 3.7);
        totalHonors++;
    }

    public static void honorReport() {
        System.out.println("Honors Students: " + totalHonors);
        System.out.println("Total Students: " + Student.totalStudents);
        System.out.println("Total Persons: " + Person.getTotalPersons());
    }

    @Override
    public String getInfo() {
        String sc = hasScholarship ? "YES" : "NO";
        return super.getInfo() + " | CGPA: " + cgpa + " | Scholarship: " + sc;
    }

    public void promoteIfEligible() {
        if (cgpa >= 3.5)
            System.out.println(name + " promoted to Dean's List!");
        else
            System.out.println(name + " not eligible.");
    }
}