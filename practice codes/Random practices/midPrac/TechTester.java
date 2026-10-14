public class TechTester {
    public static void main(String[] args) {
        Laptop l1= new Laptop("Intel","I7","8 GB");
        Laptop l2= new Laptop("Intel","I9","16 GB");
        Laptop l3= new Laptop("AMD","Ryzen 6","16 GB");
        System.out.println("1==============");
        System.out.println(l1.details());
        System.out.println("2==============");
        TechShop shop1 = new TechShop("TechFrantic");
        System.out.println("3==============");
        shop1.addLaptop(l1, l2);
        shop1.addLaptop(l3);
        System.out.println("4==============");
        shop1.shopDetails();
        System.out.println("5==============");
        System.out.println(shop1.sellLaptop(l2));
        System.out.println("6==============");
        shop1.shopDetails();
        System.out.println("7==============");
        l3.markDeffective();
        System.out.println(l3.details());
        System.out.println("8==============");
        System.out.println(shop1.sellLaptop(l3));
        System.out.println("9==============");
        shop1.shopDetails();
        System.out.println("10==============");
        System.out.println("Recent sold: "+shop1.recentSold.details());
    }
}