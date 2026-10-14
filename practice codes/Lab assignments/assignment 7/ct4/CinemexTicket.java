class CinemexTicket extends MovieTicket {
    private static int totalTickets = 0;
    private String genre;
    private String seatType = "Regular";
    private String status = "Not Paid";
    private String ticketId;

    public CinemexTicket(String movie, String showtime, String genre, String date) {
        super(movie, date, showtime, 0);
        this.genre = genre;
        this.seat = "Regular";
        totalTickets++;
        generateTicketId();
    }

    public CinemexTicket(String movie, String showtime, String genre, String date, String seatType) {
        super(movie, date, showtime, 0);
        this.genre = genre;
        this.seatType = seatType;
        this.seat = seatType;
        totalTickets++;
        generateTicketId();
    }

    private void generateTicketId() {
        ticketId = getMovie() + "-" + seatType.charAt(0) + "-" + totalTickets;
    }

    public static int getTotalTickets() {
        return totalTickets;
    }

    public void calculateTicketPrice() {
        double basePrice = 0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (seatTypes[i].equals(seatType)) {
                basePrice = seatPrices[i];
                break;
            }
        }
        
        int hour = Integer.parseInt(showtime.split(":")[0]);
        if (hour >= 18 && hour <= 23) {
            basePrice += basePrice * (nightShowCharge / 100.0);
        }
        setPrice(basePrice);
        System.out.println("Ticket price is calculated successfully.");
    }

    public String confirmPayment() {
        if (status.equals("Paid")) {
            return "Ticket price is already paid!";
        } else {
            status = "Paid";
            return "Payment Successful.";
        }
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + "\n" + super.toString() + "\nGenre: " + genre + 
               "\nSeat Type: " + seatType + "\nPrice(tk): " + getPrice() + "\nStatus: " + status;
    }
}