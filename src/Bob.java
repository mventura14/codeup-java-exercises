import java.util.Objects;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput = "go";
        System.out.println("Wanna Chat?");
        while (!userInput.equalsIgnoreCase("stop")) {

            userInput = scan.nextLine();
            if (userInput.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        }

    }
}
