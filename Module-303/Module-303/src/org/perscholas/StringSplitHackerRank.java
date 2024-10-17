package org.perscholas;

import java.util.Scanner;

public class StringSplitHackerRank {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();


        String str = "He is a very very good boy, isn't he?";
        //String str = "B,,,A";
        String[] split = str.trim().split("[ !,?._'@]+");
        System.out.println(split.length);

        for (int i = 0; i < split.length; i++)
            System.out.println( split[i]);
    }
}
