public class InPatient extends Patient{
public static int intotal = 0;

public InPatient(String s1, String s2, String s3){
super(s1, s2, s3);
intotal++;
}

public static void details(){
System.out.println("Total patient: "+total);
System.out.println("In patient: "+intotal);
System.out.println("out patient: "+(total-intotal));
}
}