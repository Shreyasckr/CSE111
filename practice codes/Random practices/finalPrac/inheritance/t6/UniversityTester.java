public class UniversityTester {
    public static void main(String[] args) {
        System.out.println("Persons: " + Person.getTotalPersons());
        Student.studentReport();
        System.out.println("==========");

        Person p1 = new Person("Dr. Khan", 45);
        Student s1 = new Student();
        s1.display();
        System.out.println("----------");

        Student s2 = new Student("Rayan", 20, "S101");
        s2.enroll("CSE110");
        s2.enroll("MAT110");
        s2.enroll("BIO999");
        s2.enroll("PHY101");
        s2.enroll("CSE111");
        s2.display();
        System.out.println("----------");

        HonorsStudent h1 = new HonorsStudent("Zara", 21, "H201", 3.8);
        HonorsStudent h2 = new HonorsStudent("Omar", 22, "H202", 3.4);
        h1.enroll("CSE220");
        h1.enroll("CSE111");
        h1.display();
        System.out.println("----------");

        h2.promoteIfEligible();
        h1.promoteIfEligible();
        System.out.println("----------");

        HonorsStudent.honorReport();
        System.out.println("----------");

        Student.studentReport();
    }
}
//Persons: 0
//Total Students: 0
//Offered: CSE110 CSE111 CSE220 MAT110 PHY101 
//==========
//Name: Unknown | Age: 0 | ID: S000 | Courses: 
//----------
//BIO999 is not offered!
//Rayan: Course limit reached!
//Name: Rayan | Age: 20 | ID: S101 | Courses: CSE110 MAT110 PHY101 
//----------
//Name: Zara | Age: 21 | ID: H201 | Courses: CSE220 CSE111  | CGPA: 3.8 | Scholarship: YES
//----------
//Omar not eligible.
//Zara promoted to Dean's List!
//----------
//Honors Students: 2
//Total Students: 4
//Total Persons: 5
//----------
//Total Students: 4
//Offered: CSE110 CSE111 CSE220 MAT110 PHY101
