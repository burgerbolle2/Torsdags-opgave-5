import java.util.ArrayList; 
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String> actions; 

    public GameMenu() {
		System.out.println("Welcome to Half-life 2!"); 
        actions = new ArrayList<>(); 
		
    }
	
	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

    public static void main(String[] args) {
        GameMenu defaultMenu = new GameMenu();
		defaultMenu.showMenu();
		
		
		
		ArrayList<String> initialActions = new ArrayList<>();
		initialActions.add("Start Game");
		initialActions.add("Load Game");
		initialActions.add("Enter Secret Codes");
		initialActions.add("Extras");
		initialActions.add("Exit");

		GameMenu customMenu = new GameMenu(initialActions);
		customMenu.showMenu();
	
		String userChoice = customMenu.getAction();
		System.out.println("You selected: " + userChoice);
		 
    }


    public void showMenu() {
       
		if (actions.isEmpty()) {
			System.out.println("No actions available.");
		} else{
			System.out.println("Actions: " + actions);
		}
	}
		public String getAction() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Type a number to choose an action!");
			for (int i = 0; i < actions.size(); i++) {
				System.out.println((i+1) + ". " + actions.get(i));
			}
			
	}
	String choice = scanner.nextLine();
	
	return choice;


    }

	
	