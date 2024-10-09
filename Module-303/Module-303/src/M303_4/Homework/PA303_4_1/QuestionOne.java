package M303_4.Homework.PA303_4_1;

import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {
        int x=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number : ");
        x = scan.nextInt();

        if(x<10) {
            System.out.println("Less than 10");
        } else if(x>10 && x<20){
            System.out.println("Between 10 and 20");
        }else{
            System.out.println("Greater than or equal to 20");
        }



    }
}
