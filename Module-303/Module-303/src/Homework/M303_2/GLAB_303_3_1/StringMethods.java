package Homework.M303_2.GLAB_303_3_1;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //length() method
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        //==============================================================

        //isEmpty()
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false

        //==============================================================


        //trim()
        String strim="  hello   ";
        System.out.println(strim+"how are you");        // without trim()
        System.out.println(strim.trim()+" how are you");

        //==============================================================


        //toLowerCase() method:
        String slc="HELLO HOW Are You?";
        String s1lower=slc.toLowerCase();
        System.out.println(s1lower);

        //==============================================================

        //Java String toUpper() method:
        String sUC="hello how are you";
        String supper=sUC.toUpperCase();
        System.out.println(supper);

        //==========concat() method==============
        String strCon1 = "Learn ";
        String strCon2 = "Java";
        // concatenate str1 and str2
        System.out.println(strCon1.concat(strCon2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(strCon2.concat(strCon1)); // "JavaLearn "
        //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        System.out.println(s5);
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2



        // String Supplement is concatenated with character B
        String ss = "Supplement" + 'B'; // s1 becomes SupplementB

        //=================================================================


        //split() method
        String vowels = "a::b::c::d:e";

        // splitting the string at "::" storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        //==============================================================

        //charAt() method
        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is " + message1.charAt(0));

        //=================================================================

        //compareTo() method:

        String ss1="hello";
        String ss2="hello";
        String ss3="hemlo";
        String ss4="flag";
        System.out.println(ss1.compareTo(ss2));
        System.out.println(ss1.compareTo(ss3)); //-1 because "l" is only one time lower than "m"
        System.out.println(ss1.compareTo(ss4)); // 2 because "h" is 2 times greater than "f"

        //===================================================================

        //Substrings() method:
        String subStr = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(subStr.substring(0, 4));

        //==================================================================

        //indexOf() method:

        String strIndexOf = "Java is fun";
        int strResult;

        // getting index of character 's'
        strResult = strIndexOf.indexOf('s');

        System.out.println(strResult); // 6

        // getting index of character 'J'
        strResult = strIndexOf.lastIndexOf('J');
        System.out.println(strResult); // 0
        // the last occurrence of 'a' is returned
        strResult = strIndexOf.lastIndexOf('a');
        System.out.println(strResult); // 3

        // character not in the string
        strResult = strIndexOf.lastIndexOf('j');
        System.out.println(strResult); // -1

        // getting the last occurrence of "ava"
        strResult = strIndexOf.lastIndexOf("ava");
        System.out.println(strResult); // 1

        // substring not in the string
        strResult = strIndexOf.lastIndexOf("java");
        System.out.println(strResult); // -1

        //======================================================================

        //contains() method
        String st1 = "Learn Java";
        Boolean stResult;

        // check if str1 contains "Java"
        stResult = st1.contains("Java");
        System.out.println(stResult);  // true

        // check if str1 contains "Python"
        stResult = st1.contains("Python");
        System.out.println(stResult);  // false

        // check if str1 contains ""
        stResult = st1.contains("");
        System.out.println(stResult);  // true

        //========================================================================

        //replace() method
        String strr1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(strr1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(strr1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        //===================================================================

        //replaceAll() method
        String stt1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(stt1.replaceAll(regex," "));

        //==================================================================

        //equals() Method & == operator

        String s11="PerScholas";
        String s12="PerScholas";
        String s13=new String("PerScholas");
        String s14="Teksystem";
        System.out.println(s11.equals(s12));//true
        System.out.println(s11.equals(s13));//true
        System.out.println(s11.equals(s14));//false

        System.out.println(s11==s12);//true (because both refer to same instance)
        System.out.println(s11==s13);//false(because s3 refers to instance created in nonpool)

        //======================================================================

        //compareTo() method

        String s21="Perscholas";
        String s22="Perscholas";
        String s23="Perschola";
        String s24="PerscholasX";
        System.out.println(s21.compareTo(s22)); //0
        System.out.println(s21.compareTo(s23)); // 1(because s1>s3)
        System.out.println(s21.compareTo(s24)); // -1(because s1<s4 )


        //===============================  END  ==========================================












    }
}
