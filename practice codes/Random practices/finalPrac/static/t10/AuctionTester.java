public class AuctionTester {
    public static void main(String[] args) {
        System.out.println("Min Bid Increment: " + AuctionItem.minBidIncrement);
        System.out.println("=====1=====");
        AuctionItem item1 = new AuctionItem("Vintage Watch", 500.0);
        AuctionItem item2 = new AuctionItem("Rare Painting", 2000.0);
        System.out.println("=====2=====");
        item1.printInfo();
        System.out.println("=====3=====");
        item1.bid("Nadia", 550.0);
        item1.bid("Tanvir", 560.0);
        item1.bid("Nadia", 620.0);
        System.out.println("=====4=====");
        item1.printInfo();
        System.out.println("=====5=====");
        item1.sell();
        System.out.println("=====6=====");
        item1.bid("Tanvir", 700.0);
        System.out.println("=====7=====");
        item2.bid("Sohel", 2100.0);
        System.out.println("=====8=====");
        AuctionItem.auctionSummary();
    }
}

//Min Bid Increment: 50.0
//=====1=====
//Item: Vintage Watch | Starting Price: 500.0 | Status: Open
//Item: Rare Painting | Starting Price: 2000.0 | Status: Open
//=====2=====
//Item: Vintage Watch | Current Bid: 500.0 | Highest Bidder: None
//=====3=====
//Nadia placed a bid of 550.0 on Vintage Watch.
//Bid too low! Minimum bid is 600.0.
//Nadia placed a bid of 620.0 on Vintage Watch.
//=====4=====
//Item: Vintage Watch | Current Bid: 620.0 | Highest Bidder: Nadia
//=====5=====
//Vintage Watch sold to Nadia for 620.0!
//=====6=====
//Bidding closed for Vintage Watch.
//=====7=====
//Sohel placed a bid of 2100.0 on Rare Painting.
//=====8=====
//=== Auction Summary ===
//Items Sold: 1
//Total Revenue: 620.0