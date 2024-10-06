package org.perscholas;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        System.out.print("Enter radius of circle: ");

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.nextLine();
        double area = x * x * 3.14159;

        System.out.println("Area of your circle: "+area);

        System.out.println("Enter your name: ");

        String name = scanner.next();

        System.out.println("Your name: "+name);
    }
}
