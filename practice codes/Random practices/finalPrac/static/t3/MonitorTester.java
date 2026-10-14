public class MonitorTester {
    public static void main(String[] args) {
        System.out.println("Total Monitors: " + GamingMonitor.totalMonitors);
        System.out.println("Total Revenue: $" + GamingMonitor.totalRevenue);
        System.out.println("1-------------------");
        
        GamingMonitor m1 = new GamingMonitor("Asus VG249Q5R", 165, 250.0);
        m1.printDetails();
        System.out.println("2-------------------");
        
        System.out.println("Total Monitors: " + GamingMonitor.totalMonitors);
        System.out.println("Total Revenue: $" + GamingMonitor.totalRevenue);
        System.out.println("3-------------------");
        
        GamingMonitor m2 = new GamingMonitor("Generic Office Screen", 60, 100.0);
        m2.printDetails();
        System.out.println("4-------------------");
        
        m2.setRefreshRate(144);
        m2.setPrice(150.0);
        m2.printDetails();
        System.out.println("5-------------------");
        
        System.out.println("Total Monitors: " + GamingMonitor.totalMonitors);
        System.out.println("Total Revenue: $" + GamingMonitor.totalRevenue);
    }
}