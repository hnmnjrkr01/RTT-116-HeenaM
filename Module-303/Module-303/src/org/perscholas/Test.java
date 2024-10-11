package org.perscholas;

public class Test {
    public static void main(String[] args)
    {
        String str = " This  is  geek";
        String[] split = str.split("[' , ? \\s  ] ");

        for (int i = 0; i < split.length; i++)
            System.out.println( split[i]);
    }
}
