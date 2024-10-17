package M303_11;

//KBA related stuff read slides deck carefully Slide-17
// E Element K Key N Number V Key-Valuepair  T-Anything else left


import java.util.HashMap;
import java.util.Map;

public class GenericValueObject <T,K extends Number>{
    private T typeT;
    private K typeK;

    public T getTypeT() {
        return typeT;
    }

    public void setTypeT(T typeT) {
        this.typeT = typeT;
    }

    public static void main(String[] args) {

        // way too rare to create such Generic Class

        GenericValueObject<String, Float> str = new GenericValueObject<>();
        str.setTypeT("String");
        String s1 = str.getTypeT();

        GenericValueObject<Integer, Double> value = new GenericValueObject<>();
        value.setTypeT(1);
        Integer i1 = value.getTypeT();

        Map<String, Integer> m = new HashMap<>();
        m.put("one", 1);



    }




}
