package M303_10;

import java.util.ArrayList;
import java.util.List;

public class CalcRunner {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(10.098);
        circle.setPI(4.22);
        circle.setName("Circle");

        Circle circle1 = new Circle();
        circle1.setRadius(10.098);
        circle1.setPI(5.2);
        circle1.setName("Circle");

        Triangle triangle = new Triangle();
        triangle.setBase(10);
        triangle.setHeight(20);
        triangle.setName("Triangle");

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(circle1);
        shapes.add(triangle);

       // SuperClass s = new Superclass();

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();

            System.out.println(shape.getName()+" area "+area + " perimeter "+perimeter);



            if(shape instanceof Triangle) {
                System.out.println("shape is type of Triangle");
            }
            if(shape instanceof Circle) {
                System.out.println("shape is type of Circle");
            }
            if(shape instanceof Shape) {
                System.out.println("shape is type of Shape");
            }
            if(shape instanceof AreaCalculation) {
                System.out.println("shape is type of AreaCalculation");
            }
        }


    }


}
