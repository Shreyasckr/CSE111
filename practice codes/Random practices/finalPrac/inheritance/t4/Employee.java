public class Employee {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() { return name; }
    public int getId() { return id; }
    public double computeSalary() { return 0; }
    public String details() {
        return "ID: " + id + " | Name: " + name;
    }
}