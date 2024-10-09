package M303_5.Homework.GLAB303_5_1;

public class Pyramid {

    public static void main(String[] args) {

        //Right angled pyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print("#");
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("--------------------------");

        //Reversed Pyramid
        for(int i=1;i<=5;i++){
            System.out.print("\n");
            for (int j=5;j>=i;j--)
                System.out.print("#");

        }
        System.out.println();
        System.out.println("--------------------------");

        //Isosceles triangle
        for(int i = 1; i<=5; i++){
            for(int j=5; j>i;j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("# ");
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("--------------------------");
    }
}
