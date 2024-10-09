package M303_6;

public class DynamicArray {

    public static double[] insert(double[] array, int position, double value){

        if((position>= array.length)||(position<0)){
            return null;
        }
        double[] result = new double[array.length+1];

        for(int pos = 0; pos < array.length; pos++){
            result[pos] = array[pos];
        }

        result[position] = value;

        for(int pos = position; pos < array.length; pos++){
            result[pos+1] = array[pos];
        }

        return result;
    }

    public static double[] delete(double[] array, int position){

        if((position>= array.length)||(position<0)){
            return null;
        }

        double[] result = new double[array.length-1];

        for(int pos = 0; pos < position; pos++){
            result[pos] = array[pos];
        }

        for(int pos = position+1; pos < array.length; pos++){
            result[pos-1] = array[pos];
        }

        return result;
    }

    public static double[] append(double[] array, double value){

        double[] result = new double[array.length+1];

        for(int pos = 0; pos < array.length; pos++){
            result[pos] = array[pos];
        }

        result[array.length] = value;

        return result;
    }

    public static void main(String[] args) {

        double[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("=========insert==============");
       numbers =  insert(numbers,3,3.5);

       for(double i: numbers){
           System.out.println("number "+i);
       }

        System.out.println("==========Delete=============");
       numbers =  delete(numbers,10);

       System.out.println("=======================");
        for(double i: numbers){
            System.out.println("number "+i);
        }

        System.out.println("===========Append============");
        numbers =  append(numbers,3.758);
        for(double i: numbers){
            System.out.println("number "+i);
        }
        System.out.println("=======================");

    }
}
