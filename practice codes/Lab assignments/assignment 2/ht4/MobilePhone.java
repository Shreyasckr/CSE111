public class MobilePhone{
    public int concap;
    public int count = 0;
    public String[] name;
    public int[] num;
    
    public void setContactCapacity(int n){
        concap = n;
        name = new String[n];
        num = new int[n];
    }
    
    public void addContact(String s, int n){
        if(count<=concap-1){
            name[count] = s;
            num[count] = n;
            count++;
            System.out.println("The contact of " + s + " is added.");
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    
    public void details(){
        System.out.println("Total Contacts: "+count);
        System.out.println("Contact List:");
        if(count>0){
            for(int i = 0; i<count; i++){
                System.out.println(name[i] + ":" + num[i]);
            }
        }
    }
    
    public void makeCall(int n){
        boolean found = false;
        for(int i = 0; i<count; i++){
            if(num[i]==n){
                found = true;
                System.out.println("Calling "+name[i]+" . . .");
            }
        }
        if(!found){
            System.out.println("Calling "+n+" . . .");
        } 
    }
}