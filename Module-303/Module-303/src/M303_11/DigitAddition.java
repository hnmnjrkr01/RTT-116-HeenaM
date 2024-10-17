package M303_11;

import java.util.Scanner;

public class DigitAddition{

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int result=0;
    System.out.print("Enter a large number");
    int largeNumber = sc.nextInt();
    System.out.println("Number was " +largeNumber);

    if(largeNumber>0) {
        while (largeNumber > 0) {
            result += largeNumber % 10;
            largeNumber = largeNumber / 10;
        }
        System.out.println("Addition of digits " + result);
    }else {
        System.out.println("Wrong input!");
    }
}
}

