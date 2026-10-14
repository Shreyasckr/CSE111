public class GymMember {
    public static int memberCount = 0;
    public static double totalRevenue = 0;
    private static int bronzeCount = 0;
    private static int silverCount = 0;
    private static int goldCount = 0;

    private String name;
    private String tier;
    private double balance;

    public GymMember(String name, String tier, double joiningFee) {
        this.name = name;
        this.tier = tier;
        this.balance = 0;
        memberCount++;
        totalRevenue += joiningFee;
        if (tier.equals("Bronze"))      bronzeCount++;
        else if (tier.equals("Silver")) silverCount++;
        else if (tier.equals("Gold"))   goldCount++;
        System.out.println(name + " joined as " + tier + " member. Fee paid: " + joiningFee);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit.");
        } else {
            balance += amount;
            totalRevenue += amount;
            System.out.println(amount + " deposited to " + name + "'s account.");
        }
    }

    public void upgradeTier() {
        if (tier.equals("Bronze")) {
            bronzeCount--;
            silverCount++;
            tier = "Silver";
            System.out.println(name + " upgraded to Silver!");
        } else if (tier.equals("Silver")) {
            silverCount--;
            goldCount++;
            tier = "Gold";
            System.out.println(name + " upgraded to Gold!");
        } else {
            System.out.println(name + " is already at the highest tier!");
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name + " | Tier: " + tier + " | Balance: " + balance);
    }

    public static void summary() {
        System.out.println("=== Gym Summary ===");
        System.out.println("Total Members: " + memberCount);
        System.out.println("Total Revenue: " + totalRevenue);
        System.out.println("Bronze: " + bronzeCount);
        System.out.println("Silver: " + silverCount);
        System.out.println("Gold: " + goldCount);
    }
}