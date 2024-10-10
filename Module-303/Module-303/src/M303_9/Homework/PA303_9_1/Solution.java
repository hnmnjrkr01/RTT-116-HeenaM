package M303_9.Homework.PA303_9_1;

class Arithmetic{

    protected int add(int a,int b){
        return a+b;
    }
    private void privateMethod(){
        System.out.println("Private Method");
    }
}

class Adder extends Arithmetic{

    /*protected void protectedMethod(){
        privateMethod(); //'privateMethod()' has private access in 'M303_9.Homework.PA303_9_1.Arithmetic'
    }*/
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");


    }
}
