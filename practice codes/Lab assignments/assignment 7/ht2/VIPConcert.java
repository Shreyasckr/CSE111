public class VIPConcert extends Concert{
    public VIPConcert(String s1, String s2){
        super(s1, s2);
    }

    public void buyTicket(){
        super.buyTicket("VIP", 1);
    }
}