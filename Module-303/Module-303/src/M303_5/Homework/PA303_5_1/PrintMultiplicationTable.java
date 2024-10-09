package M303_5.Homework.PA303_5_1;

public class PrintMultiplicationTable {

    public static void main(String[] args) {

        for(int i = 1; i<=12; i++){
            for(int j=1; j<=12;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

}
