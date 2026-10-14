public class EmployeeTester{
    public static void main(String args[]){
        Employee.allEmployeeInfo();
        System.out.println("1------------");
        Employee e1 = new Employee("Ashish", 23);
        e1.details();
        System.out.println("2------------");
        Employee.allEmployeeInfo();
        System.out.println("3------------");
        Employee e2 = new Employee("Nidhi", 45);
        e2.details();
        System.out.println("4------------");
        Employee.allEmployeeInfo();
        System.out.println("5------------");
        Employee e3 = new Employee("Ali", 65);
        e3.details();
        System.out.println("6------------");
        Employee.allEmployeeInfo();
        System.out.println("7------------");
        Employee e4 = Employee.createEmployee("Joy", 13);
        System.out.println("8------------");
        e4.details();
        System.out.println("9------------");
        Employee.allEmployeeInfo();
    }
}
