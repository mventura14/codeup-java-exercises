import java.util.Objects;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String bobResp1 = "Sure";
        String bobResp2 = "Whoa, chill out!";
        String bobResp3 = "Fine. Be that way!";
        String bobResp4 = "Whatever.";
        String userInput = "go";
        System.out.println("Talk to bob");
        while (!userInput.equalsIgnoreCase("stop")) {

            userInput = scan.nextLine();
            if (userInput.trim().isEmpty()) {
                System.out.println(bobResp3);
            } else if (userInput.lastIndexOf("?") == userInput.length() - 1) {
                System.out.println(bobResp1);
            } else if (userInput.lastIndexOf("!") == userInput.length() - 1) {
                System.out.println(bobResp2);
            } else {
                System.out.println(bobResp4);
            }
        }

    }
}
