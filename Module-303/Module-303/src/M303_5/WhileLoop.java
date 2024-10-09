package M303_5;

public class WhileLoop {

    public static void main(String[] args) {

       /*
        infinite loop
        while(true){
            System.out.println("Hello World");
        }*/

        String word = "abcdefghijk";
        int pos = 0;
        while(pos<word.length()) {
            pos = pos+1;
            System.out.print("Inside While Loop");
        }

        int x = 1;
        do{
            System.out.print("\nInside Do While Loop");
            x++;
        }while(x<5);
    }
}
