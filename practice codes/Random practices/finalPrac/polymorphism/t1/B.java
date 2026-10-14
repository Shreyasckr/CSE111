class B extends A{
  public static int x = 10;
  public static void method(){
    System.out.println("Child Static Method Executed.");
  }
  public void met(){
    super.met();
    method();
  }
}