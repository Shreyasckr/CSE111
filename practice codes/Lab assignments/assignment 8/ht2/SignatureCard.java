public class SignatureCard extends CreditCard{
    
    public SignatureCard(String s1, String s2){
        super(s1, s2, 200);
    }
    
    public void spendCash(int n){
        System.out.println("Previous Reward Points: " + rewardPoints);
        int x = (n/100)*4;
        rewardPoints += x;
        System.out.println("Reward points after spending " + n);
        System.out.println("taka: " + rewardPoints);
    }
    
    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}