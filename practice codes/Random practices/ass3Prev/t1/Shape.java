public class Shape{
    public String name;
    public Double area;
    
    public void setParameters(String s, int n){
        name = s;
        area = n*n*Math.PI;
    }
    
    public void setParameters(String s, int n, int m){
        name = s;
        area = .5*n*m;
    }
    
    public void setParameters(String s, double a, double b){
        name = s;
        area = a*b;
    }
    
    public String details(){
        return "Shape Name: "+name+"\n"+"Area: "+area;
    }
}