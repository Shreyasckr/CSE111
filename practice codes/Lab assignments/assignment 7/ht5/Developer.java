public class Developer extends Employee{
    public String lang;
    public double finalSalary;
    public Developer(String s, int m, int n, String l){
        super(s, m, n);
        lang = l;
    }
    
    public void calculateSalary(){
        if(lang.equals("Java")){
            double x = getBaseSalary() + 700.0;
            finalSalary = x;
        }
        else{
            finalSalary = getBaseSalary();
        }
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+lang+"\nFinal Salary: $"+finalSalary);
    }
}