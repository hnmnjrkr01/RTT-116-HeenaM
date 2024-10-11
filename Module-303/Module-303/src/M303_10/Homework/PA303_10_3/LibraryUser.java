package M303_10.Homework.PA303_10_3;

public interface LibraryUser {

    String KIDS="Kids";
    String BOOKTYPE="Fiction";

    String registerAccount(int age);
    String requestBook(String bookType);
}
