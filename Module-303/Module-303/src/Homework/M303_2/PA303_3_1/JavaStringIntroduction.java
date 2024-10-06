package Homework.M303_2.PA303_3_1;

import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        System.out.println(a.length()+b.length());

        if(b.compareTo(a)>0)
            System.out.println("No");
        else
            System.out.println("Yes");

        a = a.substring(0,1).toUpperCase()+a.substring(1);
        // System.out.println(A);
        b = b.substring(0,1).toUpperCase()+b.substring(1);
        //System.out.println(B);

        System.out.println(a+" "+b);
    }
}
