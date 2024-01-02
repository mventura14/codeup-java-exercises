package shapes;

import util.Input;
import shapes.Circle;

public class CircleApp {
    public static void main(String[] args) {
        Input user = new Input();
        Circle c1 = new Circle(user.getDouble("Enter Circle Radius: "));
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumfrence());
    }
}
