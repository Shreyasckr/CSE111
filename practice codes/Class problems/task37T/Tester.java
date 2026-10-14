public class Tester {
    public static void main(String [] args) {
        A a1 = new A();
        A a2 = new A(2);
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(2, 3);
        b2.methodB(3, 8);       
    }
}

