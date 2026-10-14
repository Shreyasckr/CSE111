public class tester{
  public static void main(String [] args){
    A a = new B();
    System.out.println(a.x);
    System.out.println(((B) a).x);
    a.met();
  }
}