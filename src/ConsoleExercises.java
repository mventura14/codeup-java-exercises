import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        /*-- 1 --*/
        System.out.printf("The value of pi is approximately %.2f %n", pi);
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userNum = scan.nextInt();
        System.out.printf("You have entered the number %d. %n", userNum);

        /*-- 2 --*/
        System.out.print("Please enter 3 words: ");
        String userWord1 = scan.next();
        String userWord2 = scan.next();
        String userWord3 = scan.next();
        System.out.printf("You have entered %s, %s, %s %n",userWord1,userWord2,userWord3);

        /*-- 3 --*/
        System.out.print("Enter a sentence: ");
        scan.nextLine();
        String userSentence = scan.nextLine();

        System.out.printf("The sentence entered is: %s %n",userSentence);



        /*----- Calc Perimeter -----*/

        System.out.print("Please enter room Length: ");
        String roomLength = scan.nextLine();
        System.out.print("Please enter room Width: ");
        String roomWidth = scan.nextLine();
        int length = Integer.parseInt(roomLength);
        int width = Integer.parseInt(roomWidth);

        System.out.println("The perimeter of the room is: " + (2 * (length + width)));

        /*----- Bonus -----*/



    }
}
