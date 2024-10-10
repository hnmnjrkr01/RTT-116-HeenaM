package M303_8;

public class Rectangle {
    private int height, width;

    Rectangle(){}

    public Rectangle(int height, int width) {
        this.height = height; //set this height at class level
        this.width = width;
    }
    //===========================================
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    //=================================================

    public int calculateArea() {
        return height * width;
    }

    public int calculatePerimeter() {
        return  (height + width) * 2;
    }

    public String toString() {

        return "Square [height=" + height + ", width=" + width + "]";
    }

    private void notAvailable(){
        System.out.println("notAvailable()");
    }

    protected  void partlyAvailable(){
        System.out.println("partlyAvailable()");
    }

    void defaultPackage(){
        System.out.println("defaultPackage()");
    }

}
