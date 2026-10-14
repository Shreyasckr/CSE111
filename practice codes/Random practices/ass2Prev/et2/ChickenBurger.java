public class ChickenBurger{
    public String bun = "Sesame";
    public int price = 200;
    public String sauceOption = "less";
    public String spiceLevel = "Not Set";
    String[] splvl = {"Mild", "Spicy", "Naga", "Extreme"};
    
    public String serveBurger(){
        if(spiceLevel.equals("Not Set")){
            return "Cannot serve now. Customize Spice Level first.";
        }
        else{
            String details = "The burger is being served:-" + "\n" + "Bun Type: " + bun + "\n" +
                "Price: " + price + "\n" +
                "Sauce Option: " + sauceOption + "\n" +
                "Spice Level: " + spiceLevel;
            return details;
        }
    }
    
    public void customizeSpiceLevel(String s){
        boolean found = false;
        for(int i = 0; i < splvl.length; i++){
            if(splvl[i].equals(s)){
                found = true;
            }
        }
        if(found==true){
            spiceLevel = s;
            System.out.println("Spice level set to " + s + ".");
        }
        else{
            System.out.println("This spice level is unavailable.");
        }
    }
}