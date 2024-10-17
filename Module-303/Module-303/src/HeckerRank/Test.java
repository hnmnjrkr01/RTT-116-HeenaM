package HeckerRank;

import java.util.*;


interface Building{
    void floorCompleted(int floorNumber);
    void printStatus(int floorNumber);
    void printNumberOfFloors();
}

/* model output for cut and paste
A ____ is being constructed
Construction for floor number ____ completed in ____
Floor number ____ does not exist in ____
Construction for floor number ____ completed in ____
Construction for floor number ____ not completed in ____ 
The ____ has ____ floors
*/

class School implements Building{

    int[] floors;

    public School(int n){
        floors = new int[n];
        System.out.println("A school is being constructed");
    }
    public void floorCompleted(int floorNumber){
        if(floorNumber<= floors.length){
            floors[floorNumber-1]=1;
            System.out.println("Construction for floor number "+floorNumber+" completed in school");
        }else{
            System.out.println("Floor Number "+floorNumber+" does not exist in school");
        }
    }
    public void printStatus(int floorNumber){
        if(floorNumber>floors.length){
            System.out.println("Floor Number "+floorNumber+" does not exist in school");
        } else if(floors[floorNumber-1]==1){
            System.out.println("Construction for floor number "+floorNumber+" completed in school");
        } else if(floors[floorNumber-1]==0){
            System.out.println("Construction for floor number "+floorNumber+" not completed in school");
        }
    }
    public void printNumberOfFloors(){
        System.out.println("The school has "+floors.length+" floors");
    }

}

class Hospital implements Building{

    int [] floors;

    public Hospital(int n){
        floors = new int[n];
        System.out.println("A hospital is being constructed");
    }
    public void floorCompleted(int floorNumber){

        if(floorNumber<= floors.length){
            floors[floorNumber-1]=1;
            System.out.println("Construction for floor number "+floorNumber+" completed in hospital");
        }else{
            System.out.println("Floor Number "+floorNumber+" does not exist in hospital");
        }
    }
    public void printStatus(int floorNumber){
        if(floorNumber>floors.length){
            System.out.println("Floor Number "+floorNumber+" does not exist in hospital");
        } else if(floors[floorNumber-1]==1){
            System.out.println("Construction for floor number "+floorNumber+" completed in hospital");
        } else if(floors[floorNumber-1]==0){
            System.out.println("Construction for floor number "+floorNumber+" not completed in hospital");
        }
    }
    public void printNumberOfFloors(){
        System.out.println("The hospital has "+floors.length+" floors");
    }
}

public class Test {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] floors = sc.nextLine().split(" ");
        School s = new School(Integer.parseInt(floors[0]));
        Hospital h = new Hospital(Integer.parseInt(floors[1]));
        s.printNumberOfFloors();
        h.printNumberOfFloors();

        String[] floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.printStatus(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.printStatus(Integer.parseInt(floorNumbers[i]));
        }
    }
}