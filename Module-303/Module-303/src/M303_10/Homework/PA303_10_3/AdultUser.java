package M303_10.Homework.PA303_10_3;

public class AdultUser implements LibraryUser{

    private int age;
    private String bookType;

    @Override
    public String registerAccount(int age) {
        this.age = age;

        if(age>=12){
            return "\nYou have successfully registered under an Adult Account";
        } else{
            return "\nSorry, age must be greater than 12 to register as an adult.";
        }
    }

    @Override
    public String requestBook(String bookType) {
        this.bookType = bookType;

        if(bookType.equals(BOOKTYPE)){
            return "\nBook Issued successfully, please return the book within 7 days.";
        }else {
            return "\nOops, you are allowed to take only adult Fiction books.";
        }
    }
}
