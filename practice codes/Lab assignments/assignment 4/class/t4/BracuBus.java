public class BracuBus{
    public String route;
    public int max = 2;
    public BracuStudent[] std;
    public int count;
    
    public BracuBus(String s){
        route = s;
        std = new BracuStudent[2];    
    }
    
    public BracuBus(String s, int n){
        route = s;
        max = n;
        std = new BracuStudent[n];    
    }
    
    public void showDetails(){
        System.out.println("Bus Route: "+route);
        System.out.println("Passenger Count: "+count+" (Max: "+max+")");
        System.out.println("Passenger on board: ");
        for(int i = 0; i<count; i++){
            System.out.print(std[i].name+" ");
        }
        System.out.println();
    }
    
    public void board(){
        System.out.println("No passengers");
    }
    
    public void board(BracuStudent st){
        if(count == max){
            System.out.println("Bus is full");
        }
        else{
            if(!st.pass){
                System.out.println("You don't have a bus pass!");
            }
            else{
                if(st.getLocation().equals(route)){
                    System.out.println(st.name+" boarded the bus");
                    std[count++] = st;
                }
                else{
                    System.out.println("You got on the wrong bus!");
                }
            }
        }
    }
    
    public void board(BracuStudent st1, BracuStudent st2){
        board(st1);
        board(st2);
    }
}