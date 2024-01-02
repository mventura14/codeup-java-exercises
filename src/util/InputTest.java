package util;

public class InputTest {
    public static void main(String[] args) {
        Input user = new Input();

        System.out.println("String entered: " + user.getString("String"));
        System.out.println("Entered Yes Variant?: " + user.yesNo("String"));
        System.out.println("Integer between 10 and 20: " + user.getInt("String", 10, 20));
        System.out.println("Any integer: " + user.getInt("String"));
        System.out.println("Valid input was: " + user.getDouble("String", 5.5, 10.9));
        System.out.println("Any double: " + user.getDouble("String"));
    }

}
