import java.util.Random;
import java.util.Scanner;

public class task3 {
    private static int rnd_number; // Random number to guess
    private static Scanner scanner = new Scanner(System.in); // Create a Scanner object

    public static void main(String[] args) {
        // Pick a random number between 1 and 100
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1; // Generate a random number
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");

        // Start the guessing process
        makeAGuess();
    }

    private static void makeAGuess() {
        System.out.print("Enter your guess: ");

        // Check if the input is numeric
        if (scanner.hasNextInt()) {
            int guess = scanner.nextInt(); // Read user input

            // Compare the guess with the random number
            if (guess < rnd_number) {
                System.out.println("Your guess is too low. Try again!");
                makeAGuess(); // Let the user try again
            } else if (guess > rnd_number) {
                System.out.println("Your guess is too high. Try again!");
                makeAGuess(); // Let the user try again
            } else {
                System.out.println("Congratulations! You've guessed the number: " + rnd_number);
            }
        } else {
            // If input was not numeric, show an error message
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next(); // Clear the invalid input
            makeAGuess(); // Let the user try again
        }
    }
}