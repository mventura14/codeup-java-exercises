package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    };

    public double getCircumfrence(){
        return 2 * Math.PI * this.radius;
    };

}
