package M303_9;

public class Circle extends Shape{

    private double radius;
    private static double PI = 3.14159;



    public double getRadius() {
        return radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
