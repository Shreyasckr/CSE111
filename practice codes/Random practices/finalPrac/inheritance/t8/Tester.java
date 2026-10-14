class Tester {
    public static void main(String[] args) {
        Sentry s = new Sentry("Bob", "Thunderbolts", "Power of a Million Exploding Suns", 85);
        System.out.println(s);
        System.out.println("1================");
        s.unleashPower();
        System.out.println("2================");
        s.decreaseStability(30);
        System.out.println("3================");
        s.unleashPower();
        System.out.println("4================");
        s.decreaseStability(20);
        s.decreaseStability(10);
        System.out.println("5================");
        s.unleashPower();
        System.out.println("6================");
        System.out.println(s);
    }
}
