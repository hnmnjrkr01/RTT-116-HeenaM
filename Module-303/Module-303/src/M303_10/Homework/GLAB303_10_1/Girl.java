package M303_10.Homework.GLAB303_10_1;

public class Girl extends Person {

    static double   ageFactor = 1.3;

    public Girl(String aName) {
        name = "Ms." + aName;
    }
    @Override
    public String talk() {
        return("Hello! " + jump());
    }

    //New Method in Sub Class
    public String jump() {
        return("I am jumping.");
    }
    //Static method so 1 copy only availabele
    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }
}
