package M303_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {

public static void main(String[] args) {

    String[] strArray = {"one","two","three","four","five"};
    List<String> list = Arrays.asList(strArray);


    list.stream().forEach(e-> System.out.println(e.toUpperCase()));
    System.out.println("forEach(e-> System.out.println(e.toUpperCase()));");
    System.out.println("===============================================");


    list.stream().forEach(System.out::println);
    System.out.println("stream().forEach(System.out::println);");
    System.out.println("===============================================");

    list.stream().forEach(e-> {
                System.out.println(e);
            });
    System.out.println("stream().forEach(e-> {\n" +
                           "System.out.println(e.toUpperCase());\n" +
                        "});");
    System.out.println("=========================================================");


    //System.out.println(list.removeIf(e->e.startsWith("o")));              //It will work with conventional list only and not with the list made from Array

    List<String> filteredList = list.stream().
                                    filter(e->!e.startsWith("o")).
                                    filter(e-> e.startsWith("t")).
                                    collect(Collectors.toList());

    filteredList.stream().forEach(e->System.out.println(e.toUpperCase()));

    List<String> filteredList2 = list.stream().
                                filter(e->!e.startsWith("o"))
                                .toList();
    filteredList2.stream().forEach(System.out::println);

}
}
