package HeckerRank;

import java.util.*;

interface Sport1{
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}


class Cricket1 implements Sport1{
    final int NO_OF_PLAYERS = 11;
    int[] playerIDs;
    Cricket1(){
        playerIDs = new int[NO_OF_PLAYERS + 1];
        Arrays.fill(this.playerIDs, 1);
        this.playerIDs[0] = -1;
        System.out.println("A new cricket team has been formed");
    }
    public void calculateAvgAge(int[] ages){
        float avg, sum = 0;
        for(int i : ages)
            sum += i;
        System.out.format("The average age of the team is %.2f\n",sum/11f);
    }
    public void retirePlayer(int playerID){
        if(this.playerIDs[playerID] == 1){
            System.out.println("Player with id: "+playerID+" has retired");
            this.playerIDs[playerID] = -1;
        }
        else System.out.println("Player has already retired");
    }
}
class Football1 implements Sport1{
    final int NO_OF_PLAYERS = 11;
    int[] playerIDs;
    Football1(){
        playerIDs = new int[NO_OF_PLAYERS + 1];
        Arrays.fill(playerIDs,1);
        this.playerIDs[0] = -1;
        System.out.println("A new football team has been formed");
    }
    public void calculateAvgAge(int[] ages){
        float avg, sum = 0;
        for(int i : ages)
            sum += i;
        System.out.format("The average age of the team is %.2f\n",sum/11f);
    }
    public void retirePlayer(int playerID){
        if(this.playerIDs[playerID] == 1){
            System.out.println("Player with id: "+playerID+" has retired");
            this.playerIDs[playerID] = -1;
        }
        else System.out.println("Player has already retired");
    }
    public void playerTransfer(int fee,int id){
        if(this.playerIDs[id] == 1){
            System.out.println("Player with id: "+id+" has been transferred with a fee of "+fee);
            this.playerIDs[id] = -1;
        }
        else System.out.println("Player has already retired");
    }

}

public class Solution3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cricket1 c = new Cricket1();
        Football1 f = new Football1();

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