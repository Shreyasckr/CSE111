public class PlatinumCard extends CreditCard{
    
    public PlatinumCard(String s1, String s2){
        super(s1, s2, 100);
    }
    
    public void spendCash(int n){
        System.out.println("Previous Reward Points: " + rewardPoints);
        int x = (n/100)*2;
        rewardPoints += x;
        System.out.println("Reward points after spending " + n);
        System.out.println("taka: " + rewardPoints);
    }
}