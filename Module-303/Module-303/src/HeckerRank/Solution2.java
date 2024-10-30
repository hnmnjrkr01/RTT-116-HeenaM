// <<<<<======== Click here to expand the locked stub code
package HeckerRank;

import java.util.*;

interface Sport{
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}



class Cricket implements Sport{
    int[] playerIDs;

    Cricket(){
        playerIDs = new int[12];
        playerIDs[0] = 0;
        for(int i = 1; i < playerIDs.length; i++){
            playerIDs[i] = 1;
        }
        System.out.println("A new Cricket Team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        float sumAge = 0, avgAge= 0;

        for(int i = 1; i < age.length; i++){
            sumAge += age[i];
        }
        avgAge = sumAge / age.length;

        System.out.printf("\nThe average age of the team is %.2f", avgAge);
        System.out.println();
    }

    @Override
    public void retirePlayer(int id) {

        if(playerIDs[id] == -1){
            System.out.println("Player has already retired");
        }else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has retired");
        }

    }

}

class Football implements Sport{

    int[] playerIDs;

    Football(){
        playerIDs = new int[12];
        playerIDs[0] = 0;
        for(int i = 1; i < playerIDs.length; i++){
            playerIDs[i] = 1;
        }
        System.out.println("A new Football Team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        float sumAge = 0, avgAge= 0;

        for(int i = 1; i < age.length; i++){
            sumAge += age[i];
        }
        avgAge = sumAge / age.length;

        System.out.printf("\nThe average age of the team is %.2f", avgAge);
        System.out.println();
    }

    @Override
    public void retirePlayer(int id) {

        if(playerIDs[id] == -1){
            System.out.println("Player has already retired");
        }else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has retired");
        }

    }

    void playerTransfer(int fee, int id){

        if(playerIDs[id] == 1){
            System.out.println("Player with id: "+id+" has been transferred with fee of "+fee);
        }else{
            playerIDs[id] = -1;
            System.out.println("Player has already retired.");
        }
    }

}


public class Solution2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        for(int i = 0; i < 2; i++)
        {
            String[] age = sc.nextLine().split(" ");
            if(i == 0){
                int j = 0;
                for(String s : age)
                    age1[j++] = Integer.parseInt(s);
            }
            else{
                int j = 0;
                for(String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }
        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        for(int i = 0; i < 6; i++){

            if(i < 3){
                int x = Integer.parseInt(sc.nextLine());

                c.retirePlayer(x);
            }
            else if(i < 5){
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            }
            else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
    }
}