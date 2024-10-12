package M303_10.Homework.GLAB303_10_4;

public class MyRunnable {
    public static void main(String[] args){
        //===================Circle Object================================
        Circle circle = new Circle(1,2,3);

        circle.displayShapeName();
        System.out.println("Area of Circle "+circle.getArea());
        System.out.println("Coordinates are : "+circle.getCoordinates());

        circle.moveDown(); //Movable Method
        System.out.println("After moving down : "+circle.getCoordinates());

        circle.moveUp(); //Movable Method
        System.out.println("After moving up : "+circle.getCoordinates());

        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();

        circle.moveLeft(); //Movable Method
        System.out.println("After moving left : "+c2.getCoordinates());

        circle.moveRight(); //Movable Method
        System.out.println("After moving right : "+c2.getCoordinates());

        System.out.println(circle);
        System.out.println("=====================================\n");

        //=======================Rectangle Object============================

        Rectangle rectangle = new Rectangle(11.05,13.65);
        rectangle.displayShapeName();
        System.out.println("Area of Rectangle "+rectangle.getArea());
        System.out.println("Coordinates are : "+rectangle.getCoordinates());
        System.out.println(rectangle);
        System.out.println("=====================================\n");

        //======================Triangle Object==============================

        Triangle triangle = new Triangle(11.05,13.65);
        triangle.displayShapeName();
        System.out.println("Area of Triangle "+triangle.getArea());
        System.out.println("Coordinates are : "+triangle.getCoordinates());
        System.out.println(triangle);
        System.out.println("=====================================\n");






    }
}
