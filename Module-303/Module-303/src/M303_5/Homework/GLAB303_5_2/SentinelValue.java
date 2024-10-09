package M303_6.Homework.GLAB303_5_2;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {

        int sentinalValue;
        int sum=0;

        Scanner scan = new Scanner(System.in);
        do {

            System.out.print("Enter an int value (the program exits if the input is 0): ");
            sentinalValue = scan.nextInt();
            scan.nextLine();
            sum += sentinalValue;

        }while(sentinalValue != 0);

        System.out.println("The sum of the sentinel value is: " + sum);
    }
}
