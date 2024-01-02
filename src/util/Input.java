package util;

import java.util.Scanner;

public class Input {
    //    private String scanner;
    private Scanner scanner;
//    public String input;

    public Input() {
        System.out.println("Scanner Created");
        scanner = new Scanner(System.in);
//        input = "";
    }

    public String getString() {
        System.out.print("Enter a String: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.print("Enter Yes Variants: y, yes: ");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.printf("Input a number between %d & %d: ", min, max);
        String input = scanner.nextLine();

        while(!isNumeric(input) || Integer.parseInt(input) < min || Integer.parseInt(input) > max){
            System.out.print("Input Invalid: ");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }

    public int getInt(){

        System.out.print("Input an Integer: ");
        String input = scanner.nextLine();

        while(!isNumeric(input)){
            System.out.print("Input Invalid: ");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }

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

    public double getDouble(double min, double max){
        System.out.printf("Input a number between %f & %f: ", min, max);
        String input = scanner.nextLine();

        while(!isNumeric(input) || Double.parseDouble(input) < min || Double.parseDouble(input) > max){
            System.out.print("Input Invalid: ");
            input = scanner.next();
        }
        return Double.parseDouble(input);
    }

    public double getDouble(){

        System.out.print("Input an Double: ");
        String input = scanner.nextLine();

        while(!isNumeric(input)){
            System.out.print("Input Invalid: ");
            input = scanner.next();
        }
        return Double.parseDouble(input);
    }

}

