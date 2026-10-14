public class Person {
    protected String name;
    protected int age;
    private static int totalPersons = 0;

    public Person() {
        this("Unknown", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPersons++;
    }

    public static int getTotalPersons() {
        return totalPersons;
    }

    public String getInfo() {
        return "Name: " + name + " | Age: " + age;
    }

    public void display() {
        System.out.println(getInfo());
    }
}