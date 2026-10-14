public class SorterBot {
    public void processItem(Waste item) {
        if (item instanceof UsedBattery) {
            UsedBattery b = (UsedBattery) item;
            System.out.println("Scanning Item " + b.id + " [Type: " + b.type + "]");
            if (b.leak) {
                System.out.println(b.id + " is leaking. Sealing in concrete container.");
            }
        } else if (item instanceof PlasticBottle) {
            PlasticBottle p = (PlasticBottle) item;
            System.out.println("Scanning Item " + p.id + " [Type: " + p.type + "]");
            System.out.println(p.id + " compressed from " + p.ml + "ml to flat disk.");
        } else {  // it's a plain Waste
            System.out.println("Scanning Item " + item.id + " [Type: UNKNOWN]");
            System.out.println("Item sent to generic incinerator.");
        }
        System.out.println("-------------------------------");
    }
}
