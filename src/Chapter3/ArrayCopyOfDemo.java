package Chapter3;

/**
 * Created by hasnake on 5/8/18.
 */
public class ArrayCopyOfDemo {
    public static void main(String[] args) {

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        //Use copyOfRange method from java.util.Arrays class:

        //int[] newArray = Arrays.copyOfRange(oldArray, startIndex, endIndex);
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        char[] copyTos = java.util.Arrays.copyOfRange(copyFrom, 0, 2);





        System.out.println(new String(copyTo));
        System.out.println(new String(copyTos));
    }
}
