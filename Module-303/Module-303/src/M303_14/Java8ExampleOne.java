package M303_14;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Java8ExampleOne {

    public static void main(String[] args) {


        Set<String> mySet = new HashSet();

        mySet.add("Apple");mySet.add("Ball");mySet.add("Cat");mySet.add("Dog");mySet.add("Elephant");


        mySet.forEach(System.out::println);
        System.out.println("----------------------------");

        Set myTreeSet = new TreeSet(mySet);

        myTreeSet.forEach(System.out::println);




    }
}
