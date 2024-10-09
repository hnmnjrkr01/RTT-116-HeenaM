package M303_5.Homework.PA303_5_1;

import java.util.Scanner;

public class GreatestCommonFactor {

    static int gcd(int a, int b) {
        int i=0;

        if(a<b){
            i=a;
        }else{
            i=b;
        }

        for(i=i;i>1;i--){
            if((a%i == 0)&&(b%i == 0)){
                return i;
            }
        }
        return 1;

    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.print("Enter the first number: ");
        a=scan.nextInt();
        System.out.print("Enter the second number: ");
        b=scan.nextInt();
        scan.close();

        System.out.println("The greatest common factor is "+gcd(a,b));
    }
}
