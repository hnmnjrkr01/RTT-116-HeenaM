package Homework.M303_2.PA303_2_2;

import java.util.Scanner;

public class PA303_2_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //java Stdin and Stdout I

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //java Stdin and Stdout II
        // --------------NOT WORKING CODE-----------------

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);




    }
}

