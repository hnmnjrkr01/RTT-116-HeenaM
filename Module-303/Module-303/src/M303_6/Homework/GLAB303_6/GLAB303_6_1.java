package M303_6.Homework.GLAB303_6;

public class GLAB303_6_1 {

    public static void main(String[] args) {

        // create an array---Example 1
        int[] age = {12, 4, 5, 2, 5};
        // access each array elements
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        //using for-Loop Example 2
        // create an array
        int[] age1 = {12, 4, 5};

        System.out.println("Using for Loop:");
        for(int i = 0; i < age1.length; i++) {
            System.out.println(age1[i]);
        }


        //EnhancedForLoop - Example 3
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
        for (String name : names) {
            System.out.println(name);
        }

        //


    }
}
