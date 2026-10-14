public class ComplexNumber extends RealNumber{
    public double com;
    
    public ComplexNumber() {
        super(1.0);
        com = 1.0;
    }
    
    public ComplexNumber(double d1, double d2) {
        super(d1);
        com = d2;
    }
    
    public String details(){
        return getReal() + "\nImaginaryPart: "+com;
    }
}