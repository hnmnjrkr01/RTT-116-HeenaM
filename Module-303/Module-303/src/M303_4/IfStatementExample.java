package M303_4;

public class IfStatementExample {

    public static void main(String[] args) {

        int radius = 10;

        if ( radius > 10 ){
            System.out.println("The radius is greater than 0");
        } else if ( radius > 20 ) {
            System.out.println("The radius is less than 0");

        } else{
            System.out.println("The radius is less than 0");
        }

        System.out.println("DONE!");

        //=========================Switch Case==============================
        int grade =70;

        switch(grade){
            case 90:
                System.out.println("The grade is A");
                break;
                case 80:
                    System.out.println("The grade is B");
                    break;
                    case 70:
                        System.out.println("The grade is C");
                        break;
                        case 60:
                            System.out.println("The grade is D");
                            break;
                            default:
                                System.out.println("The grade is F");
                                break;

        }











    }
}
