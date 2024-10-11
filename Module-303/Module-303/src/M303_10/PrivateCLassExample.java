package M303_10;

//Such Inner classes are HARDLY EVER used
public class PrivateCLassExample {
    public class InnerPublilClass {
        public int a,b;

        void display() {
            System.out.println("Inside InnerPublilClass");
        }
    }
    private class InnerPrivateClass {
        private  String a, b;

        void display() {
            System.out.println("Inside InnerPrivateClass");
        }
    }

    public void foo(){
        InnerPublilClass ipc = new InnerPublilClass();

        InnerPrivateClass iprcl = new InnerPrivateClass();
    }
    public static void main(String[] args) {

        PrivateCLassExample pce = new PrivateCLassExample();
        pce.foo();

        InnerPublilClass ipc = new PrivateCLassExample().new InnerPublilClass(); //creating inner class object by ref main class 1st "." inner class

        ipc.display();

        InnerPrivateClass iprcl = new PrivateCLassExample().new InnerPrivateClass();
        iprcl.display();

    }

}
