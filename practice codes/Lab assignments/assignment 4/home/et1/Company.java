public class Company {
    private String name;
    private Employee[] employees;
    private int employeeCount;
    private static final int MAX_EMPLOYEES = 3;

    public Company() {
        this("ABC Company");
    }

    public Company(String name) {
        this.name = name;
        employees = new Employee[MAX_EMPLOYEES];
        employeeCount = 0;
        System.out.println("Company Name: " + name);
    }

    public void addEmployee(Employee e) {
        if (employeeCount < MAX_EMPLOYEES) {
            employees[employeeCount] = e;
            employeeCount++;
            System.out.println(e.getName() + " has joined the company");
        } else {
            System.out.println("No more vacancy");
        }
    }

    public void removeEmployee(Employee e) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] == e) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employeeCount--;
                System.out.println(e.getName() + " has left the company");
                return;
            }
        }
    }

    public void details() {
        System.out.println("Company Name: " + name);
        System.out.println("Total Employee: " + employeeCount);
        System.out.println("Fulltime Employees:");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getType().equals("Fulltime")) {
                System.out.println("Name: " + employees[i].getName() + ", ID: " + employees[i].getId());
            }
        }
        System.out.println("Part-Time Employees:");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getType().equals("Part-time")) {
                System.out.println("Name: " + employees[i].getName() + ", ID: " + employees[i].getId());
            }
        }
    }
}