public class ConnectFriends{
    public String name;
    public int max = 2;
    public String[] frnd;
    public int count;
    
    public ConnectFriends(String s){
        name = s;
        frnd = new String[2];
        System.out.println("Welcome to ConnectFriends, "+name);
    }
    
    public ConnectFriends(String s, int n){
        name = s;
        max = n;
        frnd = new String[n];
        System.out.println("Welcome to ConnectFriends, "+name);
    }
    
    public void sendFriendRequest(ConnectFriends obj){
        if(count == max){
            System.out.println(name+" has reached the friend request limit!");
        }
        else{
            frnd[count++] = obj.name;
            System.out.println(name+" sent a friend request to "+obj.name);
        }
    }
    
    public void sendFriendRequest(ConnectFriends obj1, ConnectFriends obj2){
        sendFriendRequest(obj1);
        sendFriendRequest(obj2);
    }
    
    public void removeRequest(String s){
        boolean found = false;
        for(int i = 0; i < count; i++){
            if(frnd[i].equals(s)){
                found = true;
                for(int j = i; j < count-1; j++){
                    frnd[j] = frnd[j+1];
                }
                frnd[count-1] = null;
                count--;
                System.out.println("Request to add "+s+" is removed for "+name);
                break;
            }
        }
        if(!found){
            System.out.println(s+" is not in "+name+"'s sent request list.");
        }
    }
    
    public void showDetails(){
        System.out.println("User Name: "+name);
        System.out.println("Maximum number of Sent Friend Request: "+max);
        System.out.println("Total Friends Request: "+count);
        System.out.print("Sent Friends Request: ");
        for(int i = 0; i < count; i++){
            System.out.print(frnd[i]+" ");
        }
        System.out.println();
    }
}