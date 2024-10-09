package M303_5;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExamples {

    public static void main(String[] args) {

        for(int ct = 1; ct<=10; ct++){

            System.out.println("Hello" +ct);
        }


        //Reverse Loop

        for(int ct = 10; ct>=1; ct--){

            System.out.println("Hello" +ct);
        }

        String[] str = {"zero","one","two","three","four","five"};

        //aaray.length is used without ()
        for(int pos = 0; pos<str.length; pos++){
            System.out.println("Strings at position "+pos +" = "+str[pos]);
        }

        for(String s : str){
            System.out.println("Strings : "+s);
        }

        //                   012345 char positions in string
        String characters = "abcdef";

        //here its the method in String class lenght(), charAt(pos)
        for(int pos = 0; pos<characters.length(); pos++){
            System.out.println("Characters at position "+pos+" = "+characters.charAt(pos));
        }
        for(String s : str){
            System.out.println("Strings at position "+s +" = "+s);
        }

        List<String> strList = new ArrayList<String>();
        strList.add("zero");
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");
        strList.add("five");


        //index-out-of-bound-exception
        for(int pos = 0; pos < strList.size();pos++){

            String value = strList.get(pos);
            System.out.println("String List item is at position "+pos+" = "+value);
        }

        //this for loop is easier to work with but does not contain position in list/array
        for(String s : strList){
            System.out.println("String List item is at position "+s+" = "+s);
        }
    }
}
