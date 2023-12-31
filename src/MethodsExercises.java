import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println(add(2, 3));
//        System.out.println(sub(2, 3));
//        System.out.println(mult(2, 3));
//        System.out.println(div(6, 3));
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        long factorialEx = calculateFactorial(0,21);
        diceRoll();


    }



    public static int add(int val1, int val2) {
        return val1 + val2;
    }

    public static int sub(int val1, int val2) {
        return val1 - val2;
    }


    public static int mult(int val1, int val2) {
        return val1 * val2;
    }


    public static double div(int val1, int val2) {
        return (double) val1 / val2;
    }


    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        while (userInput < min + 1 || userInput > max - 1) {
            System.out.println("Invalid");
            System.out.printf("Enter a number between %d and %d: %n", min, max);
            userInput = scan.nextInt();
        }
        return userInput;
    }

    public static long calculateFactorial(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = getInteger(min, max);
        System.out.printf("You have entered %d %n", userInput);
        System.out.println("Continue? [y/n]");
        String userConfirm = scan.nextLine();
        while (!userConfirm.equalsIgnoreCase("y")) {
            userConfirm = scan.nextLine();
        }
        StringBuilder factStr = new StringBuilder("! = ");
        long factResult = 1;
        for (int i = 1; i <= userInput; i++) {
            factResult *= i;
//            System.out.println(i + factStr.toString() + i + " = " + factResult);
            System.out.println(i + factStr.toString() + factResult);

//            if (i == userInput){
//                factStr.append(i).append(" = ");
//            } else {
//                factStr.append(i).append(" x ");
//            }

        }
        System.out.printf("The factorial of %d! = %d %n", userInput, factResult);
        userConfirm = "";
        while (!userConfirm.equalsIgnoreCase("y")) {
            System.out.print("Calculate another? [Y/N]:");
            userConfirm = scan.nextLine();
            if (userConfirm.equalsIgnoreCase("y")) {
                calculateFactorial(min, max);
            }
            if (userConfirm.equalsIgnoreCase("n")) {
                System.out.println();
                System.out.println("Ok, Have a nice day.");
                break;
            }
        }

        return factResult;
    }

    public static int randomNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void diceRoll() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter die face number:");
        int diceSides = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter number or dice to be rolled:");
        int diceNum = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < diceNum; i++) {
            int dieRoll = randomNum(1, diceSides);
            System.out.printf("Die %d: %d %n", i + 1, dieRoll);
        }

        String userConfirm = "";
        while (!userConfirm.equalsIgnoreCase("y")) {
            System.out.print("Roll Again? [Y/N]:");
            userConfirm = scan.nextLine();
            if (userConfirm.equalsIgnoreCase("y")) {
                diceRoll();
            }
            if (userConfirm.equalsIgnoreCase("n")) {
                System.out.println();
                System.out.println("Ok, Have a nice day.");
                break;
            }
        }
        scan.close();
    }
}
