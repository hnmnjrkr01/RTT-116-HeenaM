package M303_11.Generics;

public class ElephantItem<U> implements GenericInterface<U>{


    private String location;
    private U item;
    @Override
    public void move(U t, String locationCode)
    {
        item = t;
        location = locationCode;   }
    @Override
    public U getItemBeingMoved()
    {
        return item;   }
    @Override
    public String getLocationBeingMovedTo()
    {
        return location;   }

}
