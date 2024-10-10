package M303_7.HomeworK.PA303_7_1;

public class TaskFour {

    public static void main(String[] args) {

        int[] intArray = {10,20,30,40,50};
        System.out.println("First Element: "+intArray[0]+"\nLast Element: "+intArray[intArray.length-1]);

       /* //this will throw exception ArrayIndexOutOfBoundsException
        System.out.println("Last Element : "+intArray[intArray.length]);*/
        //Task 5
        int a[] = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] =  i ;
        }
        for(int a1:a){
            System.out.println(a1);
        }

        //Task 6
        int aa[] = new int[5];
        for(int i=0;i<aa.length;i++){
            aa[i] =  i*2 ;
        }
        for(int a1:aa){
            System.out.println(a1);
        }

        //Task 7
        int b[] = new int[5];
        for(int i=0;i<b.length;i++){
            b[i] =  i*2 ;
        }
        for(int j=0;j<b.length;j++){
            int mid = (b.length-1)/2;
            if(j ==mid){
                System.out.println("Cant show middle item");
            } else {
                System.out.println(b[j]);
            }
            }
    }
}
