package Homework.M303_2.GLAB_303_3_2;

import java.util.Scanner;

public class StringReadFromConsole {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Reading a String From the Console

        System.out.println("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);

        // Read String from Console Input

        System.out.print("Enter fours words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();


        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
//=================================================================



    }
}
