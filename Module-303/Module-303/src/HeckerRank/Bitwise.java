package HeckerRank;

import java.util.Scanner;

public class Bitwise {

    public static int fourthBit(int number) {
        // Write your code here
        return number>>4;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number ");
        int x  = scan.nextInt();
        System.out.println("x>>4"+(x>>1));
    }
}
