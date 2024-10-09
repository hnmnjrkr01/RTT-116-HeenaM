package M303_6.Homework.GLAB303_6;

import java.util.Scanner;

public class InsertElementToArray {

    public static void main(String[] args){

        int counter, element;
        int[] array = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the element: ");
        for(counter = 0; counter < array.length-1; counter++){
            array[counter] = scan.nextInt();
        }

        System.out.print("Enter the element to insert at the last: ");
        element = scan.nextInt();
        array[array.length-1] = element;

        System.out.println("\nNow the array after insertion is: ");
        for(int ctr : array){
            System.out.print( ctr+" ");
        }
    }
}
