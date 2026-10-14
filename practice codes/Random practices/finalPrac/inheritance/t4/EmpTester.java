public class EmpTester {
    public static void main(String[] args) {
        Staff s1 = new Staff("Tariq", 101, 50000);
        PartTimeStaff p1 = new PartTimeStaff("Nadia", 202, 500, 20);
        System.out.println(s1.details());
        System.out.println("Salary: " + s1.computeSalary());
        System.out.println("---");
        System.out.println(p1.details());
        System.out.println("Salary: " + p1.computeSalary());
    }
}

//ID: 101 | Name: Tariq | Type: Full-Time
//Salary: 50000.0
//---
//ID: 202 | Name: Nadia | Type: Part-Time | Hours: 20
//Salary: 10000.0