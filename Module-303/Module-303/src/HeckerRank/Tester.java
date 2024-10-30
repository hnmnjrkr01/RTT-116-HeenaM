package HeckerRank;

import java.util.*;

interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}


// ================ PLEASE WRITE CODE HERE =============

//Write your implementation of the InvalidStringException and the ArrayToList classes below

class InvalidStringException extends Exception{
    public InvalidStringException(String message){
        super(message);
    }

}

class ArrayToList implements MyList {

    ArrayList<String> arrayToList;

    ArrayToList() {
        arrayToList = new ArrayList<String>();
    }

    public void convert(String[] a) {
        for (int i = 0; i < a.length; i++) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: " + a[i] + " at the index: " + i);
        }
    }

    public void replace(int idx) {
        String empty = "";
        String temp = arrayToList.get(idx);
        arrayToList.set(idx, empty);
        System.out.println("I have replaced the string: " + temp + " with a null string");
    }

    public ArrayList<String> compact() {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (!arrayToList.get(i).isEmpty()) {
                a.set(i, arrayToList.get(i));
            }
        }
        return a;
    }
}
// <<<<<======== Click here to expand the locked stub. Please take a look at the locked stub code to better understand how your implementation of the required classes will be validated.
//PlEASE DO NOT ATTEMPT TO MODIFY THE CODE BELOW !!!!!!.
public class Tester{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        for(int i = 0; i < x; i++)
            obj.replace(rand.nextInt(n));


        ArrayList<String> s = obj.compact();



        for (int i = 0; i < s.size(); i++){
            if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
                try{
                    throw new InvalidStringException("This is an invalid string");
                }
                catch(InvalidStringException e){System.out.println(e.getMessage());}
            }
        }


    }
}