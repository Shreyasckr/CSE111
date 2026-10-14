public class Deliverer {
    private static int totalDeliverers = 0;
    private static double weightLimit = 20.0;

    private String name;
    private int id;
    private String routeCode;
    private Courier[] packages;
    private int packageCount;
    private double totalWeight;

    public Deliverer(String name) {
        this.name = name;
        totalDeliverers++;
        this.id = totalDeliverers;
        this.routeCode = "D" + id;
        this.packages = new Courier[5];
        this.packageCount = 0;
        this.totalWeight = 0;
        System.out.println("Deliverer ID: " + id + ", Name: " + name + " - ready for duty!");
    }

    public void assign(Courier c) {
        if (totalWeight + c.getWeight() > weightLimit) {
            System.out.println("Weight limit exceeded! Cannot assign " + c.getID() + ".");
        } else if (packageCount >= 5) {
            System.out.println("Package limit reached! Cannot assign " + c.getID() + ".");
        } else {
            packages[packageCount] = c;
            packageCount++;
            totalWeight += c.getWeight();
            System.out.println(name + " assigned: " + c.getID() + " \u2192 " + c.getDest());
        }
    }

    public void viewRoute() {
        System.out.println(name + "'s Route Code: " + routeCode);
        for (int i = 0; i < packageCount; i++) {
            System.out.println(packages[i].getID() + " \u2192 " + packages[i].getDest()
                    + " (" + packages[i].getWeight() + " kg)");
        }
        System.out.println("Total Weight: " + totalWeight + " kg");
    }

    public static void compare(Deliverer d1, Deliverer d2) {
        System.out.println("Delivery Comparison");
        System.out.println(d1.name + "'s total weight: " + d1.totalWeight);
        System.out.println(d2.name + "'s total weight: " + d2.totalWeight);
        if (d1.totalWeight > d2.totalWeight)
            System.out.println(d1.name + " takes the heavier load!");
        else if (d2.totalWeight > d1.totalWeight)
            System.out.println(d2.name + " takes the heavier load!");
        else
            System.out.println("It's a tie!");
    }
}