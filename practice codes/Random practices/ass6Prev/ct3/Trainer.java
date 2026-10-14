public class Trainer{
    public String name;
    public Pokemon[] pk = new Pokemon[7];
    public int count = 0;
    public double thp = 0.0;
    public static int id = 1;
    public int ID;
    
    public Trainer(String s){
        name = s;
        ID = id++;
        System.out.println("Trainer ID: "+ID+", Name: "+name+" - created");
    }
    
    public void catchPokemon(Pokemon obj){
        pk[count++] = obj;
        thp += obj.getHP();
        System.out.println(name+" caught: "+obj.getName());
    }
    
    public void viewPokeDex(){
        System.out.println(name+"'s Trainer code: T"+ID);
        for(int i = 0; i<count; i++){
            System.out.println(pk[i].getName()+": "+pk[i].getHP()+" points");
        }
        System.out.println("Average of hp: "+thp/count);
    }
    
    public static void battle(Trainer t1, Trainer t2){
        System.out.println("Battle info");
        System.out.println(t1.name+"'s average of hp: "+t1.thp/t1.count);
        System.out.println(t2.name+"'s average of hp: "+t2.thp/t2.count);
        if(t1.thp/t1.count > t2.thp/t2.count){
            System.out.println(t1.name+" wins");
        }
        else{
            System.out.println(t2.name+" wins");
        }
    }
}