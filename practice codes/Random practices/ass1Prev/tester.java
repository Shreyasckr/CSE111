public class tester{
    public static void main(String[] args){
    //Classname variable = new Classname()
     student s1 = new student(); //object/instance1
     student s2 = new student(); //object/instance2
     s1.name = "ABC";
     s1.id = "123";
     s2.name = "XYZ";
     s2.id = "321";
     System.out.println(s1.name);
     System.out.println(s1.id);
     System.out.println(s2.name);
     System.out.println(s2.id);
    }
}