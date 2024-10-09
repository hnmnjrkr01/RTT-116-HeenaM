package M303_6.Homework.GLAB303_5_2;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int random = (int) Math.random() * 100;

        System.out.println("Enter a magic number between 0 to 100");
        int guess = -1;
        while(guess != random){
            System.out.println("Enter your guess :");
            guess = scan.nextInt();

            if(guess == random){
                System.out.println("You guessed the number " + guess);
            }
            else if(guess<random){
                System.out.println("Your guess is too low"+guess);
            }
            else{
                System.out.println("Your guess is too high"+guess);
            }
        }




    }
}
