package Homework.M303_2.PA303_2_3;

public class PracticeOperators {

    public static void main(String[] args){

        //First Question
        Integer i = Integer.valueOf(2);
        String x = Integer.toBinaryString(i);
        System.out.println(i+" "+x);
        int x1=1;
        x1=x1<<1;
        System.out.println(x1);

        int x2=9;
        x2=x2<<1;
        System.out.println(x2);
        int x3=17;
        x3=x3<<1;
        System.out.println(x3);
        int x4=88;
        x4=x4<<1;
        System.out.println(x4);

        //Fifth Question
        int a = 10;
        System.out.println(a++);
        System.out.println(a);

        //Sixth Question
        int b = 1;
        System.out.println("1st way to increment : b=b+1 "+(b+1));
        System.out.println("2nd way to decrement : b+=1 "+(b+=1));
        System.out.println("3rd way to increment : ++b " + ++b);

        //Seventh Question
        int x7=5; int y7=8;
        int sum = ++x7 + y7;
        System.out.println(" sum = ++x7 + y7 : "+sum);


    }
}
