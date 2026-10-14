public class Employee {
    private String name;
    private int id;
    private String type;

    public Employee() {
        this("Default", 0, "Fulltime");
        System.out.println("A default employee has been created");
    }

    public Employee(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getType() { return type; }
}
