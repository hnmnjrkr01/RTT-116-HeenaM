package M303_10.Homework.PA303_10_1Copy;

public class WaterMonster extends Monster {

    private String name;

    WaterMonster(String name){
        this.name = name;
        System.out.println("WaterMonster " + name + " created");
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
