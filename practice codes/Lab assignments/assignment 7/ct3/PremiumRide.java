class PremiumRide extends Ride {
    private boolean surge;
    private boolean hasDiscount = false;
    private int ticketNum;
    private static int ticketCounter = 1;

    public PremiumRide(int distance, boolean surge) {
        super(distance);
        this.surge = surge;
        this.ticketNum = ticketCounter++;
    }

    public String getId() {
        return ticketNum + "-" + (int)getDistance();
    }

    @Override
    public double calculateFare() {
        double fare = super.calculateFare() + 50; // Add 50 TK service charge
        if (surge) {
            fare += (fare * 20.0) / 100.0;
        }
        return fare;
    }

    public double calculateFare(int amount) {
        hasDiscount = true;
        return calculateFare() - amount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID: " + getId() + "\nService Charge: 50 TK\nSurge: " + surge + "\nDiscount: " + hasDiscount;
    }
}