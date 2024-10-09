package M303_7;

public class Average {

    public static void main(String[] args) {

        double [] values = {1.2,3.4,5.6,7.8,9.0};
        double sum = 0;

        for(double sum1: values){
            sum+=sum1;
        }
        System.out.println("Average is "+(sum/values.length)+"  sum = "+sum);



        int arr[] = {1,2,3,4,5,6,7,8,9};
        int min=arr[0], max=arr[0];// to make sure elements are compared to designated values only

        for(int v: arr){
            if(v<min){
                min=v;
            } else if (v>max) {
                max=v;
            }
        }
        System.out.println("Minimum is "+min+" Maximum is "+max);



    }
}
