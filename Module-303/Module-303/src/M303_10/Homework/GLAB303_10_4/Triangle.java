package M303_10.Homework.GLAB303_10_4;

public class Triangle extends Shape implements Movable{

    private int x,y;

    public Triangle(String color){
        super.color = color;
    }

    public Triangle(){}

    public Triangle(double height, double base){
        super.height = height;
        super.base = base;
    }

    @Override
    public void displayShapeName() {
        System.out.print("I'm a Triangle, ");
        super.displayShapeName();
    }

    @Override
    public double getArea() {
        return 0.5 * super.height * super.base;
    }

    public String toString(){
        return "Triangle[ color=" + color + ", height=" + height + ", base=" + base;
    }

    @Override
    public void moveUp() {
        x++;
    }

    @Override
    public void moveDown() {
        x--;
    }

    @Override
    public void moveLeft() {
        y--;
    }

    @Override
    public void moveRight() {
        y++;
    }

    @Override
    public String getCoordinates() {
        return "(" + x + ", " + y + ")";
    }
}
