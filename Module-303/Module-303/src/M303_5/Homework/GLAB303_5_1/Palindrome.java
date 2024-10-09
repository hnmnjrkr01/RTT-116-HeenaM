package M303_5.Homework.GLAB303_5_1;

import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {

    String original="";
    String reversed="";
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a Palindrome string to check : ");
    original = scan.nextLine();

    int length = original.length();

    for(int i = length-1; i>=0; i-- ){
        reversed += original.charAt(i);
    }

    if(original.equals(reversed)){
        System.out.println("Its is palindrome "+original);
    }else{
        System.out.println("Its not a palindrome "+original);
    }






}


}
