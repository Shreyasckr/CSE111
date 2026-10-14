public class DesktopTester{
    public static void main(String[] args){
        Game g1 = new Game("Valorant", 100);
        Game g2 = new Game("GTA V", 200);
        Game g3 = new Game("FC 25", 300);
        Game g4 = new Game("MineCraft", 150);
        Game g5 = new Game("Overwatch", 70);
        System.out.println("1===========");
        System.out.println("User Count: " + Desktop.userCount);
        System.out.println("2===========");
        Desktop.displayInfo();
        System.out.println("3===========");
        Desktop user1 = new Desktop("Clark");
        System.out.println("4===========");
        Desktop user2 = new Desktop("Bruce");
        System.out.println("5===========");
        user2.installGame(g1);
        System.out.println("6===========");
        Desktop.displayInfo();
        System.out.println("7===========");
        user1.installGame(g2);
        user2.installGame(g3);
        user1.installGame(g4);
        user2.installGame(g5);
        System.out.println("8===========");
        Desktop.displayInfo();
        System.out.println("9===========");
        System.out.println("User Count: " + Desktop.userCount);
        System.out.println("10===========");
        Desktop user3 = new Desktop("Barry");
        System.out.println("11===========");
        System.out.println("User Count: " + Desktop.userCount);
    }
}