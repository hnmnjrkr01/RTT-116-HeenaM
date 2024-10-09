package M303_5.Homework.PA303_5_1;

import java.util.Scanner;

public class BubbleSort {

    private static int[] bubbleSort(int[] number){
        int temp = 0;
        for(int i=0;i<number.length-1;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i] > number[j]){
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }


        return number;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] number = new int[5];

        for(int counter=0;counter<5;counter++){
            System.out.print("Enter number: ");
            number[counter] = scan.nextInt();
            System.out.print("\n");
        }

        System.out.println("Bubble Sorted array: "+ bubbleSort(number).toString());



    }
}
