import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;
        int guessLimit = 20; // Maximum number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + guessLimit + " attempts.");

        while (!hasGuessedCorrectly && numberOfAttempts < guessLimit) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            numberOfAttempts++;

            if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }

            if (numberOfAttempts == guessLimit && !hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all " + guessLimit + " attempts. The correct number was "
                        + randomNumber + ".");
            }
        }

        scanner.close();
    }
}