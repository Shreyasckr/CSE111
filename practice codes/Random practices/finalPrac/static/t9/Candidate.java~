public class Candidate{
    public String name;
    public String party;
    public int vote;
    
    public static int totalCandidates = 0;
    public static int totalVotes = 0;
    public static Candidate[] can = new Candidate[3];
    public static int count = 0;
    public static String lead;
    public static int leadv = 0;
    
    public Candidate(String s, String f){
        name = s;
        party = f;
        can[count++] = this;
        totalCandidates++;
        System.out.println(name+" "+party+" registered");
    }
    
    public void receiveVote(int n){
        if(n<=0){
            System.out.println("Invalid vote count.");
        }
        else{
            vote += n;
            totalVotes += vote;
            System.out.println(name+" received "+vote+" votes");
            if(n>leadv){
                lead = name;
                leadv = n;
            }
        }
    }
    
    public void printStats(){
        System.out.println("Candidate: "+name+" | Party: "+party+" | Votes: "+vote);
    }
    
    public static String findLeader(){
        return lead+" with "+leadv+" votes";
    }
    
    public static void partyTotal(String s){
        int t = 0;
        for(int i = 0; i<count; i++){
            if(s.equals(can[i].party)){
                t += can[i].vote;
            }
        }
        System.out.println(s+" total votes: "+t);
    }
}