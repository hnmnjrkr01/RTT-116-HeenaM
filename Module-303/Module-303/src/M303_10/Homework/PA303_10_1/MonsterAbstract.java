package M303_10.Homework.PA303_10_1;

public abstract class MonsterAbstract implements Monster {

    private String name;

    MonsterAbstract(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}
