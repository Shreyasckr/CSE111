public class A{
  public static int x = 100;
  public static void method(){
    System.out.println("Parent Static Method Executed.");
  }
  public void met(){
    method();
  }
}
