package M303_12;

public class CheckedExceptionExample2 {

    public void start(){
        method1();
    }

    public void method1() {
        System.out.println("method1");
        try{
            method2();
        }catch(CustomeException e){e.getMessage();}
    }

    public void method2() throws CustomeException{
        System.out.println("method2");
        throw new CustomeException("Error in method2");
    }




    public static void main(String[] args) {
        CheckedExceptionExample2 cee = new CheckedExceptionExample2();
       cee.start();

    }
}
