package M303_11.Generics;

public interface GenericInterface <T>{
    // abstract method one
    void move(T t, String locationCode);
    // abstract method two
    T getItemBeingMoved();
    // abstract method three
    String getLocationBeingMovedTo();

}
