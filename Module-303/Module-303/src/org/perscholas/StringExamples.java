package org.perscholas;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.StringJoiner;

public class StringExamples {

    public static void main(String[] args) {

        String s = "abcdef";

        System.out.println("Uppercase : " + s.toUpperCase());

        System.out.println(s.charAt(0));//output a
        System.out.println(s.charAt(5)); //output 6
        //System.out.println(s.charAt(6)); //output : error

        System.out.println("The length of the string is : " + s.length());

        System.out.println("String Concate " + s.concat("ghijklm"));


        String r = "abc1234defg";
        System.out.println(r.replace('a', 'z'));

        System.out.println(r.replace("abc", "xyz"));
        System.out.println(r.replaceAll("\\d", "9"));


        //========SUBSTRING==========
        //                 0123456789
        String filename = "something.txt";
        System.out.println(filename.substring(5, 7));

        System.out.println(filename.substring(4));
        System.out.println("position of ." + filename.indexOf("."));
        System.out.println("file extension :" + filename.substring(filename.lastIndexOf(".")));

        //filename without extension
        System.out.println("file name : " + filename.substring(0, filename.lastIndexOf(".")));


        //===========VERY V V  IMP================

        String s1 = new String("abc");
        String s2 = new String("ABC");

        String s3 = "xyz";
        String s4 = "xyz";

        System.out.println("Result of eqauals() : " + s1.equals(s2));

        System.out.println("Result of equals() : " + s1.equalsIgnoreCase(s2));
        System.out.println("Result of s3==s4 : " + (s3 == s4));
        System.out.println("Result of s1==s2 : " + (s1 == s2));


        //-----------Number to String and other war around----------
        Integer n1 = Integer.valueOf(100);
        String ss1 = n1.toString();
        System.out.println("Num to String " + ss1);

        String ss2 = "1000";
        Integer n2 = Integer.parseInt(ss2);
        System.out.println("String to Integer " + n2);


        //==============STRING BUFFER===========
        StringBuffer sb = new StringBuffer();

        sb.append("abc");
        sb.append("123");

        sb.insert(4, "xyz");

        System.out.println(sb);
        System.out.println(sb.replace(0, 3, "ABC"));

        System.out.println(sb.replace(2, 5, "wwwwww"));

        System.out.println(sb.delete(0, 2));

        System.out.println(sb.insert(6, "x"));

        System.out.println(sb.insert(9, "1"));

        System.out.println(sb.append("456"));

        // System.out.println(sb.reverse());

        System.out.println(sb.reverse().reverse());

        System.out.println(sb.delete(1, 4));

        //================STRING JOINER========================

        StringJoiner sj = new StringJoiner("|", "{", "}");
        StringJoiner sjj = new StringJoiner("||", "[", "]");

        sj.add("heena");
        sj.add("wello");

        sjj.add("gaurav");
        sjj.add("vihaan");

        System.out.println(sj);
        System.out.println(sjj.toString());
        System.out.println(sj.merge(sjj));

        //***********format(), printf() FORMAT METHODS*****************

        long n = 789283492;

        System.out.format("%d %n", n);
        System.out.format("%08d %n", n);
        System.out.format("%.2f %n", 5.3686);

        LocalDate dob = LocalDate.of(1988, 02, 01);
        System.out.println(dob);
        System.out.printf("%1$tB %1$td,%1$tY  %2$s's birthday. Let's go and celebrate.%n ", dob, "Heena");

        System.out.printf("Hello %s!%n", "Heena M");
        System.out.printf("Hello %s!%n", "Gaurav K");
        System.out.printf("Hello %s!%n", "Vihaan K");

        System.out.printf("%d %n", 15);

        System.out.printf("%1$tB, %1$td, %1$ty its my birthday%n", dob);

           /* US: formattedPayment
        India: formattedPayment
        China: formattedPayment
        France: formattedPayment */

        double currency = 12324.13489;
        char us = '$', china='Y', french = 'E', india = 'R';

        System.out.printf("US Currency %c%.3f %n",us,currency);
        System.out.printf("India Currency %c%.3f %n",india,currency);
        System.out.printf("China Currency %c%.3f %n",china,currency);
        System.out.printf("French Currency %c%.3f%n",french,currency);

        //=============String Formator================================

        String ss = "Gauri_Laptop";
        float num = 36.255f;

        String str1 = String.format("My Computer name is %s ", ss);
        String str2 = String.format("My age is %-10.1f ", num);
        System.out.println(str1 + " " + str2);

        String pattern ="##,###.##";
        double number = 123465798.123465;

        DecimalFormat numFormat = new DecimalFormat(pattern);
        System.out.println(number);
        System.out.println(numFormat.format(number));

    }
}
