package M303_10.Homework.PA303_10_1Copy;



public class FireMonster extends Monster {

   private String name;

    FireMonster(String name){
       this.name = name;
       System.out.println("FireMonster " + name + " created");
   }

   @Override
    public String attack() {
        return "Attack with Fire!";
    }
}
