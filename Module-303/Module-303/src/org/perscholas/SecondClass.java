package org.perscholas;

public class SecondClass {
    public static void main(String args[]) {
        byte i = 40;
        // No casting needed for below conversion
        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;
        System.out.println("byte value : "+i);
        System.out.println("short value : "+j);
        System.out.println("int value : "+k);
        System.out.println("long value : "+l);
        System.out.println("float value : "+m);
        System.out.println("double value : "+n);
        float fl = 1.5e3f;
        k = (int)fl; // Explicit - ok
       // k = fl; // Not Allowed - narrowing
        System.out.println("double value : "+k);
    }


}
