public class NavigationTester {
    public static void main(String[] args) {
        Road r1 = new Road("HighwayA",2,7);
        Road r2 = new Road("DarkStreet",8,2);
        Road r3 = new Road("RiverRoad",3,6);
        Road r4 = new Road("HillWay",6,5);
        Road r5 = new Road("MarketRoad",8,5);
        r1.roadDetails();
        System.out.println("1==============");
        NavigationSystem n1 = new NavigationSystem("CitySafe");
        System.out.println("2==============");
        n1.addRoad(r1);
        n1.addRoad(r2);
        n1.addRoad(r3);
        n1.addRoad(r4);
        n1.addRoad(r5);
        System.out.println("3==============");
        n1.systemReport();
        System.out.println("4==============");
        n1.checkRoute(r1,"Emergency");
        System.out.println("5==============");
        n1.checkRoute(r4,"Emergency");
        System.out.println("6==============");
        n1.checkRoute(r5,"Emergency");
        System.out.println("7==============");
        n1.checkRoute(r3);
        System.out.println("8==============");
        n1.checkRoute(r2);
    } 
}


//Road Name: HighwayA
//Accident Count: 2
//Lighting Level: 7
//1==============
//Navigation System CitySafe activated.
//2==============
//3==============
//Navigation System: CitySafe
//Total Roads: 5/10
//HighwayA : Safe
//DarkStreet : Unsafe
//RiverRoad : Safe
//HillWay : Unsafe
//MarketRoad : Unsafe
//4==============
//Route HighwayA is safe. Continue driving.
//5==============
//Emergency route allowed via HillWay
//6==============
//Warning! MarketRoad is unsafe.
//Searching for alternate route...
//Redirecting to RiverRoad
//7==============
//Route RiverRoad is safe. Continue driving.
//8==============
//Warning! DarkStreet is unsafe.
//Searching for alternate route...
//Redirecting to HighwayA