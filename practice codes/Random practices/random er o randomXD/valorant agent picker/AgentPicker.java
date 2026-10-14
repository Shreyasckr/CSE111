import java.util.Random;
import java.util.Scanner;
public class AgentPicker{
    public static void main(String[] args){
        String[] duelists   = {"Phoenix", "Reyna", "Jett", "Raze", "Yoru", "Neon", "Iso", "Waylay"};
        String[] initiators = {"Sova", "Breach", "Skye", "KAY/O", "Fade", "Gekko", "Tejo"};
        String[] sentinels  = {"Sage", "Cypher", "Killjoy", "Chamber", "Deadlock", "Vyse", "Veto"};
        String[] controllers = {"Brimstone", "Viper", "Omen", "Astra", "Harbor", "Clove", "Miks"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("VALORANT AGENT PICKER\n");
        System.out.println("Select a role:\n"+"1. Duelist\n"+"2. Initiator\n"+"3. Sentinel\n"+"4. Controller\n");
        System.out.print("\nEnter your choice (1-4): ");
        String choice = scanner.nextLine();
        String selectedAgent = null;
        if(choice.equals("1")){
            selectedAgent = duelists[random.nextInt(duelists.length)];
        } 
        else if (choice.equals("2")){
            selectedAgent = initiators[random.nextInt(initiators.length)];
        }
        else if (choice.equals("3")){
            selectedAgent = sentinels[random.nextInt(sentinels.length)];
        } 
        else if(choice.equals("4")){
            selectedAgent = controllers[random.nextInt(controllers.length)];
        } 
        else{
            System.out.println("Khankirpola 1-4 er moddhe choose kor.");
        }

        if (selectedAgent != null) {
            System.out.println("\nYour agent: " + selectedAgent);
        }
    }
}