package M303_9;

public class Runner {


    public static void main(String[] args) {

        System.out.println(2);
        Circle circle = new Circle();
        circle.setRadius(10.098);
        circle.setPI(4.22);
        circle.setName("Circle");
        System.out.println(circle.getRadius()+" "+circle.getPI()+" "+circle.getName());

        Circle circle1 = new Circle();
        circle1.setRadius(10.098);
        circle1.setPI(5.2);
        circle1.setName("Circle");
        System.out.println(circle.getRadius()+" "+circle.getPI()+" "+circle.getName());



        Triangle triangle = new Triangle();
        triangle.setBase(10);
        triangle.setHeight(20);
        triangle.setName("Triangle");
        System.out.println(circle.getRadius()+" "+circle.getPI()+" "+circle.getName());
        System.out.println(circle.getRadius()+" "+circle.getPI()+" "+circle.getName());
    }

    static{
        String name="Heena ";
        System.out.println(name+1);
    }
}
