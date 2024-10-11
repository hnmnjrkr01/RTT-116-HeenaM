package M303_10.Homework.PA303_10_3;

public class KidUser implements LibraryUser{

    private int age;
    String bookType;

    @Override
    public String registerAccount(int age) {
        this.age = age;
        if(age <=11){
            return "\nYou have successfully registered under a Kids Account.";
        }else {
            return "\nSorry, age must be less than 12 to register as a kid.";
        }
    }

    @Override
    public String requestBook(String bookType) {
        this.bookType = bookType;

        if(bookType.equals(KIDS)){
            return "\nBook issued successfully, please return the book within 10 days";
        } else{
            return "\nOops, you are allowed to take only kids books.";
        }
    }
}
