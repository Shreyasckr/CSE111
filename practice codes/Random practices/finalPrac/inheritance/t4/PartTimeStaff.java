public class PartTimeStaff extends Employee{
    public int salary;
    public int hour;
    
    public PartTimeStaff(String s, int n, int m, int o){
        super(s, n);
        salary = m;
        hour = o;
    }
    public String details() {
        return "ID: " + super.getId() + " | Name: " + super.getName()+" | Type: Part-Time | Hours: "+hour;
    }
    public double computeSalary(){
        return salary*hour;
    }
}