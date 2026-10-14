public class MagicTester {
    public static void main(String[] args) {
        MagicPotion potion = new MagicPotion();
        potion.setDetails("blue", 4);
        System.out.println("======================");
        potion.activate();
        potion.describe();
        System.out.println("=======================");
        potion.boost();
        potion.describe();
        System.out.println("=======================");
        potion.activate();
        potion.describe();
        System.out.println("=======================");
        System.out.println("Is potion strong? "+
                           potion.isStrong());
        System.out.println("=======================");
        potion.boost();
        potion.activate();
        potion.describe();
        System.out.println("=======================");
        System.out.println("Is potion strong? " +
                           potion.isStrong());
        System.out.println("=======================");
        potion.boost();
        System.out.println("Is potion strong? " +
                           potion.isStrong());
        System.out.println("========================");
        potion.weaken();
        potion.weaken();
        potion.weaken();
        potion.describe();
    }
}