import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

//        highLow();
//        userGuess();
        highLowGPTRefactor();
    }

   /* The specs for the game are:

    [X]Game picks a random number between 1 and 100.
    [X]Prompts user to guess the number.
    [X]All user inputs are validated.
    [X]If user's guess is less than the number, it outputs "HIGHER".
    [X]If user's guess is more than the number, it outputs "LOWER".
    [X]If a user guesses the number, the game should declare "GOOD GUESS!"
    Hints

    Use the random method of the java.lang.Math class to generate a random number.
    Bonus

    []Keep track of how many guesses a user makes.
    []Set an upper limit on the number of guesses.*/

    public static void highLow() {
        Scanner scan = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int gameNumber = (int) (Math.random() * (max - (min + 1))) + (min + 1);

        int userGuessAttempts = 1;
        int maxGuesses = 5;

        System.out.println(gameNumber);
        System.out.printf("Your max Attempts: %d %n", maxGuesses);
        System.out.printf("Guess my number between %d and %d: ", min, max);
        int userGuess = userGuess();
        System.out.println(userGuess);
        while (userGuess != gameNumber) {
            if (userGuess > gameNumber) {
                System.out.print("Wrong! ... Lower:");
            }
            if (userGuess < gameNumber) {
                System.out.print("Wrong! ... Higher:");
            }
            userGuess = userGuess();
            userGuessAttempts++;
            if (userGuessAttempts == maxGuesses) {
                break;
            }
        }
        if (userGuess == gameNumber) {
            System.out.printf("Correct, Lucky Guess... took you %d guesses. %n", userGuessAttempts);
        } else {
            System.out.println("Game Over");
        }

        scan.close();
    }

    public static void highLowGPTRefactor() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;

        int gameNumber = (int) (Math.random() * (max - min + 1)) + (min + 1);

        int userGuessAttempts = 1;
        int maxGuesses = 10;

        System.out.printf("Your max Attempts: %d %n", maxGuesses);

        while (userGuessAttempts <= maxGuesses) {
            System.out.printf("Guess my number between %d and %d: ", min, max);
            int userGuess = userGuess();

            if (userGuess == gameNumber) {
                System.out.printf("Correct! Lucky Guess... took you %d guesses. %n", userGuessAttempts);
                return;
            } else if (userGuess > gameNumber) {
                System.out.println("Wrong! ... Lower.");
            } else {
                System.out.println("Wrong! ... Higher.");
            }
            System.out.printf("Attempts left: %d %n", maxGuesses - userGuess);
            userGuessAttempts++;
        }
        System.out.println("Game Over");
        scanner.close();
    }
    public static int userGuess () {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!isNumeric(input)){
            System.out.print("Invalid input. Please Enter a number: ");
            input = scan.nextLine();
        }
        return Integer.parseInt(input);
    };
    public static boolean isNumeric (String input){
        try {
            // Attempt to parse the input as a double
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            // If parsing fails, it's not a valid number
            return false;
        }
    };

}