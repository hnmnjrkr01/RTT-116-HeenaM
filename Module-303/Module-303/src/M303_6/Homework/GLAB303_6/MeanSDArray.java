package M303_6.Homework.GLAB303_6;

public class MeanSDArray {

    public static void main(String[] args){

        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean,stdDev;

        for(int i = 0; i < marks.length; i++) {
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = sum/marks.length;
        stdDev = Math.sqrt((sumSq / marks.length)- (mean*mean));

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);
    }
}
