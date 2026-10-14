public class Concert {
    public String venue;
    public String showtime;
    public String[] artists = new String[5];
    public int count = 0;
    public int sold = 0;
    public static int total = 0;
    
    public Concert(String s1, String s2) {
        venue = s1;
        showtime = s2;
    }
    
    public void addArtist(String name) {
        if(count<5){
            artists[count++] = name;
        }
    }
    
    public void buyTicket(String s, int n) {
        int price = getZonePrice(s);
        sold += n;
        total += n;
        System.out.println("Total price: " + (price * n));
    }
    
    public void buyTicket(String s) {
        buyTicket(s, 1);
    }
    
    public int getZonePrice(String s) {
        if(s.equals("A")){
            return 500;
        } 
        else if(s.equals("B")){
            return 1000;
        }
        else if(s.equals("VIP")){
            return 2000;
        }
        else{
            return 0;
        }
    }
    
    public void showDetails(){
        System.out.println("Venue: " + venue + "\nShowtime: " + showtime + "\nArtist:");
        for (int i = 0; i<count; i++) {
            System.out.println("-" + artists[i]);
        }
        System.out.println("Tickets sold in this concert: " + sold);
    }
    
    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): " + total);
    }
}