import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    
        // Welcome to the message
        System.out.println("Welcome to the guessing game.");
        
        // Declare and initalize a variable to store the number of times the user attempted to guess the computer's number
        // Set to 1 to account for the first guess
        int numberOfGuesses = 1;
        
        Random rand = new Random(); // Create a new random object named 'rand' to generate a random value from 0-100 (inclusive)
        int computerNumber = rand.nextInt(101); // Declare and initalize an int varaible named 'computerNumber' to hold a random value from 0-100 (inclusive)
        
        // Delcare and initalize a new Scanner object named 'userInput' to get the user's guess
        Scanner userInput = new Scanner(System.in);
        int personGuess = 0; //Declare and initaliz the variable to hold the user's input

        // While the person's guess is equal to the computer's predetermined number -- continuing asking for a new guess
        while (personGuess != computerNumber) {
          System.out.println("Enter a guess. Your guess must be an integer 0-100. "); // Tell the user to guess a number between 0-100 (inclusive)
          personGuess = userInput.nextInt(); // Set the already declared and initalized variable of 'personGuess' to the scanner's next integer value
          
          // If the person's guess is too high
          if (personGuess > computerNumber) {
            System.out.println("Your guess is too high. Try again."); // Print the guess is too high
            numberOfGuesses++; // Increase the number of guesses by 1 to account for the guess
          } else if (personGuess < computerNumber) { // If the person's guess is too low
            System.out.println("Your guess is too low. Try again."); // Print the guess is too low
            numberOfGuesses++; // Increase the number of guesses by 1 to account for the guess
          } 
        }
        
        // If the user guesses the correct number
        if (personGuess == computerNumber) {
          System.out.println("Congratulations! You guess the correct number and it only took you " + numberOfGuesses + " tries!"); // Print that the guess is correct with the number of guesses it took to get the correct number
          userInput.close(); // Close the scanner
        }
    }
}
