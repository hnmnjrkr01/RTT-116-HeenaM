package M303_4;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year = 0;

        System.out.print("Enter a year: ");
        year = scan.nextInt();

        //===Short circuiting ========
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
