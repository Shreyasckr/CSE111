public class Card{
    public int bal;
    public String name;
    
    public Card(int n, String s){
        bal = n;
        name = s;
        System.out.println(name+" Card created successfully");
        System.out.println("Balance: "+bal);
    }
    
    public void addMoneyFromAccount(int n, MFS obj){
        if(n>obj.bal){
            System.out.println("Insufficient balance");
        }
        else{
            this.bal += obj.bal;
            obj.bal -= n;
            System.out.println("New balance in card:"+bal);
        }
    }
}