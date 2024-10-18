package HeckerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingHeck {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int x = 0, y = 0, result = 0;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter two integers for division:");
            System.out.print("Number one");
            x = scan.nextInt();
            System.out.print("Number two");
            y = scan.nextInt();
            scan.nextLine();

            result = x / y;
            System.out.println("Result of division = " + result);


        } catch (InputMismatchException ime) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException " + ae.getMessage());
        }
    }
}