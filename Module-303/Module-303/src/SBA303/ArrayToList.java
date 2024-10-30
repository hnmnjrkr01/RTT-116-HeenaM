package SBA303;

import java.util.ArrayList;

public class ArrayToList implements MyList {

    ArrayList<String>  arrayToList;

    ArrayToList(){
        arrayToList = new ArrayList<String>();
    }

    @Override
    public void convert(String[] a) {
        for (int i = 0; i < a.length; i++) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: "+a[i]+" at the index: "+i);
        }
    }

    @Override
    public void replace(int idx) {
        String empty = "";
        arrayToList.set(idx, empty);
        System.out.println("I have replaced the string: "+empty+" with a null string.");
    }

    @Override
    public ArrayList<String> compact() {
        ArrayList<String> a = arrayToList;
        for (int i = 0; i < arrayToList.size(); i++) {
            if (!arrayToList.get(i).isEmpty()) {
                a.add(arrayToList.get(i));
            }
        }
        return a;
    }
}
