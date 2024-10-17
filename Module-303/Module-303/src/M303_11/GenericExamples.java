package M303_11;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();        //Older versions used generics on both sides now left side only is fine

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        //ints.add("str2");                         //restricts other kids of data



    }
}
