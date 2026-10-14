public class playerTest {
    public static void main(String[] args) {
        Player p1 = new Player("LM10", 38);
        System.out.println("--------1--------");
        p1.addAward("World Cup", 1);
        System.out.println("--------2--------");
        p1.display();
        System.out.println("--------3--------");
        System.out.println(p1.totalAwards());
        System.out.println("--------4--------");
        Player p2 = new Player("CR7", 40);
        System.out.println("--------5--------");
        String[] arr1 = {"UNL", "BDR", "UCL"};
        int[] arr2 = {2, 5, 5};
        for (int i = 0; i < arr1.length; i++) {
            p2.addAward(arr1[i], arr2[i]);
        }
        System.out.println("--------6--------");
        p2.addAward("PL", 3, "World Cup", 1);
        System.out.println("--------7--------");
        p2.display();
        System.out.println("--------8--------");
        System.out.println(p2.totalAwards());
        System.out.println("--------9--------");
        System.out.println(p2.clearAwards());
        System.out.println("--------10--------");
        System.out.println(p2.totalAwards());
        System.out.println("--------11--------");
        p2.display();
    }
}