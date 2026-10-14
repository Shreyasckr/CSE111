public class MQuiz {
    public static int var = 6;
    protected int x, y = 2;
    public MQuiz(){
        x += var - y;
        var += 2;
    }
    public void metA(int a, int temp){
        y = temp;
        temp = this.y + a;
        metB(y, temp);
        this.x += var - temp;
        System.out.println(x + " " + y + " " + temp);
    }
    public void metB(int x, int y){
        this.y += y;
        x = this.x + x;
        var = TQuiz.y + MQuiz.var;
        System.out.println(this.x +" "+ this.y +" "+ this.var);
    }
}