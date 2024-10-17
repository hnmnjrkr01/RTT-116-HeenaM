package M303_11;

import java.util.*;

public class ListSetExample {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();           //cannot define size of linkedlist



        //used 95% of the time
        List<Integer> intList = new ArrayList<Integer>(10);         //we can define size/capacity of list
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(3);
        for(int i: intList){
            System.out.println(i);
        }
        System.out.println("--------------------------------------");
        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()){                          //this method of iterator checks for next item in the list
            Integer i = iterator.next();                    //next() function 2 tasks 1. return item, 2. move pointer to next item
            if(i==3){iterator.remove();}                    // cannot remove item in regular for-loop for such cases use WHILE loop
        }
        for(int i: intList){
            System.out.println(i);
        }
        System.out.println("--------------------------------");

        //imp to understand what a set is! For special cases and avoid duplicate data
        //this time its printing in sequence/order but the correct behavior is order is unpredictable

        Set<Integer> intSet = new HashSet<Integer>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(3);
        intSet.add(1);
        for(int i: intSet)
            System.out.println(i);

        System.out.println("--------------------------------");

        Set<String> strSet = new HashSet<>();
        strSet.add("A");
        strSet.add("B");
        strSet.add("C");
        strSet.add("B");
        strSet.add("nbamsdb");
        strSet.add("M,M.");

        for(String i: strSet)
            System.out.println(i);














    }
}
