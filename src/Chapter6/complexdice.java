package Chapter6;
import java.util.*;
public class complexdice {
    public static void main(String[] args) {
        int[] random3 = new int[5];
        int x = 0;

        //In the Java programming language, arrays are objects,are dynamically created,
        // and may be assigned to variables of type Object.
        for (int i = 0; i < random3.length; i++) {
            random3[i] = (int) ((Math.random() * 6) + 1);

        }
        //int [] myIntArray={3,2,2,4,2};
        int[] myIntArray = {random3[0], random3[1], random3[2], random3[3], random3[4]};
        System.out.println(Arrays.toString(myIntArray));

        if (    myIntArray[0] == myIntArray[1] && myIntArray[1] == myIntArray[2] ||
                myIntArray[0] == myIntArray[1]&&myIntArray[1] == myIntArray[3]||
                myIntArray[0] == myIntArray[1]&&myIntArray[1] == myIntArray[4]||
                myIntArray[0] == myIntArray[2] && myIntArray[2] == myIntArray[3] ||
                myIntArray[0] == myIntArray[2]&&myIntArray[2] == myIntArray[4]||
                myIntArray[0] == myIntArray[3]&&myIntArray[3] == myIntArray[4]||

                myIntArray[1] == myIntArray[2] && myIntArray[2] == myIntArray[3] ||
                myIntArray[1] == myIntArray[2]&&myIntArray[2] == myIntArray[4]||
                myIntArray[1] == myIntArray[3]&&myIntArray[3] == myIntArray[4]||
                myIntArray[2] == myIntArray[3] && myIntArray[3] == myIntArray[4])

        {
            System.out.println("Yathez");
        }
        else if (myIntArray[0] == myIntArray[1] || myIntArray[0] == myIntArray[2]||
            myIntArray[0] == myIntArray[3] || myIntArray[0] == myIntArray[4]||
            myIntArray[1] == myIntArray[2] || myIntArray[1] == myIntArray[3]||myIntArray[1] == myIntArray[4] ||
                myIntArray[2] == myIntArray[3] || myIntArray[2] == myIntArray[4]||
                myIntArray[3] == myIntArray[4] )
        {
                System.out.println("you get a pair");
        } else if (myIntArray[x] + 1 == myIntArray[x+1] && myIntArray[x] + 2 == myIntArray[2] && myIntArray[2] + 1 == myIntArray[3] && myIntArray[3] + 1 == myIntArray[4])
        {
              System.out.println("Straight!");
        }
        else {
                System.out.println("You lose");
            }
            int sum = 0;
            for (int dicevalue : myIntArray) sum += dicevalue;
            System.out.println("Sum of the five dice values is" + ":" + sum);
        }
    }
