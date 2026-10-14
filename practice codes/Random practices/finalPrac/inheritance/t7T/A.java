public class A{
  public static int temp = 6;
  public static int x = 3;
  public int sum = 1;
  public int y = 2;
  public A(){
    y = temp - 2;
    sum = temp + 3;
    temp -= 2;
  }
  public void methodA(int m, int n){
    int x = 0;
    y = y + m + (this.temp++);
    x = x + 2 +  n;
    sum = sum + this.x + y;
    System.out.println(x + " " + y+ " " +sum); 
  }
}


