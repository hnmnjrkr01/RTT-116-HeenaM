package M303_11.Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapHackerRank {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        Map<String, Long> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            long phone=in.nextLong();
            in.nextLine();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s=in.nextLine();

            if(phoneBook.containsKey(s))
                System.out.println(s+" = "+phoneBook.get(s));
            else
                System.out.println("Not Found");

        }



      /*  System.out.println();
        for(Map.Entry<String, Long> book: phoneBook.entrySet()){
            System.out.println(book.getKey()+" = "+book.getValue());
        }*/

    }
}
