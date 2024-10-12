package M303_10.Homework.GLAB303_10_4;

public class Circle extends Shape implements Movable{

    protected double radius;
    protected int x, y;
    protected final double PI = Math.PI;

    public Circle(int x, int y, double radius){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    public double getArea(){
        return PI*Math.pow(radius, 2);
    }

    public void displayShapeName(){
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    public String toString(){
        return  "Circle [ radius = "+radius+super.toString() +"]";
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
            y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinates() {
        return "("+ x +" , "+ y +")";
    }
}
