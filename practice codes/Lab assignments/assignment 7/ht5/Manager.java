public class Manager extends Employee{
    public double bonus;
    public double finalSalary;
    public Manager(String s, int m, int n, int o){
        super(s, m, n);
        bonus =(double)o;
    }
    
    public void calculateSalary(){
        if(getHoursWorked()>40){
            double x = getBaseSalary() + getBaseSalary()*(bonus/100.0);
            finalSalary = x;
        }
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+bonus+" %\nFinal Salary: $"+finalSalary);
    }
    
    public void requestIncrement(int n){
        if(getHoursWorked()>100){
            double x = getBaseSalary() + (double)n;
            setBaseSalary(x);
            System.out.println("$"+n+" Increment approved.");
        }
        else if(getHoursWorked()>80){
            double x = getBaseSalary() + n/2.0;
            setBaseSalary(x);
            System.out.println("$"+(n/2)+" Increment approved.");
        }
        else{
            System.out.println("Increment denied.");
        }
    }
}