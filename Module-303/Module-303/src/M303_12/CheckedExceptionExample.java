package M303_12;

public class CheckedExceptionExample {

    //----------------This program throws exception---------------------

    public void start()throws CustomeException{
        method1();
    }

    public void method1() throws CustomeException{
        System.out.println("method1"); method2();
    }

    public void method2() throws CustomeException{
        System.out.println("method2");
        throw new CustomeException("Error in method2");
    }




    public static void main(String[] args) throws CustomeException{
        CheckedExceptionExample cee = new CheckedExceptionExample();
       cee.start();

    }
}
