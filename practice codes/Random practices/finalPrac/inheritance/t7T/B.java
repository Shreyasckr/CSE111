public class B extends A{
  public static int x = 7;
  public int temp = 0;
  public B(){
    temp = temp + 3 ;
    sum = 3 + temp + 2 + sum;
    super.temp -= 1;
  } 
  public B(B b){
    sum = b.sum;
    x = b.x;
    b.methodB(2, 3);
  }
  public void methodB(int m, int n){    
    int y = 0;
    y = y + this.y + m;
    x = this.y + super.x + temp;
    methodA(x, y);
    sum = x + y + super.sum;
    System.out.println(x + " " + y+ " " +sum);
  }
}