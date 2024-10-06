package org.perscholas;

public class WrapperClassExample {


    public static void autobox(Integer i){
        System.out.println("Function called with "+i);
    }

    public static void booleanAutoBoc(Boolean b){
        System.out.println("Function called with "+b);
    }


    public static void main(String[] args) {

        int x = 5;
        Integer y = x;

        Integer z = Integer.valueOf(x);

        boolean b1 = true, b2 = false, b3 = false;

        autobox(x);

        booleanAutoBoc(b1);
        booleanAutoBoc(b2);
        booleanAutoBoc(b3);



    }
}
