public class Tester {
    public static void main(String[] args) {
        WeatherReport gp = new WeatherReport(25.5,65, 15);
        System.out.println("---------1-");
        gp.displayReport();
        System.out.println("---------2-------");
        RainReport rp1 = new RainReport(22.3, 80,10, 60.5, true);
        RainReport rp2 = new RainReport(18.0, 54,67, 15.0, false);
        RainReport rp3 = new RainReport(20.0, 70,26, 30.0, true);
        rp1.displayReport();
        System.out.println("-------3----");
        rp1.rainFallStatus();
        System.out.println("- -4----");
        rp2.rainFallStatus();
        System.out.println("- -5---");
        rp3.rainFallStatus();
        System.out.println(" -6---------");
        gp.compareWith(rp1);
        System.out.println("- -7- ");
        rp1.compareWith(rp2);
    }
}