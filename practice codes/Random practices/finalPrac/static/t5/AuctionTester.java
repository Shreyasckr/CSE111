public class AuctionTester {
    public static void main(String[] args) {
        Auction.auctionSummary();
        System.out.println("---1---");
        Auction item1 = new Auction("Painting", 500);
        Auction item2 = new Auction("Vase", 200);
        System.out.println("---2---");
        item1.placeBid("Rina", 600);
        item1.placeBid("Joon", 580);
        item1.placeBid("Rina", 750);
        System.out.println("---3---");
        item2.placeBid("Tom", 250);
        item2.placeBid("Amy", 300);
        System.out.println("---4---");
        Auction.auctionSummary();
        System.out.println("---5---");
        item1.close();
        item2.close();
        System.out.println("---6---");
        item1.close();
    }
}

//No items in auction.
//---1---
//Item listed: Painting (Starting: 500)
//Item listed: Vase (Starting: 200)
//---2---
//Rina bids 600 on Painting. [New highest!]
//Joon's bid 580 is too low for Painting.
//Rina bids 750 on Painting. [New highest!]
//---3---
//Tom bids 250 on Vase. [New highest!]
//Amy bids 300 on Vase. [New highest!]
//---4---
//Active Items: 2
//Item: Painting | Top Bid: 750 by Rina
//Item: Vase | Top Bid: 300 by Amy
//---5---
//Painting SOLD to Rina for 750!
//Vase SOLD to Amy for 300!
//---6---
//Painting auction already closed.