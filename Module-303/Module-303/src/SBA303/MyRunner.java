package SBA303;

public class MyRunner {

    public static void main(String[] args) {
        ArrayToList al = new ArrayToList();

        String[] a = {"abcd","defg","hijk","lmno","pqrs","tuv","wxyz"};

        al.convert(a);
        al.replace(5);
        al.compact();



    }
}
