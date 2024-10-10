package M303_8;

public class Runner {


    public static void main(String[] args){

        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("The area is "+r1.calculateArea());
        System.out.println("The perimeter is "+r1.calculatePerimeter());

        Rectangle r2 = new Rectangle(10,20);
        System.out.println(r2.toString());
        System.out.println("The area is "+r2.calculateArea());
        System.out.println("The perimeter is "+r2.calculatePerimeter());

        r1.setHeight(100);
        r1.setWidth(200);
        System.out.println(r1.toString());
        System.out.println("The area is "+r1.calculateArea());
        System.out.println("The perimeter is "+r1.calculatePerimeter());

        r1.partlyAvailable();//protected access
        r1.defaultPackage();



    }
}
