public class MedTester {
    public static void main(String[] args) {
        MedStudent.details();
        System.out.println("1---");
        MedStudent m1 = new MedStudent("Araf", 11);
        MedStudent m2 = new MedStudent("Saba", 22);
        m1.info();
        System.out.println("2---");
        m1.enroll("Anatomy");
        m1.enroll("Pathology");
        m1.enroll("Chemistry");
        System.out.println("3---");
        m1.info();
        System.out.println("4---");
        MedStudent.details();
    }
}
//Total Med Students: 0
//Valid Courses: Anatomy Physiology Pathology Biochemistry
//1---
//Name: Araf
//Roll: 11
//Courses:
//2---
//Invalid course: Chemistry
//3---
//Name: Araf
//Roll: 11
//Courses: Anatomy Pathology
//4---
//Total Med Students: 2
//Valid Courses: Anatomy Physiology Pathology Biochemistry