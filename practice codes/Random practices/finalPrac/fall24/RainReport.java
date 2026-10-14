public class RainReport extends WeatherReport{
    public double ori;
    public double adj;
    public String thunder;
    
    public RainReport(double d1, int n, int m, double d2, boolean b){
        super(d1, n, m);
        ori = d2;
        adj = d2;
        if(b){
            thunder = "Yes";
        }
        else{
            thunder = "No";
        }
        if(thunder.equals("Yes")){
            adj += 0.25*adj;
        }
        if(windSpd>20){
            adj -= 0.1*adj;
        }
        if(humidity>70){
            adj += 0.2*adj;
        }
    }
    
    public void displayReport(){
        super.displayReport();
        System.out.println("Original Rainfall Amount: "+ori+" mm");
        System.out.println("Adjusted Rainfall Amount: "+adj+" mm");
        System.out.println("Thunderstrom: "+thunder);
    }
    
    public void rainFallStatus(){
        if(adj>50){
            System.out.println("Due to heavy rainfall, this area can face a flood situation.");
        }
        else if(adj>30){
            System.out.println("The area will face Moderate rainfall.");
        }
        else{
            System.out.println("The area will face Light rainfall.");
        }
    }
}