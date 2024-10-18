package M303_12;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        try {
            //int x=10/0;
            //System.out.println(numbers[15]);                    //this line will throw exception ".ArrayIndexOutOfBoundsException"

            String str1=null; str1.toLowerCase();               //this will fire null pointer exception




            String str = "abc";
            str.charAt(10);
        }catch (ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("=====> "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Divide by 0 exception "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index out of bound "+e.getMessage());
        } catch (Exception e){
            System.out.println("---Something unexpected happened---------------");
            e.printStackTrace();
            e.getMessage();
        } finally {
            System.out.println("Optional Part BUT Finally Block will execute no matter what!!!!!!!!!!!");

        }





        }
}
