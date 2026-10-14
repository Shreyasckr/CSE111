public class UserTester {
    public static void main(String[] args) {
        System.out.println("Total premium: " + PremiumUser.count);
        PremiumUser p1 = new PremiumUser("alice");
        PremiumUser p2 = new PremiumUser("bob", "Gold");
        PremiumUser p3 = new PremiumUser("carol", "Platinum");
        System.out.println(p1.getProfile());
        System.out.println(p2.getProfile());
        System.out.println(p3.getProfile());
        System.out.println("Total premium: " + PremiumUser.count);
    }
}

//Total premium: 0
//User: alice | Tier: Silver
//User: bob | Tier: Gold
//User: carol | Tier: Platinum
//Total premium: 3