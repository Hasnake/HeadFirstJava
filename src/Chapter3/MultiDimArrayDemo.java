package Chapter3;

/**
 * Created by hasnake on 5/8/18.
 */
public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        //first array index 0
        System.out.println(names[0][0]);
        System.out.println(names[0][1]);
        System.out.println(names[0][2]);
        //second array index 1
        System.out.println(names[1][0]);
        System.out.println(names[1][1]);

        // Smith
        System.out.println(names[0][0] + names[1][0]);

        //  Jones
        System.out.println(names[0][1] + names[1][1]);
        System.out.println(names[0][2] + names[1][1]);


    }
}
