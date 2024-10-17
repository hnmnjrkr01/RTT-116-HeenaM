package M303_11.Homework.GLAB303_11_3;

import java.util.ArrayList;
import java.util.Iterator;
public class ShowData {
    public static void main(String[] args) {
        // instantioation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookdetails();
        for(Book showValue: myBookList)
        {
            // ---- invoking getter method for geting Data---------
            System.out.println(showValue.getNumber() + " " + showValue.getName() +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
        }
    }
}