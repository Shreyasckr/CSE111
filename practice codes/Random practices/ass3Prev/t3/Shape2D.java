public class Shape2D{
    public int len = 5;
    public double area;
    public String shape;
    
    public Shape2D(){
        shape = "Square";
        System.out.println("A Square has been created with length: "+len);
        area = len*len;
    }
    
    public Shape2D(int n, int m){
        shape = "Rectangle";
        System.out.println("A Rectangle has been created with length: "+n+" and breadth: "+m);
        area = n*m;
    }
    
    public Shape2D(int n, int m, String s){
        shape = s;
        System.out.println("A Triangle has been created with height: "+n+" and base: "+m);
        area = .5*n*m;
    }
    
    public Shape2D(int a, int b, int c){
        shape = "Triangle";
        System.out.println("A Triangle has been created with the following sides: "+a+", "+b+", "+c);
        double s = (a+b+c)/2;
        double s1 = s*(s-a)*(s-b)*(s-c);
        area = Math.sqrt(s1);
    }
    
    public void area(){
        System.out.println("The area of the "+shape+" is: "+area);
    }
}