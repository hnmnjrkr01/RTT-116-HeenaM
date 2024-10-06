package org.perscholas;

public class IncrementOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 0;
        int d = 20;
        int e = 40;
        int f = 60;

        int result = -a;
        int result1 = a * -1;

        System.out.println(result);
        System.out.println(result1);

        c = b++;
        System.out.println("Value of c = (++b) : c = "+c+" and b = "+b);
        // c=10 and b=11

        c=++a;
        System.out.println("Value of c = (++a) : c = "+c+" and a = "+a);
        // c=11 and a=11

        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--b);
        System.out.println(b--);



    }
}
