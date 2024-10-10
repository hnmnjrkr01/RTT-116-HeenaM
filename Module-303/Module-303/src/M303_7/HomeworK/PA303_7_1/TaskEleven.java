package M303_7.HomeworK.PA303_7_1;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of hobbies: ");
        int n = scan.nextInt();

        String hobbiesArray[] = new String[n];

       for (int i = 0; i < n; i++){
           System.out.print("Enter the name of hobby: ");
           hobbiesArray[i] = scan.next();
           scan.nextLine();
           System.out.print("\n");
       }

       System.out.println("==================================");
       System.out.println("Your favorite  things are:");
        for(String hobby : hobbiesArray){
           System.out.print(hobby+" ");
       }
    }
}

