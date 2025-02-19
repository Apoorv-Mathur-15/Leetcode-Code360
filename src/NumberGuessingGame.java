import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.println("Guess a number between 1 and 100: ");
            int userGuess = sc.nextInt();
            numberOfTries++;

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        }
    }
}
