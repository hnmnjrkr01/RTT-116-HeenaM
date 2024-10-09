package M303_4.Homework.PA303_4_1;

import java.util.Scanner;

public class QuestionFour {

    public static void main(String[] args) {
        int x=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = scan.nextInt();

        if(x<10)
            System.out.println("Out of range");
        else if(x<10 || x>20)
            System.out.println("In range");
        else if(x<=10 || x<=20)
            System.out.println("In between 10 & 20");
        else
            System.out.println("Not in Range");

    }
}
