package M303_10.Homework.GLAB303_10_4;

public class Rectangle extends Shape implements Movable{

    private int x,y;

    public Rectangle(String color){ super.color = color; }

    public Rectangle(){ }

    public Rectangle(double width, double height){
        super.width = width;
        super.height = height;
    }

    @Override
    public void displayShapeName() {
        System.out.print("I'm a rectangle, ");
        super.displayShapeName();
    }

    public String toString(){
        return "Rectangle[ Height = "+height+", Width = "+width+", Color = "+color+"]";
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void moveUp() { x++; }

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
        y++;
    }

    @Override
    public String getCoordinates() {
        return "("+x+","+y+")";
    }
}