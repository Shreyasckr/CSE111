public class Staff extends Employee{
    public int salary;
    
    public Staff(String s, int n, int m){
        super(s, n);
        salary = m;
    }
    public String details() {
        return "ID: " + super.getId() + " | Name: " + super.getName() +" | Type: Full-Time";
    }
    public double computeSalary(){
        return salary;
    }
}