import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
        // Welcome message for the user
        System.out.println("Welcome to the guessing game.");

        // Declare and initalize a variable to store the number of times the user attempted to guess the computer's number
        // Set to 1 to account for the first guess
        int numberOfGuesses = 1;

        Random rand = new Random(); // Create a new random object named 'rand' to generate a random value from 0-100 (inclusive)
        int computerNumber = rand.nextInt(101); // Declare and initalize an int varaible named 'computerNumber' to hold a random value from 0-100 (inclusive)

        // Delcare and initalize a new Scanner object named 'userInput' to get the user's guess
        Scanner userInput = new Scanner(System.in);
        int personGuess; //Declare the variable to hold the user's input

        System.out.println("Enter a guess. Your guess must be an integer 0-100. "); // Tell the user to guess a number between 0-100 (inclusive)

        // Check the user's input through the scanner
        while (!userInput.hasNextInt()) { // As long as the user's input is NOT an integer
          System.out.println("Error! You have to enter an integer between 0 and 100. Try again. That guess did not count against you."); // Tell the user to enter an integer only
          userInput.next(); // Open the scanner to wait for the new input
        }

        // Once the scanner's value is an int
        personGuess = userInput.nextInt(); // Set the already declared and initalized variable of 'personGuess' to the scanner's value

        while (personGuess != computerNumber) { // While the person's guess is NOT equal to the computer's predetermined number -- continuing asking for a new guess
          // If the person's guess is too high
          if (personGuess > computerNumber && personGuess <= 100) {
            System.out.println("Your guess is too high. Try again."); // Print the guess is too high
            numberOfGuesses++; // Increase the number of guesses by 1 to account for the guess
          } else if (personGuess < computerNumber && personGuess >= 0) { // If the person's guess is too low
            System.out.println("Your guess is too low. Try again."); // Print the guess is too low
            numberOfGuesses++; // Increase the number of guesses by 1 to account for the guess
          } else { // Account for user input that is outstide of 0 and 100 but is still an int
            System.out.println("Your guess must be greater than or equal to 0 and less or equal to 100."); // Tell the user to try again because their guess is outside of the bounds [0,100]
            System.out.println("That guess did not count. Try again."); // Don't count the miss guess
          }

          // Check the user's input through the scanner
          while (!userInput.hasNextInt()) {
            System.out.println("Error! You have to enter an integer between 0 and 100. Try again. That guess did not count against you."); // Tell the user to enter an integer only
            userInput.next(); // Open the scanner to wait for the new input
          }

          // Once the scanner's value is an int
          personGuess = userInput.nextInt(); // Set the already declared and initalized variable of 'personGuess' to the scanner's next integer value
        }

        // If the user guesses the correct number
        if (personGuess == computerNumber) {
          System.out.println("Congratulations! You guessed the correct number and it only took you " + numberOfGuesses + " tries!"); // Print that the guess is correct with the number of guesses it took to get the correct number
          userInput.close(); // Close the scanner
        }
    }
}
