import java.util.Scanner;

public class Maintre {
public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please type your name");
	
	String name = scanner.nextLine();
	
	System.out.println("Hello, "+ name + " Welcome to City 17. ");
	
	System.out.println("Please choose a profession:");
	System.out.println("1. Coal Miner");
	System.out.println("2. Hazardous Material Disposer");
	System.out.println("3. Stalker");
	
	int proffesionChoice = scanner.nextInt();
	
	String profession = "";
	
	switch (proffesionChoice) {
		case 1:
		profession = "Coal Miner";
		break;
		case 2:
		profession = "Hazardous Material Disposer";
		break;
		case 3:
		profession = "Stalker";
		break;
		default:
		System.out.println("Invalid choice. Defaulting to 'Unemployed'.");
                profession = "Unemployed";
                break;
	}
	
	scanner.nextLine();
	
	System.out.println("Please type your age");
	String ageInput = scanner.nextLine();
	
	int age = Integer.parseInt(ageInput);
	
	int retirementAge = 89;
	
	int yearsUntilRetirement = retirementAge - age;
	
	System.out.println(age + " Years of age," + " The age of a free... man.");
	
	System.out.println("You have " + yearsUntilRetirement + " years of coal mine work until retirement or execution.");
	
	
}
}