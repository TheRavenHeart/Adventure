import java.util.Scanner;

public class Adventure
{
public static String playerName;
public static Scanner sc;
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        
        System.out.println("Greetings adventures! Please enter your name: ");
        
        playerName = sc.nextLine();
        
        System.out.println("Ah, I see your name is " + playerName + ". Intresting...");
        
        System.out.println("Well I shant be keeping you, you must be on your way to the yawning portal.");
        StartRoom();
        
    }
    public static void StartRoom() {
            System.out.println("You find yourself before a large swirling portal. While you look on it in wonder you are suddenly pushed inside of the portal.");
            System.out.println("While falling what seems like an an eternity you see five strands of varying colour. One of ashen black, one of bright green, one of rust, one of silver and, one of blood red");
            System.out.println("press 1 to grab the ashen black strand ");
            System.out.println("press 2 to grab the one of bright green strand ");
            System.out.println("press 3 to grab the rust strand ");
            System.out.println("press 4 to grab the blood red strand ");
            System.out.println("press 5 to grab the silver strand ");
            String strandChoice = sc.nextLine(); 
            
            if (strandChoice.equals("1")) {
            System.out.println("You suddenly appear in a dark, blackened world. What appears to be snow you soon find is black ash that burns away at your skin.");
        }   
        } 
}
