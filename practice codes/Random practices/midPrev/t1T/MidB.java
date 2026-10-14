public class MidB {
    public int x = 0;
    public int y = 6;
    public int sum = 8;
    public int[] p = {6, 2, 3, 4, 7};
    
    public MidB(int[] p) {
        y = sum + this.x + methodB(p);
        this.sum = this.p[1] * p.length;
        methodA(this);
        x = p[1] + p[4] + sum;
        System.out.println(x + " " + y + " " + sum);
    }
    
    public void methodA(MidB z) {
        z.sum = sum + z.methodB(p) + this.sum;
    }
    
    public int methodB(int[] r) {
        int y = 3;
        x = x + this.sum - this.y;
        sum = this.x + (p[1]++) + r[1];
        System.out.println(x + " " + this.y + " " + sum);
        return r[1];
    }
}