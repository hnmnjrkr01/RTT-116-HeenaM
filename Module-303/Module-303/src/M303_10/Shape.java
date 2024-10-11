package M303_10;

public abstract class Shape implements AreaCalculation{

    private String name;

    public abstract double calculatePerimeter();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
