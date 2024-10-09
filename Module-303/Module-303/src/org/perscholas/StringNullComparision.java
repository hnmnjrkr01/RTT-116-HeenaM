package org.perscholas;

import java.util.Locale;

public class StringNullComparision {

    public static void main(String[] args) {

        String s = null;
        String s1 = "";

        //System.out.println(s.compareTo(s1)); error as s is null
        System.out.println(s.length());
        System.out.println(s1.length());

        s1.trim(); s1.toLowerCase();

        if(s==null || s.length()==0){}

        if(s==s1){}

        if(s!= null && s.equals(s1)){
            System.out.println("Strings are equal");
        } else  {
            System.out.println("Strings are not equal");

        }

        if(s1.equals(s)){
            System.out.println("Strings are equal");
        } else  {
            System.out.println("Strings are not equal");


        }


    }
}
