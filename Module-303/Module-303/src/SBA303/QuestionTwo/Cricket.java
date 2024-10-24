package SBA303.QuestionTwo;

import java.text.DecimalFormat;

public class Cricket implements Sport{

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
        DecimalFormat fd = new DecimalFormat("##.##");

        for(int i = 1; i < age.length; i++){
            sumAge += age[i];
        }
        avgAge = sumAge / age.length;

        System.out.println("\nThe average age of the team is " + fd.format(avgAge));
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
