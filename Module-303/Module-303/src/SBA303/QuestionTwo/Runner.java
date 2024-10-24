package SBA303.QuestionTwo;

public class Runner {

    public static void main(String[] args) {

        int[] playerAges = {21,12,52,53,55,18,17,16,19,41,23};

        Cricket cricket = new Cricket();
        Football football = new Football();

        cricket.calculateAvgAge(playerAges);
        cricket.retirePlayer(5);

        football.calculateAvgAge(playerAges);
        football.retirePlayer(5);
        football.playerTransfer(20000, 7);
    }
}
