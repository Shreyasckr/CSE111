public class Desktop{
    public static Game[] game = new Game[3];
    public static Desktop[] user = new Desktop[3];
    public static int count = 0;
    public static int userCount = 0;
    public static int ID = 1;
    public static int storage = 512;
    
    public String name;
    public int id;
    
    public Desktop(String s){
        name = s;
        id = ID++;
        userCount++;
        System.out.println(name+"(ID:"+id+") logged in!");
    }
    
    public void installGame(Game obj){
        if(count<3){
            if(storage-obj.getGB() < 0){
                System.out.println("Not enoght storage!");
            }
            else{
                game[count] = obj;
                user[count++] = this;
                storage -= obj.getGB();
                System.out.println((obj.getName()+" installed successfully!"));
            }
        }
        else{
            System.out.println("Cannot install more than 3 games!"); 
        }
    }
    
    public static void displayInfo(){
        System.out.println("Desktop Info: ");
        System.out.println("Storage: "+storage);
        if(storage == 512){
            System.out.println("No games installed!");
        }
        else{
            System.out.println("Games installed: ");
            for(int i = 0; i<count; i++){
                System.out.println((i+1)+". "+game[i].getName()+"("+game[i].getGB()+" GB) - Installed by: "+user[i].name+"(ID:"+user[i].id+")");
            }
        }
    }
}