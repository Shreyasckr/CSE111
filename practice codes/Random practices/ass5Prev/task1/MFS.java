public class MFS{
    public String accno;
    public int bal = 0;
    public boolean card = false;
    public Card c;
    
    public MFS(String s){
        accno = s;
        System.out.println("Account created. ");
        System.out.println("AccNo: "+accno);
        System.out.println("Balance: "+bal);
        System.out.println("Card not saved." );
    }
    
    public void addNewCard(Card obj){
        c = obj;
        card = true;
        System.out.println(obj.name+" Card added to MFS "+accno);
    }
    
    public void addMoneyFromCard(int n){
        if(card==false){
            System.out.println("Please add a card to your MFS account");
        }
        else{
            if(n>c.bal){
                System.out.println("Insufficient balance in "+c.name+" card.");
            }
            else{
                this.bal += c.bal;
                c.bal -= n;
                System.out.println("Transfer successful");
                System.out.println("MFS balance: "+this.bal);
                System.out.println("MFS balance: "+c.bal);
            }
        }
    }
}