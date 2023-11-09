public class Circle {
    public static final double PI = 3.14159;
    private double radius;
    private double area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.area = calculateArea();
    }
    private double calculateArea() {
        return PI * radius * radius;
    }
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return area;
    }
}