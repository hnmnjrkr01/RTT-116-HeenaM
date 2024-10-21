package M303_11.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaListHeckerRank {
   public static void main(String[] args) {
       int lenghtN = 0, element,index, queries ;
       String choice="";
       Scanner scan = new Scanner(System.in);


       System.out.println("Enter the number of elements in the array: ");
       lenghtN = scan.nextInt();
       List<Integer> listL = new ArrayList<>(lenghtN);

       System.out.println("Enter the elements in the array: ");
       for(int i=0;i<lenghtN;i++) {
           listL.add(scan.nextInt());
       }

       for(int i:listL) {System.out.println(i+" ");}
       System.out.println("Enter your Number of queries: ");
       queries = scan.nextInt();

       scan.nextLine();

       for(int i=0;i<queries;i++) {
           System.out.print("Choice :");
           choice = scan.next();
       if(choice.trim().equals("Insert")) {
           System.out.print("Element :");
            element=scan.nextInt();
           System.out.print("Index :");
            index=scan.nextInt();
            listL.add(index, element);                 //add element at given index
            System.out.println("Element inserted "+element+" at index "+index);
       }else if(choice.equals("Delete")) {
            System.out.print("Index :");
            index=scan.nextInt();
            int deleted = listL.remove(index);
            System.out.println("Element deleted "+deleted);
       }else {
           System.out.println("Invalid choice");
       }
       }

       System.out.println("------------After Performing All Quesries Updated List---------");
       for(int i : listL) {
           System.out.print(i+" ");
       }
   }

}
