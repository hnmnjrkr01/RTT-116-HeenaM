package M303_6.Homework.GLAB303_5_2;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {

        int correctCounter = 0;
        int count = 0;
        String output = "";
        char option;
        Scanner scan = new Scanner(System.in);

        while(count < 3){

            int num1 = (int) (Math.random()*10);
            int num2 = (int) (Math.random()*10);

            if(num1>num2){
                int temp = num1;
                num2 = num1;
                num1 = temp;
            }

            System.out.println("What is "+num1 +" - "+num2+"?");
            int answer = scan.nextInt();

            if(answer == (num1-num2)){
                System.out.println("Your answer is correct");
                correctCounter++;
            }else{
                System.out.println("Your answer is not correct "+num1 + " - "+num2+" should be "+(num1-num2));
            }
            count++;
            output += "\n" + num1+ "-" + num2 + "=" + answer +
                    ((num1 - num1 == answer) ? " correct" : " wrong");

            if(count==3) {
                System.out.println(output);
                System.out.print("Do you want to continue? (Y/N): ");
                option = scan.next().charAt(0);
                if(option == 'Y'){
                    count = 0;
                }

            }
        }
    }
}
