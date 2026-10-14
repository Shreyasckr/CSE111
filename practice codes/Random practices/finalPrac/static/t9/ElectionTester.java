public class ElectionTester {
    public static void main(String[] args) {
        System.out.println("Candidates: " + Candidate.totalCandidates);
        System.out.println("Votes Cast: " + Candidate.totalVotes);
        System.out.println("=====1=====");
        Candidate c1 = new Candidate("Alice", "Party A");
        Candidate c2 = new Candidate("Bob", "Party B");
        Candidate c3 = new Candidate("Carol", "Party A");
        System.out.println("=====2=====");
        c1.receiveVote(300);
        c2.receiveVote(450);
        c3.receiveVote(200);
        System.out.println("=====3=====");
        c1.receiveVote(-50);
        System.out.println("=====4=====");
        c1.printStats();
        System.out.println("=====5=====");
        System.out.println("Total Votes: " + Candidate.totalVotes);
        System.out.println("Leader: " + Candidate.findLeader());
        System.out.println("=====6=====");
        Candidate.partyTotal("Party A");
    }
}

//Candidates: 0
//Votes Cast: 0
//=====1=====
//Alice (Party A) registered.
//Bob (Party B) registered.
//Carol (Party A) registered.
//=====2=====
//Alice received 300 votes.
//Bob received 450 votes.
//Carol received 200 votes.
//=====3=====
//Invalid vote count.
//=====4=====
//Candidate: Alice | Party: Party A | Votes: 300
//=====5=====
//Total Votes: 950
//Leader: Bob with 450 votes
//=====6=====
//Party A Total Votes: 500
