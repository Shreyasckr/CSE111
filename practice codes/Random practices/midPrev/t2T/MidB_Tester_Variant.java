 public class MidB_Tester_Variant {
    public static void main(String[] args) {
        int[] z = {6, 2, 3, 4, 7};
        MidB b = new MidB();
        b = b.methodA(z);
        b.methodB(1, 2);
        b = b.methodA(z);
    }
}