public class TQuiz extends MQuiz{
    public static int y = 2;
    public int var = 6, temp = 3;
    public TQuiz(){
        y += 2;
        var = super.x + y;
        metA(y, var);
        x = (temp++) + var;
    }
    public void metB(int x, int y){
        this.y += y;
        this.x -= x;
        var = TQuiz.y + MQuiz.var;
        System.out.println(this.x +" "+ this.y +" "+ this.var);
    }
}    