package org.perscholas;

public class FormatorExample {

    public static void main(String[] args) {

        System.out.println("------------------------");
        String data = "Hello World!";
        System.out.printf("Printing a string: %s\n", data);
        System.out.printf("Printing a string in uppercase: %S\n", data);
        int x = 100;
        System.out.printf("Printing a decimal integer: %d\n", x);
        int hours = 100;
        double days = 100/24.0; // used 24.0 to avoid integer division
        System.out.print("days: ");
        System.out.printf("%.3f",days);
        // -------- Specifying Width --------
        System.out.printf("%-10.2f%n", 18.0); // left aligned: -
        System.out.printf("%10.2f%n", 20.0); // right aligned
        System.out.printf("%10.3f", 10.2); // no text
        System.out.printf("%n"); // only %n
        System.out.printf("%10.2f%5d%n", 15.7,3); // no text and %n
        System.out.printf("%10.2f%d%n", 15.7,3); // no space before 3
        System.out.printf("%10.2f", 15.7);
        System.out.printf("%n%10.2f%n%5d%n", 11.3,8);
        // --- mix different data types --------------
        System.out.printf("%s is %d years old","Jane", 23);

}
}
