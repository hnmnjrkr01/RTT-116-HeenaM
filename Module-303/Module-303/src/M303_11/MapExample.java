package M303_11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);                  //put(key, value)
        numbers.put("two", 2);
        numbers.put("thre", 3);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("ten", 10);
        numbers.put("ten", 100);                        //value to 100 written over 10 for that key
        numbers.put("tenn",10);
        numbers.put(null, 1000);
        numbers.put("", null);
        numbers.put("abc",null);

        Integer x = numbers.get("one");             //get(key)
        Integer x2 = numbers.get("two");

        //looping over keys to to get the value
        for(String key: numbers.keySet()){                  //return set of keys
            Integer value = numbers.get(key);
            System.out.println(key + " == " + value);
        }
        System.out.println("=======================");

        for(Integer i : numbers.values()){
            System.out.println("values = "+ i);
        }

        Integer notFound = numbers.get("thousand");
        System.out.println("found nothing "+notFound);              //null is printed


        //remove(k, v) to remove a particular item
        System.out.println("removed item "+numbers.remove("tenn"));




    }
}
