public class Spaceship{
    public String name;
    public int capacity;
    public int cWeight;
    public String[] cargo = new String[5];
    public int count = 0;
    
    public Spaceship(String s, int n){
        name = s;
        capacity = n;
    }
    
    public void loadCargo(Cargo obj){
        if(cWeight+obj.getWeight()<capacity){
            cWeight += obj.getWeight();
            cargo[count++] = obj.getName();
        }
        else{
            int extra = (cWeight+obj.getWeight()) - capacity;
            System.out.println("Warning: Unable to load "+ obj.getName() +" inside "+name+". Exceeds capacity by "+extra+".");
        }
    }
    
    public void displayDetails(){
        System.out.println("Spaceship Name: "+name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Current Cargo Weight: "+cWeight);
        System.out.print("Cargo: ");
        for(int i = 0; i<count; i++){
            System.out.print(cargo[i]+" ");
        }
        System.out.println();
    }
}