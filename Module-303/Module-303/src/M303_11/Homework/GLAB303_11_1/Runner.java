package M303_11.Homework.GLAB303_11_1;

public class Runner {
    public static void main(String[] args) {
        GenericMethodExample gme = new GenericMethodExample();

        gme.genericsMethod(25);
        gme.genericsMethod("Per Scholas"); // passing String
        gme.genericsMethod(2563.5);

        // initialize generic class
        // with String and Integer data

        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}
