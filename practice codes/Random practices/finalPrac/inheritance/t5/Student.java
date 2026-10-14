class Student {
    public String name;
    public int roll;
    public String courses = "";
    public Student(String name, int roll) {
        this.name = name; this.roll = roll;
    }
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Courses: " + courses);
    }
}