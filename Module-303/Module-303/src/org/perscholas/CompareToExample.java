package org.perscholas;

public class CompareToExample {
    public static void main(String[] args) {


        //-ve result means less than
        //0 result means equal
        //+ve means greater than

        String s1="abc"; String s2="ABC";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        Integer i1 = 10; Integer i2 = 20;

        System.out.println(i1.compareTo(i2));
        System.out.println(i2.compareTo(i1));




    }
}
