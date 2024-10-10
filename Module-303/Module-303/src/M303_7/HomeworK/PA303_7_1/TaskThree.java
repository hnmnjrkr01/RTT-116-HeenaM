package M303_7.HomeworK.PA303_7_1;

public class TaskThree {

    public static void main(String[] args) {

        String strArray[] = new String[]{"red","green","blue","yellow"};

        System.out.println("Array Length : "+strArray.length);

        String cloneArray[] = strArray.clone();
        System.out.println("Clone Array : "+cloneArray.toString());
        for(String str : cloneArray){
            System.out.println(str);
        }
    }
}
