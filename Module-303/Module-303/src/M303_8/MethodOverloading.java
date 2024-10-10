package M303_8;

public class MethodOverloading {

    public static double sayWhatMatter(){
        return 44.444;
    }

    public static int sayWhatMatter(int a){
        return 44;
    }

    public static void main(String[] args) {
        System.out.println(sayWhatMatter());
       // System.out.println(sayWhatMatter());//signature name and parameters needs to be DIFFERENT

    }
}
