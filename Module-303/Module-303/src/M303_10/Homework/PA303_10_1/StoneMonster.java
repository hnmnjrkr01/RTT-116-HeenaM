package M303_10.Homework.PA303_10_1;

public class StoneMonster implements Monster {

    private String name;

    StoneMonster(String name){
        this.name = name;
        System.out.println("StoneMonster " + name + " created");
    }



    @Override
    public String attack() {
        return "Attack with Stones!";
    }
}
