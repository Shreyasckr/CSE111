public class MidB {
    public int x = 0;
    public int y = 3;
    public int sum = 8;

    public MidB methodA(int[] p) {
        this.sum = p[2] * p.length + y;
        p[3] = sum + y + this.sum;
        x = p[1] + p[3] + sum;
        System.out.println(x + " " + p[3] + " " + this.sum);
        return new MidB();
    }

    public void methodB(int sum, int y) {
        this.sum = x + this.y++;
        sum = x + y + 2;
        x = this.x + this.sum + sum++;
        this.y = x + (this.y++) + y;
        System.out.println(x + " " + this.y + " " + sum);
    }
}