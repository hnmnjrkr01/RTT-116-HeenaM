package M303_10.Homework.PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kid = new KidUser();
        AdultUser adult = new AdultUser();

        System.out.println(kid.registerAccount(10));
        System.out.println(kid.requestBook("Kids"));

        System.out.println(kid.registerAccount(18));
        System.out.println(kid.requestBook("Fiction"));

        System.out.println(adult.registerAccount(5));
        System.out.println(adult.requestBook("Kids"));

        System.out.println(adult.registerAccount(23));
        System.out.println(adult.requestBook("Fiction"));
 }
}
