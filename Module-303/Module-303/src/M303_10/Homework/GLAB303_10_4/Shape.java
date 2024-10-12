package M303_10.Homework.GLAB303_10_4;

public abstract class Shape {

    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public Shape(){

    }
    public Shape(String color, double height, double width, double base) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.base = base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    //=========================================
    public abstract double getArea();

    public String toString(){
        return "Shape [ Color = "+color+", Height = "+height+", Width = "+width+", Base  = "+base+"]";
    }

    public void displayShapeName(){
        System.out.println("I'm a shape!");

    }

}
