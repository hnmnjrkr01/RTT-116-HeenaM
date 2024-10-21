package M303_11.Generics;

public class Runner {

    public static void main(String[] args) {
        ElephantItem<Integer> ObjMove = new ElephantItem<>();
        ObjMove.move(5, "NYC");
        System.out.println( ObjMove.getItemBeingMoved()   + " Item");
        System.out.println(ObjMove.getLocationBeingMovedTo()  +" Location");
    }

}
